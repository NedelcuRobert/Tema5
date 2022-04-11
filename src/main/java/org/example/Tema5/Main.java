package org.example.Tema5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        FirmaTeleviziune firma = new FirmaTeleviziune();
        //firma.runWithSingleton();
        //firma.runFactoryAndObserver();
        firma.runBuilder();
        firma.runIterator();

    }
}