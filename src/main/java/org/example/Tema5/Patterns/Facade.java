package org.example.Tema5.Patterns;

import org.example.Tema5.FirmeTeleviziune.*;

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
            switch (choice) {
                case 1:
                {
                    Digi digi = new Digi();
                    digi.ListaPrograme();
                    digi.pret();
                    digi.OfertaInternet();
                }
                break;
                case 2:
                {
                    Telekom telekom = new Telekom();
                    telekom.ListaPrograme();
                    telekom.pret();
                }
                break;
                case 3:
                {
                    UPC upc = new UPC();
                    upc.ListaPrograme();
                    upc.pret();
                    upc.OfertaInternet();
                }
                break;
                default:
                {
                    System.out.println("Nothing You purchased");
                }
                return;
            }
        }while(choice!=4);
    }
}

