import java.awt.GridLayout;

import javax.swing.JPanel;

public class Dica {
    private PinoPB[] pinos;
    private JPanel pnDica;

    public Dica(){
        pinos = new PinoPB[2];
        pnDica = new JPanel();

        // Cria os pinos
        for(int i=0;i<2;i++){
            pinos[i] = PinoPB.criaPinoVazio();
        }

        // Monta o painel
        pnDica.setLayout(new GridLayout(0,2));
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
