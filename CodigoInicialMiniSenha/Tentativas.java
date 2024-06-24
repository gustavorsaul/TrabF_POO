import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class Tentativas {
    public static final int NROTEN = 5;
    private TentativaComDica[] tentativas;
    public JPanel painel;

    public Tentativas(){
        painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.PAGE_AXIS));
        tentativas = new TentativaComDica[NROTEN];
        for(int i=0;i<NROTEN;i++){
            tentativas[i] = new TentativaComDica();
            painel.add(tentativas[i].getPainel());
        }
    }

    public JPanel getPainel(){
        return painel;
    }

    public TentativaComDica getTentativaComDica(int i){
        return tentativas[i];
    }
}
