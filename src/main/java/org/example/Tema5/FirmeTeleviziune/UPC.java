package org.example.Tema5.FirmeTeleviziune;

public class UPC implements FirmaTV{
    @Override
    public void ListaPrograme() {
        System.out.println("UPC:38 programe la dispozitie");
    }

    @Override
    public void pret() {
        System.out.println("45lei/luna");
    }
}
