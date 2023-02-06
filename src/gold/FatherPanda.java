/**
 * Exercice 1 :
 *  Déclarer Des Attributs De Classe
Instructions
Déclarez ce qui suit dans la FatherPandaclasse donnée :

Déclarez une variable publique de type booléen et nommez-la isPredator.

Déclarez une variable de type int protégée et nommez-la poids.

Déclarez une variable privée de type int et nommez-la age.

Déclarez une fonction publique void, nommez-la manger et affichez les instructions suivantes (chaque instruction sur une nouvelle ligne) :

Après chaque repas, Père Panda prend du poids : (écrire le poids devant)

Et son âge est : (inscrire l'âge devant)
 */






package gold;

public class FatherPanda {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	    public boolean isPredator;

	    protected int poids;

	    private int age;

	    public void eat() {

	        System.out.println("Après chaque repas, is " + isPredator);

	        System.out.println("that , Père Panda prend du poids" + poids);

	        System.out.println("Et son âge est" + age);

	    }

	    public static void main(String[] args) {
	        FatherPanda fatherPanda = new FatherPanda();
	        fatherPanda.eat();
	    }

	//}
	}


