package org.example.Tema5;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Canal extends Program {

    private static Canal INSTANCE;

    public static Canal getInstance()
    {
        if (INSTANCE == null) {
            INSTANCE = new Canal("Kanal D",getArrayPrograme(),"3s5",17 );
        }
        return INSTANCE;
    }
    private String nume;
    private static Program[] programe;
    private String frecventa;
    private int ziRevizie;

    private static Program[] getArrayPrograme(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dim Programe:");
        int n = sc.nextInt();
        programe = new Program[n];
        for(int i=0;i<n;i++){
            System.out.println("Date Programe:"+(i+1));
            programe[i] = Program.getInstance();
        }
        return programe;
    }

    public Canal() {}

    public Canal(String nume, Program[] programe, String frecventa, int ziRevizie) {
        this.nume = nume;
        setPrograme(programe);
        this.frecventa = frecventa;
        this.ziRevizie = ziRevizie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Program[] getPrograme() {
        return programe;
    }

    public void setPrograme(Program[] programe) {
        this.programe = programe;
    }

    public String getFrecventa() {
        return frecventa;
    }

    public void setFrecventa(String frecventa) {
        this.frecventa = frecventa;
    }

    public int getZiRevizie() {
        return ziRevizie;
    }

    public void setZiRevizie(int ziRevizie) {
        this.ziRevizie = ziRevizie;
    }

    public static void ObserverFunction() {
        Program p = new Program();

        new Observer(p);

        Scanner sc = new Scanner(System.in);
        System.out.println("Ora pentru schimbare:");
        int ora = sc.nextInt();

        System.out.println("Ora s-a schimbat la ora "+ora);
        p.setOraEmisiune(ora);
    }

    public void emisiuneFactory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ora vizionare:");
        int ora = sc.nextInt();
        Program program = new Program(ora);
        setEmisiune(program.tipEmisiune());
        getEmisiune().citire();
        System.out.println(getEmisiune().toString());
    }

    public void writeGson(Canal[] c) {

        try {
            List <Canal> canale  = Arrays.asList(c[0]);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            Writer writer = Files.newBufferedWriter(Paths.get(".\\jsonfiles\\canal.json"));

            gson.toJson(canale, writer);

            writer.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void readGson() {

        try {

            Gson gson = new Gson();

            Reader reader = Files.newBufferedReader(Paths.get(".\\jsonfiles\\canal.json"));

            List<Program> canale = Arrays.asList(gson.fromJson(reader, Canal[].class));

            canale.forEach(System.out::println);

            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Canal{" +
                "programe=" + Arrays.toString(programe) +
                ", frecventa='" + frecventa + '\'' +
                ", ziRevizie=" + ziRevizie +
                '}';
    }

}