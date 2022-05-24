package org.example.Tema5.FirmeTeleviziune;

public class Telekom implements FirmaTV,Semnal5G,Calitate4K{
    @Override
    public void ListaPrograme() {
        System.out.println("Telekom:32 programe la dispozitie");
    }

    @Override
    public void pret() {
        System.out.println("40lei/luna");
    }

    @Override
    public void Rezolutie() {
        System.out.println("Rezolutie 3840 × 2160 UHD");
    }

    @Override
    public void OfertaSemnal5G() {
        System.out.println("Semnal 5G");
    }
}
