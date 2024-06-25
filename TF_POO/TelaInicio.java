
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class TelaInicio {
 
    private JFrame win;

    public void criaJanelaInicio(){ // cria a janela de inicio de jogo
    
        win = new JFrame("Jogo da Senha"); 
        win.setSize(300, 250); // tamanho da janela


        JPanel linha1 = new JPanel(new FlowLayout(FlowLayout.CENTER)); // linhas da janela
        JPanel linha2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha4 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JLabel tituloJogoSenha = new JLabel("JOGO DA SENHA"); // titulo da janela de inicio
        linha1.add(tituloJogoSenha);

        JLabel linhaVazia = new JLabel(" "); // linha vazia entre o titulo e os botoes
        linha2.add(linhaVazia);

        JButton botaoNovoJogo = new JButton("NOVO JOGO"); // botao de novo jogo normal
        linha3.add(botaoNovoJogo);

        JButton botaoTeste = new JButton("DEMO DE JOGO"); // botao de demo do jogo que aparece a senha
        linha4.add(botaoTeste);

        Container painelDeConteudo = win.getContentPane(); // painel de conteudo da janela
        painelDeConteudo.setLayout(new BoxLayout(painelDeConteudo, BoxLayout.PAGE_AXIS));
        
        painelDeConteudo.add(linha1); // adiciona as linhas ao painel de conteudo
        painelDeConteudo.add(linha2);
        painelDeConteudo.add(linha3);
        painelDeConteudo.add(linha4);

        botaoNovoJogo.addActionListener(ev->trataEventoBotaoNovoJogo(ev)); // funcao que trata o botao de novo jogo
        botaoTeste.addActionListener(ev->trataEventoBotaoDemoJogo(ev)); // funcao que trata o botao de demo do jogo

        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
        win.setResizable(false);
    } 

    public void trataEventoBotaoNovoJogo(ActionEvent ev){ // metodo que abre a janela de novo jogo

        TelaJogo jogo = new TelaJogo(win, null);
        jogo.criaJanelaJogo();
    }

    public void trataEventoBotaoDemoJogo(ActionEvent ev){ // metodo que abre a janela de demo do jogo

        TelaDemo demo = new TelaDemo(win, null);
        demo.criaJanelaDemo();
    }
}
