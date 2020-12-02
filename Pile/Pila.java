/*
Author Fabio Petricola
*/

public class Pila<E>{

protected NodoPila cima;
private class NodoPila{
	E dato;
	NodoPila pros;
}

public Pila(){
	cima=null;
}

public void push(E x){
	NodoPila nuovo=new NodoPila();
	nuovo.dato=x;	
	if(cima==null){
		cima=nuovo;
	}else{
		nuovo.pros=cima;
		cima=nuovo;
	}
}

public E pop(){
	if(cima==null){

		  new EmptyStackException("Pila vuota");
		  return null;
	}
	else{
		E risultato=cima.dato;
		cima=cima.pros;
		return risultato;
	  }
}

public boolean empty(){
	return cima==null;
}

public void visualizza(){
	while(!this.empty()){

		System.out.println(this.pop().toString());

	}

}




}