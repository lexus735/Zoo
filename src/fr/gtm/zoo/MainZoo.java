package fr.gtm.zoo;

public class MainZoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo zoo = new Zoo();
		Animal a1 = new Grenouille ("Kermit");
		Animal a2 = new Tigre ("Tigrou");
		
		
		
		
		zoo.add(a1);
		zoo.add(a2);
		
		System.out.println("Alimentation");
		zoo.nourrirTous();
		System.out.println("=============================================================================");
		System.out.println("Bruit");
		zoo.fairecrierTous();
		
	}

}
