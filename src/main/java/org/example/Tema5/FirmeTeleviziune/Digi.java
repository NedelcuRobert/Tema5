package org.example.Tema5.FirmeTeleviziune;

import org.example.Tema5.Canale.Canal;

public class Digi implements FirmaTV{
    @Override
    public void ListaPrograme() {
        System.out.println("Digi:30 programe la dispozitie");
    }

    @Override
    public void pret() {
        System.out.println("50lei/luna");
    }
}
