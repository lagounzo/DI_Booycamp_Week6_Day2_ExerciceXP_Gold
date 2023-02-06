/**
 * Déclarez une variable locale de type int privé, nommez-la mySecretNumber, affectez-lui la valeur 10 et déclarez-la en dehors des fonctions.

Dans la fonction displaySecret, réaffectez la valeur 45 à mySecretNumber.

Créez une variable de référence de RLVariables et nommez-la secrète. Accédez à la variable d'instance (mySecretNumber) en utilisant la variable de référence secret avec la ligne suivante :

Variable de référence accédant à la variable d'instance : (imprimez la variable de référence ici). Imprimez maintenant la variable locale sur la nouvelle ligne :

Variable locale : (imprimez la variable locale ici). Affectez la valeur de la variable locale à la variable d'instance de la variable de référence et imprimez ce qui suit sur la nouvelle ligne :

Variable de référence accédant à la variable d'instance qui pointe vers la variable locale : (imprimez la variable de référence ici)
 */



package gold;

public class Variable {

	 int mySecretNumber = 10;

	    public void displaySecret() {
	        // write your code here
	        int mySecretNumber = 45;

	        System.out.println("Local Variable : " + mySecretNumber);
	    }

	    /**
	     * 
	     */
	    public static void main(String[] args) {
	        Variable notSoPrivate = new Variable();
	        System.out.println("Reference variable accessing instance variable : " + notSoPrivate.mySecretNumber);
	        notSoPrivate.displaySecret();
	    }
}
