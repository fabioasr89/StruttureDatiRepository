public class Main{


		public static void main(String[] args){

					Main m=new Main();
					m.execute(1);
					m.execute(2);
					m.execute(3);
					m.execute(4);
					

		}




		public Lista fillLista1(){
			Lista a=new Lista();
					a.inserisciInFondo(50);
					a.inserisciInFondo(0);
					a.inserisciInFondo(10);
					a.inserisciInFondo(21);
					a.inserisciInFondo(11);
					a.inserisciInFondo(15);
					a.inserisciInFondo(1);
					return a;
		}


		public Lista fillLista2(){
			Lista a=new Lista();
					a.inserisciInFondo(30);
					a.inserisciInFondo(20);
					a.inserisciInFondo(50);
					a.inserisciInFondo(1);
					a.inserisciInFondo(11);
					a.inserisciInFondo(15);
					a.inserisciInFondo(31);
					return a;
		}

		public Lista fillLista3(){
			Lista a=new Lista();
					a.inserisciInFondo(50);
					a.inserisciInFondo(20);
					a.inserisciInFondo(10);
					a.inserisciInFondo(1);
					a.inserisciInFondo(11);
					a.inserisciInFondo(15);
					a.inserisciInFondo(31);
					return a;
		}

		public Lista fillLista4(){
			Lista a=new Lista();
					a.inserisciInFondo(12);
					a.inserisciInFondo(20);
					a.inserisciInFondo(10);
					a.inserisciInFondo(1);
					a.inserisciInFondo(11);
					a.inserisciInFondo(15);
					a.inserisciInFondo(50);
					return a;
		}


		public void execute(int fill){

			Lista a=null;
			switch(fill){
				case 1:
					a=fillLista1();
					break;
				case 2:
					a=fillLista2();
					break;
				case 3:
					a=fillLista3();
					break;
				case 4:
					a=fillLista4();
					break;


			}
			System.out.println("Lista non ordinata");
			a.visualizza();
			a.scambioMinMax();
			System.out.println("Lista ordinata");
			a.visualizza();
			System.out.println();


		}

}


	






