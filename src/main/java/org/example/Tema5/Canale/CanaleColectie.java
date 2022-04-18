package org.example.Tema5.Canale;

import org.example.Tema5.Programe.Program;
import org.example.Tema5.Patterns.Iterator;

import java.util.Scanner;

public class CanaleColectie {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Canal[] canale;

    public CanaleColectie()
    {
        canale = new Canal[MAX_ITEMS];

        for(int i=0;i<MAX_ITEMS;i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nume:");
            String nume = sc.next();
            System.out.println("Program:");
            Program program = new Program();
            program.citire();
            System.out.println("Frecventa:");
            String frecventa = sc.next();
            System.out.println("Zi Revizie:");
            int ziRevizie = sc.nextInt();
            addItem(new Canal(nume, program, frecventa, ziRevizie));
        }
    }

    public void addItem(Canal canal)
    {
        Canal notification = new Canal(canal);
        if (numberOfItems >= MAX_ITEMS)
            System.err.println("Full");
        else
        {
            canale[numberOfItems] = notification;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator()
    {
        return new CanaleIterator(canale);
    }
}
