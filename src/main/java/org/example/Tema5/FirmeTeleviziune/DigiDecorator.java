package org.example.Tema5.FirmeTeleviziune;

import org.example.Tema5.Patterns.FirmaDecorator;

public class DigiDecorator extends FirmaDecorator {

    public DigiDecorator(FirmaTV firmaDecorata) {
        super(firmaDecorata);
    }

    public void ListaPrograme(){
        firmaDecorata.ListaPrograme();
        AdaugaPrograme(firmaDecorata);
    }
    public void pret(){
        firmaDecorata.pret();
    }

    private void AdaugaPrograme(FirmaTV firmaDecorata){
        System.out.println("Oferta +2 programe Sport 4k +HBO 4K");
    }
}
