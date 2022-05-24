package org.example.Tema5.InterfataGrafica;
import org.example.Tema5.Canale.Canal;
import org.example.Tema5.FirmeTeleviziune.FirmaCablu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GraficCanale {
    private JButton Grafic;
    private JPanel Panel;

    private int dimCanale = 6;

    FirmaCablu firma = new FirmaCablu();

    public GraficCanale(){
        firma.initializare();
        List <Canal> canale = firma.sortareCanale();
        Grafic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, canale.get(0).toString() + "\n"+canale.get(1).toString()+"\n"+
                        canale.get(2).toString()+"\n"+canale.get(3).toString()+"\n"+canale.get(4).toString()+"\n"+canale.get(5).toString());
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("GraficCanale");
        frame.setContentPane(new GraficCanale().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
