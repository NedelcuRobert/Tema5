package org.example.Tema5.Patterns;

import org.example.Tema5.AgentVanzari.Shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Facade {
    private static int  choice;

    public void runFacade() throws IOException {
        do{
            System.out.print("========= TV Shop ============ \n");
            System.out.print("            1. Digi.              \n");
            System.out.print("            2. Telekom.              \n");
            System.out.print("            3. UPC.            \n");
            System.out.print("            4. Exit.                     \n");
            System.out.print("Enter your choice: ");

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            Shop sk = new Shop();

            switch (choice) {
                case 1:
                {
                    sk.Digi();
                }
                break;
                case 2:
                {
                    sk.Telekom();
                }
                break;
                case 3:
                {
                    sk.UPC();
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

