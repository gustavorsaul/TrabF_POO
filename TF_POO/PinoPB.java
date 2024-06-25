import java.awt.Color;
import java.awt.event.ActionEvent;


public class PinoPB extends Pino{
    private PinoPB(Cor cor){
        super(cor);
    }

    public static PinoPB criaPinoPreto(){
        return new PinoPB(new Cor("BLACK",Color.BLACK));
    }

    public static PinoPB criaPinoBranco(){
        return new PinoPB(new Cor("WHITE",Color.WHITE));
    }

    public static PinoPB criaPinoVazio(){
        return new PinoPB(new Cor("GRAY",Color.WHITE));
    }

    public void setCor(Cor cor){
        if (cor.getNomeCor().equals("BLACK") ||
            cor.getNomeCor().equals("WHITE") ||
            cor.getNomeCor().equals("GRAY")){
            super.setCor(cor);    
        }else{
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public void acaoDoBotao(ActionEvent e) {
        // Em princípio os pinos de pista não tem ação sobre o jogo quando acionados
    }
}
