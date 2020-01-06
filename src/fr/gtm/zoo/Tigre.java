package fr.gtm.zoo;

public class Tigre extends Animal {

	public Tigre(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manger() {
		// TODO Auto-generated method stub
		System.out.println("Le tigre mange beaucoup de viande");
	}

	@Override
	public void crier() {
		// TODO Auto-generated method stub
		System.out.println("Le tigre rugit Roaa Roaa ");
	}

}
