package exercicio;


public class Main {
	public static void main(String[] args) {

			/* N�o consegui fazer com que o programa mostrasse tudo certinho como pedido porque n�o 
		   tive tempo pra isso, mas a base do programa esta ai certinho.*/
		
			BombaGasolina gasolina = new BombaGasolina(100, 2, "Aditivada");
			BombaDiesel diesel = new BombaDiesel(50,4,"S10");
			BombaEtanol etanol = new BombaEtanol(20,8,"Cana-de-A�ucar");
			Bomba b = new Bomba(5, 5);

			System.out.println(gasolina);
			
			System.out.println(diesel);
			
			System.out.println(etanol);
			System.out.println(b);

		}
		
	}