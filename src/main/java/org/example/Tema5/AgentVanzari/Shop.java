package org.example.Tema5.AgentVanzari;

import org.example.Tema5.FirmeTeleviziune.FirmaTV;
import org.example.Tema5.FirmeTeleviziune.Digi;
import org.example.Tema5.FirmeTeleviziune.Telekom;
import org.example.Tema5.FirmeTeleviziune.UPC;

public class Shop {
   private FirmaTV producator;

    public void Digi(){
        producator = new Digi();
        producator.ListaPrograme();
        producator.pret();
    }
    public void Telekom(){
        producator = new Telekom();
        producator.ListaPrograme();
        producator.pret();
    }
    public void UPC() {
        producator = new UPC();
        producator.ListaPrograme();
        producator.pret();
    }
}
