package org.example.Tema5.FirmeTeleviziune;

public class Digi implements FirmaTvCuInternet, PromotieTelefon,Calitate4K,Semnal5G{
    @Override
    public void ListaPrograme() {
        System.out.println("Digi:30 programe la dispozitie");
    }

    @Override
    public void pret() {
        System.out.println("50lei/luna");
    }

    @Override
    public void OfertaInternet() {
        System.out.println("Internet de 500Mbps viteza");
    }

    @Override
    public void TelefonCadou() {
        System.out.println("Apple Iphone 13 256 GB la 1 an de abonament cadou");
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
