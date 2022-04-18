package org.example.Tema5.Main;

import java.io.IOException;

import org.example.Tema5.Patterns.DecoratorDemo;
import org.example.Tema5.Patterns.Facade;

public class Main {

    public static void main(String[] args) throws IOException {

        //FirmaTeleviziune firma = new FirmaTeleviziune();
        //firma.runWithSingleton();
        //firma.runFactoryAndObserver();
        //firma.runBuilder();
        //firma.runIterator();

        Facade facade = new Facade();

        facade.runFacade();

        DecoratorDemo deocorator = new DecoratorDemo();

        deocorator.runDecorator();

    }
}