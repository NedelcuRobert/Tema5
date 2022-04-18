package org.example.Tema5.Patterns;

import org.example.Tema5.Programe.Program;

public class Observer {
    private Program program;

    public Observer(Program p){
        this.program = p;
        this.program.attach(this);
    }

    public void update() {
        program.setEmisiune(program.tipEmisiune());
        program.getEmisiune().citire();
        System.out.println(program.getEmisiune().toString());
    }
}
