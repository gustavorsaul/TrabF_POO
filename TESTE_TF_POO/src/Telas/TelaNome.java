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

public class TelaNome {

    private JFrame win;
    private JTextField entradaNome;
    private Integer [] numeroDificuldade = {4, 5, 6,};
    private JComboBox<Integer> listaQuantidades;

    public void criaJanelaDigitarNome(){
    
        win = new JFrame("Digite seu nome");
        win.setSize(300, 400);

        JPanel linha1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha6 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha7 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JLabel tituloJogoSenha = new JLabel("JOGO DA SENHA");
        linha1.add(tituloJogoSenha);

        JLabel linhaVazia = new JLabel(" ");
        linha2.add(linhaVazia);

        JLabel linhaDigiteNome = new JLabel("DIGITE SEU NOME");
        linha3.add(linhaDigiteNome);

        this.entradaNome = new JTextField(10);
        linha4.add(entradaNome);

        JLabel linhaEscolhaDificuldade = new JLabel("ESCOLHA A QUANTIDADE DE ITENS DA SENHA");
        linha5.add(linhaEscolhaDificuldade);

        listaQuantidades = new JComboBox<>(numeroDificuldade);
        listaQuantidades.setSelectedIndex(0);
        linha6.add(listaQuantidades);

        JButton botaoOk = new JButton("OK");
        linha7.add(botaoOk);

        Container painelDeConteudo = win.getContentPane();
        painelDeConteudo.setLayout(new BoxLayout(painelDeConteudo, BoxLayout.PAGE_AXIS));
        
        painelDeConteudo.add(linha1);
        painelDeConteudo.add(linha2);
        painelDeConteudo.add(linha3);
        painelDeConteudo.add(linha4);
        painelDeConteudo.add(linha5);
        painelDeConteudo.add(linha6);
        painelDeConteudo.add(linha7);
        
        
        botaoOk.addActionListener(ev->trataEventoBotaoNovoJogo(ev));

        //win.pack();
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    } 

    public void trataEventoBotaoNovoJogo(ActionEvent ev){

        TelaEscolha app = new TelaEscolha();    
        app.criaJanelaEscolhaSenha();
           
    }

}
