package Pacchetto1;

public class Main {
    public static void main(String[] args){

        Studente studente1 = new Studente("Daniele", "Palamidessi");
        Studente studente2 = new Studente("Eleonora", "Mainardi");
        Insegnante insegnante1 = new Insegnante("Silvia", "Simonassi");

        //Insegnante[] classe = {studente1, insegnante1}; QUESTO ARRAY NON RICONOSCEREBBE studente1
        Persona[] classe = {studente1, studente2, insegnante1}; //Grazie al Polimorfismo "Persona" riconosce ambedue

        for(Persona persona : classe){
        persona.saluta();
    }
    }
}
