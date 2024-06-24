import java.awt.Color;
import java.awt.event.ActionEvent;

public class PinoColorido extends Pino{

    protected PinoColorido(Cor cor) {
        super(cor);
    }

    public static PinoColorido criaPinoColorido(String nomeCor){
        Cor cor = Cores.getInstance().getCor(nomeCor);
        if (cor == null){
            throw new IllegalArgumentException("Cor invalida: "+nomeCor);
        }
        return new PinoColorido(cor);
    }

    @Override
    public void acaoDoBotao(ActionEvent e) {
        Cor novaCor = Cores.getInstance().proximaCor(getCor().getNomeCor());
        setCor(novaCor);
    }
}
