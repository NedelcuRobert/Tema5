package org.example.Tema5.FirmeTeleviziune;

public class AparatTransmisie {
    private Transmisie transferSemnal;

    public AparatTransmisie(Transmisie _transferSemnal){
        transferSemnal = _transferSemnal;
    }
    public void TransferSemnal(){
        transferSemnal.transferSemnal();
    }
}
