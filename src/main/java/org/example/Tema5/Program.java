package org.example.Tema5;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class Program  {

    private static Program INSTANCE;

    public static Program getInstance()
    {
        if (INSTANCE == null) {
            INSTANCE = new Program(null, "Teleshopping",3,2,5,"16+",17);
        }
        return INSTANCE;
    }

    public Program(){}

    private Program(Emisiune emisiune, String tipProgram, int durataMedie, int emisiuniLive, int emisiuniInregistrate, String publicTinta, int oraPreponderentaEmisiune) {
        this.emisiune = emisiune;
        this.tipProgram = tipProgram;
        this.durataMedie = durataMedie;
        this.emisiuniLive = emisiuniLive;
        this.emisiuniInregistrate = emisiuniInregistrate;
        this.publicTinta = publicTinta;
        this.oraPreponderentaEmisiune = oraPreponderentaEmisiune;
    }

    public Emisiune getEmisiune() {
        return emisiune;
    }

    public void setEmisiune(Emisiune e) {
        this.emisiune = e;
    }

    private Emisiune emisiune;
    private String tipProgram;
    private int durataMedie;
    private int emisiuniLive;
    private int emisiuniInregistrate;
    private String publicTinta;
    private int oraPreponderentaEmisiune;

    private List<Observer> observers = new ArrayList<Observer>();
    private int oraEmisiune;

    public int getOraEmisiune() {
        return oraEmisiune;
    }

    public void setOraEmisiune(int oraEmisiune) {
        this.oraEmisiune = oraEmisiune;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public Program(int oraEmisiune){
        super();
        this.oraEmisiune = oraEmisiune;
    }

    @Override
    public String toString() {
        return "Program [tipProgram=" + tipProgram + ", durataMedie=" + durataMedie + ", emisiuniLive=" + emisiuniLive
                + ", emisiuniInregistrate=" + emisiuniInregistrate + ", publicTinta=" + publicTinta
                + ", oraPreponderentaEmisiune=" + oraPreponderentaEmisiune + "]";
    }

    public String getTipProgram() {
        return tipProgram;
    }

    public void setTipProgram(String tipProgram) {
        this.tipProgram = tipProgram;
    }


    public int getDurataMedie() {
        return durataMedie;
    }


    public void setDurataMedie(int durataMedie) {
        this.durataMedie = durataMedie;
    }


    public int getEmisiuniLive() {
        return emisiuniLive;
    }


    public void setEmisiuniLive(int emisiuniLive) {
        this.emisiuniLive = emisiuniLive;
    }


    public int getEmisiuniInregistrate() {
        return emisiuniInregistrate;
    }


    public void setEmisiuniInregistrate(int emisiuniInregistrate) {
        this.emisiuniInregistrate = emisiuniInregistrate;
    }


    public String getPublicTinta() {
        return publicTinta;
    }


    public void setPublicTinta(String publicTinta) {
        this.publicTinta = publicTinta;
    }


    public int getOraPreponderentaEmisiune() {
        return oraPreponderentaEmisiune;
    }


    public void setOraPreponderentaEmisiune(int oraPreponderentaEmisiune) {
        this.oraPreponderentaEmisiune = oraPreponderentaEmisiune;
    }

    public Emisiune tipEmisiune(){
        if(this.oraEmisiune == 17){
            return new EmisiuneAmuzanta();

        } else if(this.oraEmisiune == 21) {
            return new EmisiuneAventura();
        }
        return null;
    }

    public void citire(Scanner sc) {
        System.out.println("Tip Program:");
        String tip=sc.next();
        this.setTipProgram(tip);
        System.out.println("Durata Medie:");
        int dur=sc.nextInt();
        this.setDurataMedie(dur);
        System.out.println("Emisiuni Live:");
        int emL=sc.nextInt();
        this.setEmisiuniLive(emL);
        System.out.println("Emisiuni Inregistrare:");
        int emI=sc.nextInt();
        this.setEmisiuniInregistrate(emI);
        System.out.println("Public Tinta:");
        String pbT=sc.next();
        this.setPublicTinta(pbT);
        System.out.println("Ora Emisiune:");
        int ora=sc.nextInt();
        this.setOraPreponderentaEmisiune(ora);
    }

    public void writeGson(Program[] p) {

        try {
            List <Program> programe  = Arrays.asList(p[0],p[1]);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            Writer writer = Files.newBufferedWriter(Paths.get(".\\jsonfiles\\program.json"));

            gson.toJson(programe, writer);

            writer.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void readGson() {

        try {

            Gson gson = new Gson();

            Reader reader = Files.newBufferedReader(Paths.get(".\\jsonfiles\\program.json"));

            List<Program> programe = Arrays.asList(gson.fromJson(reader, Program[].class));

            programe.forEach(System.out::println);

            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

