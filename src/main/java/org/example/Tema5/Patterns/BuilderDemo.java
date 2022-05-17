package org.example.Tema5.Patterns;

import org.example.Tema5.Canale.Canal;

import java.util.Scanner;

public class BuilderDemo {
    private Canal[] Canale;
    Scanner sc = new Scanner(System.in);

    public int returnareCanalAlegere(){
        System.out.println("Alegeti un canal:");
        int alegere = sc.nextInt();
        return alegere;
    }

    public void initializareCanale(){
        System.out.println("Dimensiune canale:");
        int dim = sc.nextInt();
        Canale = new Canal[dim];
    }

    public void citire(){
        Canale[returnareCanalAlegere() - 1] = new Canal();
        Canale[returnareCanalAlegere() - 1].citire();
    }

    public void runBuilder() {
        System.out.println(Canale[returnareCanalAlegere() - 1].toString());
    }
}
