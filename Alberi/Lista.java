/*
Author Fabio Petricola
*/

public class Lista<E extends Comparable<? super E>>{

protected NodoLista inizio;

private class NodoLista{
	E dato;
	NodoLista pros;
}


public Lista(){
	inizio=null;
}

public void inserisci(E x){
	NodoLista nuovo=new NodoLista();
	nuovo.dato=x;
	
		NodoLista p=inizio;
		NodoLista q=null;
		while(p!=null &&p.dato.compareTo(x)<0){
			q=p;
			p=p.pros;
		}
		nuovo.pros=p;
		if(q==null){
			inizio=nuovo;
		}else{
			q.pros=nuovo;
		}
	
}


public void inserisciInizio(E x){
	NodoLista nuovo=new NodoLista();
	nuovo.dato=x;
	if(inizio!=null){
		nuovo.pros=inizio;
		inizio=nuovo;
	}else{
		inizio=nuovo;
	}
}

public void elimina(E x){

	if(inizio!=null){
		NodoLista p=inizio;
		NodoLista q=null;
		int count=0;
		while(p!=null){
			q=p;
			p=p.pros;
			if(p!=null && p.dato.compareTo(x)==0){
				count++;
					break;
			}
		}if(count!=0){
			q.pros=p.pros;
		}
	}
}



public void visualizza(){

	if(inizio!=null){
		NodoLista p=inizio;
		while(p!=null){
			System.out.println(p.dato.toString());
			p=p.pros;
		}
	}
}

public int size(){

	int count=0;
	if(inizio!=null){

		NodoLista p=inizio;
		while(p!=null){
			count++;
			p=p.pros;
		}
	}
	return count;
}


public E max(){
	if(inizio!=null){
		NodoLista p=inizio;	
		NodoLista max=inizio;
		while(p!=null){
			if(p.dato.compareTo(max.dato)>0){
				max=p;
			}
			p=p.pros;
		}
		return max.dato;
	}else{
		return null;
	}
}

public E min(){
	if(inizio!=null){
		NodoLista p=inizio;
		NodoLista min=inizio;
		while(p!=null){
			if(p.dato.compareTo(min.dato)<0){
				min=p;
			}
			p=p.pros;
		}
		return min.dato;
	}else{
		return null;
	}
}


public NodoLista nodoMin(){

	if(inizio!=null){
		E min=this.min();
		NodoLista p=inizio;
		NodoLista q=null;
		NodoLista minimo=inizio;
		while(p!=null){
			q=p;
			if(q.dato.equals(min)){
				minimo=q;
				break;
			}
			p=p.pros;
		}
		
			return minimo;
	}else{

		return null;
	}

}


public NodoLista nodoMax(){
	if(inizio!=null){
		E max=this.max();
		NodoLista p=inizio;
		NodoLista q=null;
		NodoLista massimo=inizio;
		while(p!=null){
			q=p;
			if(q.dato.equals(max)){
				massimo=q;
				break;
			}
			p=p.pros;
		}
		
			return massimo;
	}else{

		return null;
	}

}

public void scambioMinMax(){
	//troviamo i nodi che precedono minimo e massimo
	if(inizio!=null){
		NodoLista min=this.nodoMin();
		NodoLista max=this.nodoMax();
		NodoLista qMinPrec=null;
		NodoLista qMaxPrec=null;
		NodoLista p=inizio;
		NodoLista q=null;
		while(p!=null){
			q=p;
			p=p.pros;
			if(p!=null && p.dato.compareTo(max.dato)==0){
				qMaxPrec=q;

			}
			if(p!=null && p.dato.compareTo(min.dato)==0){
				qMinPrec=q;
			}
		}
		p=inizio;
		q=inizio;
		//scambio minimo massimo
		if(min==inizio){
			if(min.pros==max){
				min.pros=max.pros;
				inizio=max;
				inizio.pros=min;
			}
			else{
				p=min.pros;
				min.pros=max.pros;
				qMaxPrec.pros=min;
				inizio=max;
				max.pros=p;
			}
		}
		else if(max==inizio){
			if(max.pros==min){
				max.pros=min.pros;
				inizio=min;
				min.pros=max;		
			}
			else{
				p=max.pros;
				max.pros=min.pros;
				inizio=min;
				min.pros=p;
				qMinPrec.pros=max;
			}
		}
		else if(min!=inizio && max!=inizio){
				if(min.pros==max){
					min.pros=max.pros;
					qMinPrec.pros=max;
					max.pros=min;
				}
				if(max.pros==min){
					max.pros=min.pros;
					qMaxPrec.pros=min;
					min.pros=max;
				}
				else{
					p=min.pros;
					min.pros=max.pros;
					qMaxPrec.pros=min;
					qMinPrec.pros=max;
					max.pros=p;
				}
		}


	}


}

}


