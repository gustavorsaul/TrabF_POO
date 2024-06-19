package Telas;

import java.awt.GridLayout;

import javax.swing.JPanel;

import Main.Pino;
import Main.PinoPB;

public class Dica {

    private PinoPB[] pinos;
    private JPanel pnDica;

    public Dica(){
        pinos = new PinoPB[4];
        pnDica = new JPanel();

        // Cria os pinos
        for(int i=0;i<4;i++){
            pinos[i] = PinoPB.criaPinoVazio();
        }

        // Monta o painel
        pnDica.setLayout(new GridLayout(2,2));
        for(Pino p:pinos){
            pnDica.add(p);
        }
    }

    public JPanel getPainel(){
        return pnDica;
    }

    public Pino getPino(int i){
        return pinos[i];
    }
}
