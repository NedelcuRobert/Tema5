package org.example.Tema5.Programe;

public class ProgramAmiaza {

    public ProgramAmiaza(String tipProgram, int durataMedie, int emisiuniLive, int emisiuniInregistrate, String publicTinta, int oraPreponderentaEmisiune) {
        this.tipProgram = tipProgram;
        this.durataMedie = durataMedie;
        this.emisiuniLive = emisiuniLive;
        this.emisiuniInregistrate = emisiuniInregistrate;
        this.publicTinta = publicTinta;
        this.oraPreponderentaEmisiune = oraPreponderentaEmisiune;
    }

    @Override
    public String toString() {
        return "ProgramAmiaza{" +
                "tipProgram='" + tipProgram + '\'' +
                ", durataMedie=" + durataMedie +
                ", emisiuniLive=" + emisiuniLive +
                ", emisiuniInregistrate=" + emisiuniInregistrate +
                ", publicTinta='" + publicTinta + '\'' +
                ", oraPreponderentaEmisiune=" + oraPreponderentaEmisiune +
                '}';
    }

    private String tipProgram;
    private int durataMedie;
    private int emisiuniLive;
    private int emisiuniInregistrate;
    private String publicTinta;
    private int oraPreponderentaEmisiune;

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

}
