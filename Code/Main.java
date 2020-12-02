public class Main{

	public static void main(String[] args){

		Coda<Integer> coda=new Coda<Integer>();
		coda.inserisci(1);
		coda.inserisci(5);
		coda.inserisci(10);
		coda.inserisci(20);
		coda.inserisci(0);
		coda.visualizza();
		coda.elimina();
		System.out.println();
		coda.visualizza();
	}




}