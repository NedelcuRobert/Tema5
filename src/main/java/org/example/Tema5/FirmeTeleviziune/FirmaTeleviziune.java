package org.example.Tema5.FirmeTeleviziune;

import java.util.Scanner;
import java.util.logging.Logger;

import org.example.Tema5.Canale.Canal;
import org.example.Tema5.Patterns.Iterator;
import org.example.Tema5.Canale.CanaleColectie;

public class FirmaTeleviziune {

    private Canal canale[];

    private static final Logger logger = Logger.getLogger("Info Logger");

    public void runWithSingleton(){
        Scanner sc = new Scanner(System.in);
        logger.info("Numar canale:");
        int n = sc.nextInt();
        if(n==0){
            logger.warning("Nu pot fi 0 canale");
        }
        else if(n<0){
            logger.severe("Nu pot fi canale pe minus");
        }
        Canal[] canale = new Canal[n];
        for(int i=0;i<n;i++){
            canale[i] = (Canal) Canal.getInstance();
        }
        for(int i=0;i<n;i++){
            System.out.println(canale[i]);
        }
    }

    public void runFactoryAndObserver(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dimensiune canale:");
        int dim = sc.nextInt();
        canale = new Canal[dim];
        System.out.println("Alegeti un canal:1-"+dim);
        int alegere = sc.nextInt();
        canale[alegere-1] = new Canal();
        canale[alegere-1].emisiuneFactory();
        canale[alegere-1].ObserverFunction();
    }

    public void runBuilder(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dimensiune canale:");
        int dim = sc.nextInt();
        canale = new Canal[dim];
        System.out.println("Alegeti un canal:1-"+dim);
        int alegere = sc.nextInt();
        canale[alegere-1] = new Canal();
        canale[alegere-1].citire();
        System.out.println(canale[alegere-1].toString());
    }

    public void runIterator(){
        CanaleColectie colectie = new CanaleColectie();
        Iterator iterator = colectie.createIterator();
        System.out.println("-------Canale :------------");
        while (iterator.hasNext()) {
            Canal n = (Canal) iterator.next();
            System.out.println(n.getNume());
        }
    }
}