package org.example.Tema5.Patterns;

import org.example.Tema5.FirmeTeleviziune.Digi;
import org.example.Tema5.FirmeTeleviziune.DigiDecorator;
import org.example.Tema5.FirmeTeleviziune.FirmaTV;

public class DecoratorDemo {
    public void runDecorator() {
        FirmaTV firma = new Digi();

        FirmaTV DigiFirma = new DigiDecorator(new Digi());
        System.out.println("Digi oferta initialia");
        firma.ListaPrograme();
        firma.pret();

        System.out.println("\nDigi oferta noua");
        DigiFirma.ListaPrograme();
        DigiFirma.pret();
    }
}
