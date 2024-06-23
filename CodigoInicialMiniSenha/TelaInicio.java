

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class TelaInicio {
 
    private JFrame win;

    public void criaJanelaNovoJogo(){
    
        win = new JFrame("Jogo da Senha");
        win.setSize(300, 250);


        JPanel linha1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha5 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JLabel tituloJogoSenha = new JLabel("JOGO DA SENHA");
        linha1.add(tituloJogoSenha);

        JLabel linhaVazia = new JLabel(" ");
        linha2.add(linhaVazia);

        JButton botaoNovoJogo = new JButton("NOVO JOGO");
        linha3.add(botaoNovoJogo);

        JButton botaoPlacar = new JButton("PLACAR");
        linha4.add(botaoPlacar);

        JButton botaoTeste = new JButton("TESTE DE JOGO");
        linha5.add(botaoTeste);

        Container painelDeConteudo = win.getContentPane();
        painelDeConteudo.setLayout(new BoxLayout(painelDeConteudo, BoxLayout.PAGE_AXIS));
        
        botaoNovoJogo.addActionListener(ev->trataEventoBotaoNovoJogo(ev));
        
        painelDeConteudo.add(linha1);
        painelDeConteudo.add(linha2);
        painelDeConteudo.add(linha3);
        painelDeConteudo.add(linha4);
        painelDeConteudo.add(linha5);

        //win.pack();
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    } 

    public void trataEventoBotaoNovoJogo(ActionEvent ev){

        TelaNome app = new TelaNome();    
        app.criaJanelaDigitarNome();
           
    }

}
