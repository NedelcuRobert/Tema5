package org.example.Tema5.AgentVanzari;

import org.example.Tema5.FirmeTeleviziune.FirmaTV;
import org.example.Tema5.FirmeTeleviziune.Digi;
import org.example.Tema5.FirmeTeleviziune.Telekom;
import org.example.Tema5.FirmeTeleviziune.UPC;

public class Shop {
    private FirmaTV Digi;
    private FirmaTV Telekom;
    private FirmaTV UPC;

    public Shop(){
        Digi = new Digi();
        Telekom = new Telekom();
        UPC = new UPC();
    }
    public void Digi(){
        Digi.ListaPrograme();
        Digi.pret();
    }
    public void Telekom(){
        Telekom.ListaPrograme();
        Telekom.pret();
    }
    public void UPC(){
        UPC.ListaPrograme();
        UPC.pret();
    }
}
