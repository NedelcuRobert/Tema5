package org.example.Tema5.Patterns;

import org.example.Tema5.Canale.Canal;

import java.util.Scanner;
import java.util.logging.Logger;

public class SingletonDemo {
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
}
