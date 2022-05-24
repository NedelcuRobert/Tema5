package org.example.Tema5.FirmeTeleviziune;

public class UPC implements FirmaTvCuInternet,Semnal5G{
    @Override
    public void ListaPrograme() {
        System.out.println("UPC:38 programe la dispozitie");
    }

    @Override
    public void pret() {
        System.out.println("45lei/luna");
    }

    @Override
    public void OfertaInternet() {
        System.out.println("Internet de 300Mbps viteza");
    }

    @Override
    public void OfertaSemnal5G() {
        System.out.println("Semnal 5G");
    }
}
