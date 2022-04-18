package org.example.Tema5.Emisiuni;

public class EmisiuneAmuzanta implements Emisiune  {

    private String name;
    private String publicTinta;
    private int ora;
    private int durata;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublicTinta() {
        return publicTinta;
    }

    public void setPublicTinta(String publicTinta) {
        this.publicTinta = publicTinta;
    }

    public int getOra() {
        return ora;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void citire(){
        setName("La Maruta");
        setPublicTinta("18+");
        setOra(17);
        setDurata(1);
    }

    @Override
    public String toString() {
        return "EmisiuneAmuzanta{" +
                "name='" + name + '\'' +
                ", publicTinta='" + publicTinta + '\'' +
                ", ora=" + ora +
                ", durata=" + durata +
                '}';
    }
}
