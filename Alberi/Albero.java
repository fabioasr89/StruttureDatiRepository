/*
Author Fabio Petricola
*/

public class Albero<E extends Comparable<? super E>>{
protected NodoAlbero a;

private class NodoAlbero{
	E dato;
	NodoAlbero sx;
	NodoAlbero dx;
}

public Albero(){
   a=null;
}

public void inserisci(E x){
	 if(a!=null){
		NodoAlbero p=a;
		NodoAlbero q=null;
		NodoAlbero nuovo=new NodoAlbero();
		
		while(p!=null){
			if(p.dato.compareTo(x)>0){
				q=p;
				p=p.sx;
				if(p==null){
					q.sx=nuovo;
					nuovo.dato=x;
					nuovo.sx=null;
					nuovo.dx=null;					
				}
			}
			else{
				q=p;
				p=p.dx;
				if(p==null){
					q.dx=nuovo;
					nuovo.dato=x;
					nuovo.sx=null;
					nuovo.dx=null;				
				}
		     }
		    }
	}else{
    	a=new NodoAlbero();
		a.dato=x;
		a.sx=null;
		a.dx=null;
		}
}

public void visualizza(){
	Pila<NodoAlbero> pila=new Pila<NodoAlbero>();
	Lista<E> lista=new Lista<E>();
	if(a!=null){
		pila.push(a);
		while(!pila.empty()){
			NodoAlbero p=pila.pop();		
			if(p!=null){
				lista.inserisci(p.dato);
				if(p.dx!=null){
					pila.push(p.dx);
			    }
			    if(p.sx!=null){
			    	pila.push(p.sx);
			    }
			}	
		}
		lista.visualizza();
	}	
}


public void visualizzaSimm(){
	Pila<NodoAlbero> pila=new Pila<NodoAlbero>();
	if(a!=null){
		NodoAlbero p=a;
		while(p!=null || !pila.empty()){
			if(p!=null){
			pila.push(p);
			p=p.sx;
			}
			else{
				  p=(NodoAlbero)pila.pop();
				System.out.println(p.dato);
				p=p.dx;
			}
		}
	}
	
	
}
							


public int contaFoglie(){
	Pila<NodoAlbero> pila=new Pila<NodoAlbero>();
	int count=0;
	if(a!=null){
		pila.push(a);
		while(!pila.empty()){
			NodoAlbero p=pila.pop();
			NodoAlbero q=null;
			if(p!=null){
				if(p.dx!=null){
					q=p.dx;
					pila.push(p.dx);
					if(q.dx==null && q.sx==null){
						count++;			
					}
				}
				if(p.sx!=null){
					q=p.sx;
					pila.push(p.sx);
					if(q.dx==null && q.sx==null){	
						count++;
					}
				}
			}
		}
	return count;
	}else{
		return 0;
	}
}

public int profondita(){
	//percorro l'albero sinistro e ne valuto la profondità
	Pila<NodoAlbero> pila=new Pila<NodoAlbero>();
	int countRight=0;
	int countLeft=0;
	int profSx=0;
	int profDx=0;
	if(a!=null){
		a=a.sx;
		countRight=1; // se la radice non è nulla, l'albero ah profondità comunque >=1
		countLeft=1;
		pila.push(a);
		while(!pila.empty()){
			NodoAlbero p=pila.pop();		
			if(p!=null){
				if(p.dx!=null){
					pila.push(p.dx);
					countRight++;	
				}
				if(p.sx!=null){
					pila.push(p.sx);
					countLeft++;
				}
			}
		}
		if(countLeft>countRight){
			profSx=countLeft;
		}else{
			profSx=countRight;
		}
		//percorro l'albero a destra
		a=a.dx;
		pila.push(a);
		countLeft=1;
		countRight=1;

		while(!pila.empty()){
			NodoAlbero s=pila.pop();
			if(s!=null){
				if(s.dx!=null){
					pila.push(s.dx);
					countRight++;
				}
				if(s.sx!=null){
					pila.push(s.sx);
					countLeft++;
				}
			}
		}
		if(countLeft>countRight){
			profDx=countLeft;
		}else{
			profDx=countRight;
		}	
    }
    if(profDx>profSx){
    	return profDx+1;  //non avendo tenuto conto negli incrementi dei nodi foglia, aggiungiamo +1 al risultato finale
    }
    if(profSx>profDx){
    	return profSx+1;
    }
    else{
    	return 0;
    }
  }


}