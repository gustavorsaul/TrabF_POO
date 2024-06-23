import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class TentativaComDica {
    private Dica dica;
    private UmaTentativa tentativa;
    private JPanel painel;

    public TentativaComDica(){
        dica = new Dica();
        tentativa = new UmaTentativa();
        painel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        painel.add(tentativa.getPainel());
        painel.add(dica.getPainel());
    }

    public Dica getDica() {
        return dica;
    }

    public UmaTentativa getTentativa() {
        return tentativa;
    }

    public JPanel getPainel() {
        return painel;
    }
}
