package org.example.Tema5.Canale;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.example.Tema5.Programe.Program;
import org.example.Tema5.Patterns.Observer;
import org.example.Tema5.Programe.ProgramBuilder;

public class Canal extends Program {

    private static Canal INSTANCE;
    private double audienta;

    public Canal(Canal canal) {
        this.nume = canal.nume;
        this.program = canal.program;
        this.frecventa = canal.frecventa;
        this.ziRevizie = canal.ziRevizie;
        this.audienta = canal.audienta;
    }

    public static Canal getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Canal("Kanal D", null, "3s5", 17,233);
        }
        return INSTANCE;
    }

    private static Program[] programe;

    private static Program[] getArrayPrograme() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dim Programe:");
        int n = sc.nextInt();
        programe = new Program[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Date Programe:" + (i + 1));
            programe[i] = Program.getInstance();
        }
        return programe;
    }

    public Canal() {
    }

    public String getNume() {
        return nume;
    }

    public Program[] getPrograme() {
        return programe;
    }

    public void setPrograme(Program[] programe) {
        this.programe = programe;
    }

    public static void ObserverFunction() {
        Program p = new Program();

        new Observer(p);

        Scanner sc = new Scanner(System.in);
        System.out.println("Ora pentru schimbare:");
        int ora = sc.nextInt();

        System.out.println("Ora s-a schimbat la ora " + ora);
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
            List<Canal> canale = Arrays.asList(c[0]);

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

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public void setFrecventa(String frecventa) {
        this.frecventa = frecventa;
    }

    public void setZiRevizie(int ziRevizie) {
        this.ziRevizie = ziRevizie;
    }

    @Override
    public String toString() {
        return "Canal{" +
                "nume='" + nume + '\'' +
                ", program=" + program +
                ", frecventa='" + frecventa + '\'' +
                ", ziRevizie=" + ziRevizie +
                ", audienta=" + audienta+
                '}';
    }

    public Canal(String nume, Program program, String frecventa, int ziRevizie,double audienta) {
        this.nume = nume;
        this.program = program;
        this.frecventa = frecventa;
        this.ziRevizie = ziRevizie;
        this.audienta = audienta;
    }

    private String nume;
    private Program program;
    private String frecventa;
    private int ziRevizie;

    public void citire() {
        program = new Program();
        program.citire();
        setNume("Kanal D");
        program = new ProgramBuilder().Dimineata(program.getDim()).Amiaza(program.getAmiaza()).Seara(program.getSeara()).Noapte(program.getNoapte()).Build();
        setFrecventa("13x");
        setZiRevizie(17);
    }

   public double getAudienta(){
        return audienta;
   }
}