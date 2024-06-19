package Telas;

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
import Main.Pino;
import Main.PinoColorido;

public class TelaEscolha {
    
    private JFrame win;

    public void criaJanelaEscolhaSenha(){
    
        win = new JFrame("Escolha sua senha");
        //win.setSize(300, 200);

        JPanel linha1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha5 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JLabel tituloJogoSenha = new JLabel("JOGO DA SENHA");
        linha1.add(tituloJogoSenha);

        JLabel linhaVazia = new JLabel(" ");
        linha2.add(linhaVazia);

        JLabel linhaEscolhaSenha = new JLabel("ESCOLHA SUA SENHA");
        linha3.add(linhaEscolhaSenha);

        Pino[] pinos = new Pino[8];
        pinos[0] = PinoColorido.criaPinoColorido("BLUE");
        pinos[1] = PinoColorido.criaPinoColorido("BLUE");
        pinos[2] = PinoColorido.criaPinoColorido("RED");
        pinos[3] = PinoColorido.criaPinoColorido("RED");
        pinos[4] = PinoColorido.criaPinoColorido("YELLOW");
        pinos[5] = PinoColorido.criaPinoColorido("YELLOW");
        pinos[6] = PinoColorido.criaPinoColorido("GREEN");
        pinos[7] = PinoColorido.criaPinoColorido("GREEN");
        for(Pino p:pinos){
            linha4.add(p);
        }

        JButton botaoEnviarSenha = new JButton("ENVIAR");
        linha5.add(botaoEnviarSenha);

        Container painelDeConteudo = win.getContentPane();
        painelDeConteudo.setLayout(new BoxLayout(painelDeConteudo, BoxLayout.PAGE_AXIS));
        
        painelDeConteudo.add(linha1);
        painelDeConteudo.add(linha2);
        painelDeConteudo.add(linha3);
        painelDeConteudo.add(linha4);
        painelDeConteudo.add(linha5);

        botaoEnviarSenha.addActionListener(ev->trataEventoBotaoNovoJogo(ev));
        
        win.pack();
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    } 

    public void trataEventoBotaoNovoJogo(ActionEvent ev){

        TelaJogo app = new TelaJogo();    
        app.criaJanelaPrincipal();
           
    }

}
