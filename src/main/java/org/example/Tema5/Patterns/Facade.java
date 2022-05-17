package org.example.Tema5.Patterns;

import org.example.Tema5.FirmeTeleviziune.Digi;
import org.example.Tema5.FirmeTeleviziune.FirmaTV;
import org.example.Tema5.FirmeTeleviziune.Telekom;
import org.example.Tema5.FirmeTeleviziune.UPC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Facade {
    private static int  choice;

    public void runShopFirmeTV() throws IOException {
        do{
            System.out.print("========= TV Shop ============ \n");
            System.out.print("            1. Digi.              \n");
            System.out.print("            2. Telekom.              \n");
            System.out.print("            3. UPC.            \n");
            System.out.print("            4. Exit.                     \n");
            System.out.print("Enter your choice: ");

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            FirmaTV Producator;
            switch (choice) {
                case 1:
                {
                    Producator = new Digi();
                }
                break;
                case 2:
                {
                    Producator = new Telekom();
                }
                break;
                case 3:
                {
                    Producator = new UPC();
                }
                break;
                default:
                {
                    System.out.println("Nothing You purchased");
                }
                return;
            }
            Producator.ListaPrograme();
            Producator.pret();
        }while(choice!=4);
    }
}

