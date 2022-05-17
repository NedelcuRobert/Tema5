package org.example.Tema5.Patterns;

import org.example.Tema5.Canale.Canal;

import java.util.Scanner;

public class FactoryAndObserverDemo {
    private Canal[] Canale;

    Scanner sc = new Scanner(System.in);

    public int returnareAlegereCanal(){
        System.out.println("Alegeti un canal:");
        int alegere = sc.nextInt();
        return alegere;
    }

    public void initializareCanale(){
        System.out.println("Dimensiune canale:");
        int dim = sc.nextInt();
        Canal[] canale = new Canal[dim];
    }
    public void runFactoryAndObserver(){
        Canale[returnareAlegereCanal()-1] = new Canal();
        Canale[returnareAlegereCanal()-1].emisiuneFactory();
        Canale[returnareAlegereCanal()-1].ObserverFunction();
    }
}
