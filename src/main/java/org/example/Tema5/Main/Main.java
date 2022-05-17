package org.example.Tema5.Main;

import java.io.IOException;
import org.example.Tema5.Patterns.Facade;

public class Main {

    public static void main(String[] args) throws IOException {
        Facade shop = new Facade();

        shop.runShopFirmeTV();
    }
}