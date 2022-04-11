package org.example.Tema5;

public class ProgramBuilder {

    private Program program ;

    public ProgramBuilder()
    {
        this.program = new Program();
    }

    public ProgramBuilder Dimineata(ProgramDimineata dim){
        program.setDimineata(dim);
        return this;
    }

    public ProgramBuilder Amiaza(ProgramAmiaza amiaza){
        program.setAmiaza(amiaza);
        return this;
    }
    public ProgramBuilder Seara(ProgramSeara seara){
        program.setSeara(seara);
        return this;
    }
    public ProgramBuilder Noapte(ProgramNoapte noapte){
        program.setNoapte(noapte);
        return this;
    }
    public Program Build(){
        return this.program;
    }

}
