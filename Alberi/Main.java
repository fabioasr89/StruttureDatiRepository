public class Main{


	public static void main(String[] args){

		Albero<Integer> a=new Albero<Integer>();
		a.inserisci(20);
		a.inserisci(0);
		a.inserisci(2);
		a.inserisci(11);
		a.inserisci(50);
		a.inserisci(1);
		a.inserisci(40);
		a.inserisci(60);
		a.visualizzaSimm();
		
		System.out.println();
		System.out.println("Numero delle foglie: "+" "+a.contaFoglie());
 		System.out.println();
 		System.out.println("Profondità albero:"+a.profondita());

	}

/*
    public void visualizzaSimm(){
	Pila<NodoAlbero> pila=new Pila<NodoAlbero>();
	if(a!=null){
		NodoAlbero p=a;
		while(!pila.empty() || p!=null){
			if(p.sx!=null){
				pila.push()
			p=p.sx;

			}
			else{
				NodoAlbero a=pila.pop();
				System.out.println(a.dato.toString());
				a=p.dx;
			}
		}
	}
	
	
}   */             




}