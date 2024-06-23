import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class UmaTentativa {
    private PinoColorido[] pinos;
    private JPanel pnTentativa;

    public UmaTentativa(){
        pinos = new PinoColorido[4];
        pnTentativa = new JPanel();

        // Cria os pinos
        for(int i=0;i<4;i++){
            pinos[i] = PinoColorido.criaPinoColorido("GRAY");
            pinos[i].setEnabled(false);
        }

        // Monta o painel
        pnTentativa.setLayout(new BoxLayout(pnTentativa, BoxLayout.LINE_AXIS));
        for(Pino p:pinos){
            pnTentativa.add(p);
        }
    }

    public void habilita(){
        for(Pino p:pinos){
            p.setEnabled(true);
        }
    }

    public void desabilita(){
        for(Pino p:pinos){
            p.setEnabled(false);
        }
    }

    public Pino getPino(int i){
        return pinos[i];
    }

    public JPanel getPainel(){
        return pnTentativa;
    }
}
