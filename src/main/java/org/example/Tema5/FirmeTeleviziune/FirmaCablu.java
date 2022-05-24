package org.example.Tema5.FirmeTeleviziune;
import org.example.Tema5.Canale.Canal;
import org.example.Tema5.Emisiuni.Emisiune;
import org.example.Tema5.Emisiuni.EmisiuneAmuzanta;
import org.example.Tema5.Emisiuni.EmisiuneAventura;
import org.example.Tema5.Emisiuni.EmisiuneTeleshopping;
import org.example.Tema5.Programe.Program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FirmaCablu {
    private List<Canal> canale;
    private int dimCanale = 6;

    public void initializare(){
        Emisiune emisiuneAmuzanta = new EmisiuneAmuzanta();
        Emisiune emisiuneAventura = new EmisiuneAventura();
        Emisiune emisiuneTeleshopping = new EmisiuneTeleshopping();
        emisiuneAmuzanta.citire();
        emisiuneAventura.citire();
        emisiuneTeleshopping.citire();
        String[] nume = {"Digi Sport 1","AcasaTv","Antena 3","ProTv","ProCinema","HappyTv"};
        Program program1 = new Program(emisiuneAmuzanta,"Amiaza",5,3,2,"16+",9);
        Program program2 = new Program(emisiuneAmuzanta,"Seara",15,10,5,"16+",9);
        Program program3 = new Program(emisiuneAventura,"Amiaza",6,2,4,"18+",21);
        Program program4 = new Program(emisiuneAventura,"Seara",8,3,2,"16+",10);
        Program program5 = new Program(emisiuneTeleshopping,"Dimineata",1,1,1,"18+",12);
        Program program6 = new Program(emisiuneAmuzanta,"Amiaza",5,3,3,"16+",9);
        Program[] programe = new Program[]{program1,program2,program3,program4,program5,program6};
        String[] frecventa={"3x51","82","98","32","11a","101"};
        int[] zile = {17,21,22,7,9,10};
        double[] audienta = {17123,210,992,8333,544,1030};

        canale = Arrays.asList(new Canal[dimCanale]);

        for(int i=0;i<dimCanale;i++){
            canale.set(i, new Canal(nume[i], programe[i], frecventa[i], zile[i], audienta[i]));
        }
    }

    public List<Canal> sortareCanale(){
        List<Canal> sortedCanale = canale.stream()
                .sorted(Comparator.comparing(Canal::getAudienta).reversed())
                .collect(Collectors.toList());
        return sortedCanale;
    }

    public void generareGrafic(){
        System.out.println("Canale dupa audienta:");
        for(int i=0;i<dimCanale;i++) {
            System.out.println(sortareCanale().get(i).toString());
        }
    }
}
