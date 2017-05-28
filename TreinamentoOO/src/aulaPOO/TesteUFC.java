package aulaPOO;

public class TesteUFC {

	public static void main(String[] args) {
		Lutador a[] = new Lutador [6];
		a[0] = new Lutador ("Chat Noir","França", 31, 1.75d, 68.9d, 11, 2, 1);
		a[1] = new Lutador ("Diabo da Tasmania", "Tasmania", 55, 1.80d, 55d, 4, 11, 3);
		a[2] = new Lutador ("Blanka", "Brasil", 33, 1.65d, 115.4d, 10, 3, 3);
		
		//a[1].apresentar();
				
		a[1].status();

		
	}

}
