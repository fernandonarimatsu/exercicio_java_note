package oo.herança;

public class Jogo {
	
	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;		
		
		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;		
				
		
		System.out.println("Total de vida " + monstro.vida);
		System.out.println("Total de vida " + heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		
		System.out.println("----------------------");
		
		System.out.println("Monstro tem " + monstro.vida + " de vida.");
		System.out.println("Heroi tem " + heroi.vida + " de vida.");
	}
		
}
