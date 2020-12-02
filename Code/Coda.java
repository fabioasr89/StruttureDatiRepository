/*
Author Fabio Petricola
*/

public class Coda<E>{

	protected NodoCoda primo;
	protected NodoCoda ultimo;

	private class NodoCoda{
		E dato;
		NodoCoda pros;
	}

	public Coda(){
		primo=ultimo=null;
	}

	public void inserisci(E x){
		NodoCoda nuovo=new NodoCoda();
		nuovo.dato=x;
		nuovo.pros=null;
		if(primo==null){
			primo=ultimo=nuovo;
			

		}else if(primo!=null){
			ultimo.pros=nuovo;
			ultimo=nuovo;
		}
	}


	public void elimina(){

		if(primo==null){
			new CodaException("La cosa è vuota");
		}else{
			primo=primo.pros;
		}
	}

	public boolean empty(){

		return primo==null;
	}


	public void visualizza(){
		
		
		if(!this.empty()){
			NodoCoda p=primo;
			while(p!=null){
				System.out.println(p.dato.toString());
				p=p.pros;
			}
		}

	}
}