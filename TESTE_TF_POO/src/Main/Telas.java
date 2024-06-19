package Main;



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

import Telas.TelaEscolha;
import Telas.TelaInicio;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class Telas {
    
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                //Telas app = new Telas();
                TelaInicio app = new TelaInicio();
                app.criaJanelaNovoJogo();        
                //app.criaJanelaDigitarNome();
                //app.criaJanelaDificuldade();
                //app.criaJanelaEscolhaSenha();
                //app.criaJanelaResultadoSenha1();
                //app.criaJanelaResultadoSenha2();
                //app.placarDeLideres();
            }
        }); 
    }
    
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

        Telas app = new Telas();    
        app.criaJanelaDigitarNome();
           
    }

    private JTextField entradaNome;

    public void criaJanelaDigitarNome(){
    
        win = new JFrame("Digite seu nome");
        win.setSize(300, 200);

        JPanel linha1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha4 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JLabel tituloJogoSenha = new JLabel("JOGO DA SENHA");
        linha1.add(tituloJogoSenha);

        JLabel linhaVazia = new JLabel(" ");
        linha2.add(linhaVazia);

        JLabel linhaDigiteNome = new JLabel("DIGITE SEU NOME");
        linha3.add(linhaDigiteNome);

        this.entradaNome = new JTextField(10);
        linha4.add(entradaNome);

        JButton botaoOk = new JButton("OK");
        linha4.add(botaoOk);

        Container painelDeConteudo = win.getContentPane();
        painelDeConteudo.setLayout(new BoxLayout(painelDeConteudo, BoxLayout.PAGE_AXIS));
        
        painelDeConteudo.add(linha1);
        painelDeConteudo.add(linha2);
        painelDeConteudo.add(linha3);
        painelDeConteudo.add(linha4);
        
        //win.pack();
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    } 

    private Integer [] numeroDificuldade = {4, 5, 6, 7, 8};
    private JComboBox<Integer> listaQuantidades;

    public void criaJanelaDificuldade(){
    
        win = new JFrame("Dificuldade");
        //win.setSize(300, 200);

        JPanel linha1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha4 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JLabel tituloJogoSenha = new JLabel("JOGO DA SENHA");
        linha1.add(tituloJogoSenha);

        JLabel linhaVazia = new JLabel(" ");
        linha2.add(linhaVazia);

        JLabel linhaEscolhaDificuldade = new JLabel("ESCOLHA A QUANTIDADE DE ITENS DA SENHA");
        linha3.add(linhaEscolhaDificuldade);

        listaQuantidades = new JComboBox<>(numeroDificuldade);
        listaQuantidades.setSelectedIndex(0);
        linha4.add(listaQuantidades);

        JButton botaoOk = new JButton("OK");
        linha4.add(botaoOk);

        Container painelDeConteudo = win.getContentPane();
        painelDeConteudo.setLayout(new BoxLayout(painelDeConteudo, BoxLayout.PAGE_AXIS));
        
        painelDeConteudo.add(linha1);
        painelDeConteudo.add(linha2);
        painelDeConteudo.add(linha3);
        painelDeConteudo.add(linha4);
        
        win.pack();
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    } 

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
        
        win.pack();
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    } 

    private Container painelDeConteudo;
    private JPanel linha7;

    public void criaJanelaResultadoSenha1(){
    
        win = new JFrame("Escolha sua senha");
        //win.setSize(300, 200);

        JPanel linha1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha6 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        linha7 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha8 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha9 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JLabel tituloJogoSenha = new JLabel("JOGO DA SENHA");
        linha1.add(tituloJogoSenha);

        JLabel linhaVazia = new JLabel(" ");
        linha2.add(linhaVazia);
        /*
        JLabel linhaTextoResultado = new JLabel("RESULTADO");
        linha3.add(linhaTextoResultado);

        Pino[] pinosResultado = new Pino[8];

        pinosResultado[0] = PinoPB.criaPinoBranco();
        pinosResultado[1] = PinoPB.criaPinoPreto();
        pinosResultado[2] = PinoPB.criaPinoPreto();
        pinosResultado[3] = PinoPB.criaPinoPreto();
        pinosResultado[4] = PinoPB.criaPinoBranco();
        pinosResultado[5] = PinoPB.criaPinoBranco();
        pinosResultado[6] = PinoPB.criaPinoPreto();
        pinosResultado[7] = PinoPB.criaPinoBranco();
        for(Pino p:pinosResultado){
            linha4.add(p);
        }
         */

        

        JLabel linhaEscolhaSenha = new JLabel("ESCOLHA SUA SENHA");
        linha5.add(linhaEscolhaSenha);

        JButton tentativa = new JButton("1");
        linha6.add(tentativa);

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
            linha6.add(p);
        }

        JLabel pretos = new JLabel("P: 3");
        JLabel brancos = new JLabel("B: 2");

        linha6.add(pretos);
        linha6.add(brancos);

        JButton botaoEnviarSenha = new JButton("ENVIAR");
        linha8.add(botaoEnviarSenha);

        JLabel textoTetativas = new JLabel("TENTATIVAS: ");
        linha9.add(textoTetativas);

        //JButton botaoOkSenha = new JButton("9");
        //linha8.add(botaoOkSenha);

        painelDeConteudo = win.getContentPane();
        painelDeConteudo.setLayout(new BoxLayout(painelDeConteudo, BoxLayout.PAGE_AXIS));
        
        painelDeConteudo.add(linha1);
        painelDeConteudo.add(linha2);
        painelDeConteudo.add(linha3);
        painelDeConteudo.add(linha4);
        painelDeConteudo.add(linha5);
        painelDeConteudo.add(linha6);
        painelDeConteudo.add(linha7);
        painelDeConteudo.add(linha8);
        painelDeConteudo.add(linha9);
        
        botaoEnviarSenha.addActionListener(ev->trataEventoBotaoJogo(ev));

        win.pack();
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    }

    public void trataEventoBotaoJogo(ActionEvent ev){

        JButton tentativa = new JButton("1");
        linha7.add(tentativa);

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
            linha7.add(p);
        }
           
    }

    public void criaJanelaResultadoSenha2(){
    
        win = new JFrame("Resultado");
        //win.setSize(300, 200);

        JPanel linha1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha6 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JLabel tituloJogoSenha = new JLabel("JOGO DA SENHA");
        linha1.add(tituloJogoSenha);

        JLabel linhaVazia = new JLabel(" ");
        linha2.add(linhaVazia);

        JLabel linhaTextoResultado = new JLabel("RESULTADO");
        linha3.add(linhaTextoResultado);

        Pino[] pinosResultado = new Pino[8];

        pinosResultado[0] = PinoPB.criaPinoBranco();
        pinosResultado[1] = PinoPB.criaPinoPreto();
        pinosResultado[2] = PinoPB.criaPinoPreto();
        pinosResultado[3] = PinoPB.criaPinoPreto();
        pinosResultado[4] = PinoPB.criaPinoBranco();
        pinosResultado[5] = PinoPB.criaPinoBranco();
        pinosResultado[6] = PinoPB.criaPinoPreto();
        pinosResultado[7] = PinoPB.criaPinoBranco();
        for(Pino p:pinosResultado){
            linha4.add(p);
        }

        JLabel textoTetativas = new JLabel("TENTATIVAS: ");
        linha5.add(textoTetativas);

        JButton numeroTentativa = new JButton("9");
        linha5.add(numeroTentativa);

        JButton botaoOk = new JButton("OK");
        linha6.add(botaoOk);

        Container painelDeConteudo = win.getContentPane();
        painelDeConteudo.setLayout(new BoxLayout(painelDeConteudo, BoxLayout.PAGE_AXIS));
        
        painelDeConteudo.add(linha1);
        painelDeConteudo.add(linha2);
        painelDeConteudo.add(linha3);
        painelDeConteudo.add(linha4);
        painelDeConteudo.add(linha5);
        painelDeConteudo.add(linha6);
        
        win.pack();
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    }

    private String [] nomeColunas = {"Nome", "Dificuldade", "Tentativas"};
    private Object [][] data = {{"Pedrinho", 6, 9}, {"Zezinho", 4, 5}, {"Mariazinha", 8, 15}, {"Joaozinho", 7, 12}, {"Aninha", 5, 3}};

    public void placarDeLideres(){
    
        win = new JFrame("Placar de resultados");
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

        JLabel linhaTextoResultado = new JLabel("PLACAR DE RESULTADOS");
        linha3.add(linhaTextoResultado);

        JTable tabela = new JTable(data, nomeColunas);

        JScrollPane scrollPane = new JScrollPane(tabela);
        tabela.setFillsViewportHeight(true);

        linha4.add(scrollPane);

        JButton botaoOk = new JButton("OK");
        linha5.add(botaoOk);

        Container painelDeConteudo = win.getContentPane();
        painelDeConteudo.setLayout(new BoxLayout(painelDeConteudo, BoxLayout.PAGE_AXIS));
        
        painelDeConteudo.add(linha1);
        painelDeConteudo.add(linha2);
        painelDeConteudo.add(linha3);
        painelDeConteudo.add(linha4);
        painelDeConteudo.add(linha5);
        
        win.pack();
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    }


}
    
