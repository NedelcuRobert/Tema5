package org.example.Tema5;

public class CanaleIterator implements Iterator{
    private Canal[] canale;

    int poz=0;
    public CanaleIterator(Canal[] canale){
        this.canale = canale;
    }

    @Override
    public Object next(){
        Canal canal = canale[poz];
        poz+=2;
        return canal;
    }

    @Override
    public boolean hasNext() {
        if (poz >= canale.length ||
                canale[poz] == null)
            return false;
        else
            return true;
    }

}
