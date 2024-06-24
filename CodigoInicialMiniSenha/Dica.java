import java.awt.GridLayout;
import java.util.stream.Stream;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dica {
    private PinoPB[] pinos;
    private JPanel pnDica;
    private int numBranco;
    private int numPreto;

    public Dica(){
        pinos = new PinoPB[2];
        pnDica = new JPanel();
        this.numBranco = 0;
        this.numPreto = 0;

        // Cria os pinos
        for(int i=0;i<2;i++){
            pinos[i] = PinoPB.criaPinoVazio();
        }

        // Monta o painel

        JLabel numPinoPreto = new JLabel(String.valueOf(numPreto));
        JLabel numPinoBranco = new JLabel(String.valueOf(numBranco));

        pnDica.setLayout(new GridLayout(0,4));
        pnDica.add(PinoPB.criaPinoPreto());
        pnDica.add(numPinoPreto);
        pnDica.add(PinoPB.criaPinoBranco());
        pnDica.add(numPinoBranco);
        //for(Pino p:pinos){
        //    pnDica.add(p);
        //}
    }

    public JPanel getPainel(){
        return pnDica;
    }

    public Pino getPino(int i){
        return pinos[i];
    }

    public int getNumBranco() {
        return numBranco;
    }

    public int getNumPreto() {
        return numPreto;
    }

    public void setNumBranco(int numBranco) {
        this.numBranco = numBranco;
    }

    public void setNumPreto(int numPreto) {
        this.numPreto = numPreto;
    }

    

}
