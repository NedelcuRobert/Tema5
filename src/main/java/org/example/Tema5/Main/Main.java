package org.example.Tema5.Main;

import java.io.IOException;

import org.example.Tema5.FirmeTeleviziune.AparatTransmisie;
import org.example.Tema5.FirmeTeleviziune.FirmaCablu;
import org.example.Tema5.FirmeTeleviziune.TransferPrinFibra;
import org.example.Tema5.InterfataGrafica.GraficCanale;
import org.example.Tema5.Patterns.Facade;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws IOException {
        FirmaCablu firmaCablu = new FirmaCablu();
        firmaCablu.initializare();
        firmaCablu.generareGrafic();
    }
}