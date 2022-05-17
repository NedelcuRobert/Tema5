package org.example.Tema5.Patterns;

import org.example.Tema5.Canale.Canal;
import org.example.Tema5.Canale.CanaleColectie;

public class IteratorDemo {
    public void runIterator() {
        CanaleColectie colectie = new CanaleColectie();
        Iterator iterator = colectie.createIterator();
        System.out.println("-------Canale :------------");
        while (iterator.hasNext()) {
            Canal n = (Canal) iterator.next();
            System.out.println(n.getNume());
        }
    }
}
