import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;


public abstract class Pino extends JButton {
    private Cor cor;

    protected Pino(Cor cor){
        super("O");
        this.setCor(cor);
        this.addActionListener(e->acaoDoBotao(e));
    }

    public Cor getCor(){
        return cor;
    }

    public void setCor(Cor cor){
        this.cor = cor;
        this.setForeground(cor.getCor());
        this.setBackground(cor.getCor());
    }

    public abstract void acaoDoBotao(ActionEvent e);
}
