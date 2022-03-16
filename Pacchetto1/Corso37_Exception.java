package Pacchetto1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Corso37_Exception {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserisci un numero...");
            int x = scanner.nextInt();

            System.out.println("Inserisci secondo numero...");
            int y = scanner.nextInt();

            int result = x / y;
            System.out.println("Risultato = " + result);
        }catch(ArithmeticException e){
            System.out.println("Non puoi dividere per 0");
        }catch(InputMismatchException e){
            System.out.println("Non puoi inserire lettere");
        }catch(Exception e){
            System.out.println("Errore di inserimento");
        }finally {
            System.out.println("Grazie di aver partecipato");
            scanner.close();
        }
        //Se 5 diviso 0, mi viene "Exception", Allora metto il "try" (Vedi su) e il "catch" (Vedi giu)
        //Anche se sbaglio, inserendo una parola mi viene "Exception", creo un altro "catch"
        //Posso mettere anche/o "Exception" senza niente, per altri eventuali errori
        }
}
