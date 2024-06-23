import java.awt.Color;

public class Cor {
    private String nomeCor;
    private Color cor;

    public Cor(String nomeCor, Color cor) {
        this.nomeCor = nomeCor;
        this.cor = cor;
    }

    public String getNomeCor() {
        return nomeCor;
    }

    public Color getCor() {
        return cor;
    }

    public String toString(){
        return getNomeCor();
    }
}
