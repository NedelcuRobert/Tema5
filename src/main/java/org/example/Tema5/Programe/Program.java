package org.example.Tema5.Programe;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import org.example.Tema5.Emisiuni.Emisiune;

import org.example.Tema5.Emisiuni.EmisiuneAmuzanta;
import org.example.Tema5.Emisiuni.EmisiuneAventura;
import org.example.Tema5.Patterns.Observer;


public class Program implements ProgramPlan {

    private static Program INSTANCE;
    private Emisiune emisiune;

    @Override
    public String toString() {
        return "Program{" +
                "emisiune=" + emisiune +
                ", emisiuniLive=" + emisiuniLive +
                ", emisiuniInregistrate=" + emisiuniInregistrate +
                ", publicTinta='" + publicTinta + '\'' +
                ", oraPreponderentaEmisiune=" + oraPreponderentaEmisiune +
                ", durataMedie=" + durataMedie +
                ", tipProgram='" + tipProgram + '\'' +
                ", observers=" + observers +
                ", oraEmisiune=" + oraEmisiune +
                '}';
    }

    private int emisiuniLive;
    private int emisiuniInregistrate;
    private String publicTinta;
    private int oraPreponderentaEmisiune;
    private int durataMedie;
    private String tipProgram;

    public static Program getInstance()
    {
        if (INSTANCE == null) {
            INSTANCE = new Program(null, "Teleshopping",3,2,5,"16+",17);
        }
        return INSTANCE;
    }

    public Program(){}

    public Program(Emisiune emisiune, String tipProgram, int durataMedie, int emisiuniLive, int emisiuniInregistrate, String publicTinta, int oraPreponderentaEmisiune) {
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

    private List<Observer> observers = new ArrayList<Observer>();
    private int oraEmisiune;

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

    public void setTipProgram(String tipProgram) {
        this.tipProgram = tipProgram;
    }

    public void setDurataMedie(int durataMedie) {
        this.durataMedie = durataMedie;
    }

    public void setEmisiuniLive(int emisiuniLive) {
        this.emisiuniLive = emisiuniLive;
    }

    public void setEmisiuniInregistrate(int emisiuniInregistrate) {
        this.emisiuniInregistrate = emisiuniInregistrate;
    }

    public void setPublicTinta(String publicTinta) {
        this.publicTinta = publicTinta;
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

    public void citire1(Scanner sc) {
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

    public ProgramDimineata getDim() {
        return dim;
    }

    public ProgramAmiaza getAmiaza() {
        return amiaza;
    }

    public ProgramSeara getSeara() {
        return seara;
    }

    public ProgramNoapte getNoapte() {
        return noapte;
    }

    private ProgramDimineata dim;
    private ProgramAmiaza amiaza;
    private ProgramSeara seara;
    private ProgramNoapte noapte;

    public void citire(){
        dim = new ProgramDimineata("Dimineata",5,3,9,"Adulti si Copii",6);
        amiaza = new ProgramAmiaza("Amiaza",4,1,7,"Adulti si Copii",12);
        seara = new ProgramSeara("Seara",2,2,2,"Adulti",17);
        noapte = new ProgramNoapte("Noaptea",6,2,3,"Adulti",20);
    }

    @Override
    public void setDimineata(ProgramDimineata dim) {
        this.dim = dim;
    }

    @Override
    public void setAmiaza(ProgramAmiaza amiaza) {
        this.amiaza = amiaza;
    }

    @Override
    public void setSeara(ProgramSeara seara) {
        this.seara = seara;
    }

    @Override
    public void setNoapte(ProgramNoapte noapte) {
        this.noapte = noapte;
    }
}

