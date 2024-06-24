import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class GeradorSenha {
    
    private PinoColorido[] pinos;
    private JPanel pnSenha;
    

    public GeradorSenha() {
        pinos = new PinoColorido[4];
        pnSenha = new JPanel();

        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            
            int n = rand.nextInt(8);
          
            switch (n) {

                case 1:
                    pinos[i] = PinoColorido.criaPinoColorido("GRAY");
                case 2:
                    pinos[i] = PinoColorido.criaPinoColorido("RED");
                case 3:
                    pinos[i] = PinoColorido.criaPinoColorido("GREEN");   
                case 4:
                    pinos[i] = PinoColorido.criaPinoColorido("YELLOW");
                case 5:
                    pinos[i] = PinoColorido.criaPinoColorido("BLUE");
                case 6:
                    pinos[i] = PinoColorido.criaPinoColorido("MAGENTA");
                case 7:
                    pinos[i] = PinoColorido.criaPinoColorido("ORANGE");
                case 0:
                    pinos[i] = PinoColorido.criaPinoColorido("PINK");
            }
            //pinos[i].setEnabled(false);
        }

        pnSenha.setLayout(new BoxLayout(pnSenha, BoxLayout.LINE_AXIS));
        for(Pino p:pinos){
            pnSenha.add(p);
        }
    }

    public JPanel getPainel(){
        return pnSenha;
    }
}

