package domacipaket;
import java.util.Scanner;

public class Domaciklasa {

	public static void main(String[] args) {




		        Scanner scanner = new Scanner(System.in);
		        char operation = scanner.nextLine().charAt(0);
		        int broj1 = 24;
		        int broj2 = 12;
		        
		        if (operation == '+') {
		            System.out.println(broj1 + broj2);
		        }
		        if (operation == '*') {
		            System.out.println(broj1 * broj2);
		        }
		        if (operation == '/') {
		            System.out.println(broj1 / broj2);
		        }
		        if (operation == '-') {
		            System.out.println(broj1 - broj2);
		        }
		        scanner.close();
		    }
		}

	


