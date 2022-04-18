package org.example.Tema5.FirmeTeleviziune;

public class Telekom implements FirmaTV{
    @Override
    public void ListaPrograme() {
        System.out.println("Telekom:32 programe la dispozitie");
    }

    @Override
    public void pret() {
        System.out.println("40lei/luna");
    }
}
