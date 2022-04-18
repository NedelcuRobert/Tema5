package org.example.Tema5.Patterns;

import org.example.Tema5.FirmeTeleviziune.FirmaTV;

public abstract class FirmaDecorator implements FirmaTV{
    protected FirmaTV firmaDecorata;

    public FirmaDecorator(FirmaTV firmaDecorata){
        this.firmaDecorata = firmaDecorata;
    }

    public void ListaPrograme(){
        firmaDecorata.ListaPrograme();
    }
    public void pret(){
        firmaDecorata.pret();
    }
}
