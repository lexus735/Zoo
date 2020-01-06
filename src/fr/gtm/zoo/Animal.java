package fr.gtm.zoo;

public abstract  class  Animal {

		private String nom; 
		
	
		
		public Animal(String nom) {
			// TODO Auto-generated constructor stub
			this.nom = nom;
		}

		public abstract void manger();
		public abstract void crier();
		
}
