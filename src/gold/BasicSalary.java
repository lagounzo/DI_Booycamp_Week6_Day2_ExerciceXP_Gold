/**
 * @author N'ZO LAGOU PRIVAT N'GUESSAN
 */




/**
 * Exercice 3 : Salaire De Base
 * 
Écrivez un programme pour saisir le salaire de base d'un employé et calculer son salaire brut selon ce qui suit :

Salaire de base <= 10000 : HRA = 20%, DA = 80%
Salaire de base <= 20000 : HRA = 25%, DA = 90%
Salaire de base > 20000 : HRA = 30%, DA = 95%
Sortir
 */



package gold;

import java.util.Scanner;

public class BasicSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scanner = new Scanner(System.in)) {

            double salary = 0;

            System.out.println("Enter our basic salary");

            int basicSalary = scanner.nextInt();

            if (basicSalary < 0) {

                System.out.println("Our salary is not valid ");

            } else if (basicSalary > 20000) {

                salary = ((basicSalary * 1) + (basicSalary * 0.3) + (basicSalary * 0.95));

                System.out.println("Our salary is : " + salary);

            } else if (basicSalary <= 20000) {

                salary = ((basicSalary * 1) + (basicSalary * 0.25) + (basicSalary * 0.90));

                System.out.println("Our salary is : " + salary);

            } else if (basicSalary <= 10000) {

                salary = ((basicSalary * 1) + (basicSalary * 0.2) + (basicSalary * 0.8));

                System.out.println("Our salary is : " + salary);

            }

        }

    }
	}


