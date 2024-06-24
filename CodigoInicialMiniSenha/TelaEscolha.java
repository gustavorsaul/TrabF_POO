

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
import java.util.Random;


public class TelaEscolha {
    

    private JFrame win;
    private Pino [] tentativaUm;
    private Pino [] tentativaDois;
    private Pino [] tentativaTres;
    private Pino [] tentativaQuatro;
    private Pino [] tentativaCinco;
    private Pino [] tentativaSeis;
    private Pino [] tentativaSete;
    private Pino [] tentativaOito;
    
    private PinoPB[] pinos;

    private PinoColorido[] pinosSenha;

    private PinoPB pinoPreto;
    private PinoPB pinoBranco;

    private int numBranco;
    private int numPreto;

    private int tentativaUmPreto;
    private int tentativaUmBranco;
    
    private int tentativaDoisPreto;
    private int tentativaDoisBranco;

    private int tentativaTresPreto;
    private int tentativaTresBranco;

    private int tentativaQuatroPreto;
    private int tentativaQuatroBranco;

    private int tentativaCincoPreto;
    private int tentativaCincoBranco;

    private int tentativaSeisPreto;
    private int tentativaSeisBranco;

    private int tentativaSetePreto;
    private int tentativaSeteBranco;

    private int tentativaOitoPreto;
    private int tentativaOitoBranco;

    private PinoColorido[] senha;

    private CriadorSenha criaSenha;


    


    public TelaEscolha(JFrame win, Pino[] pinosEscolhaSenha) {
        this.win = win;
        this.tentativaUm = pinosEscolhaSenha;
        this.numPreto = 0;
        this.numBranco = 0;
        this.senha = new PinoColorido[4];
        this.criaSenha = new CriadorSenha(pinosSenha);
    }

    public void criaJanelaEscolhaSenha(){
    
        PinoColorido[] senha = criaSenha.criaSenha();
        
        //CriadorSenha metodoSenha = new CriadorSenha();

        //senha = metodoSenha.criaSenha();

        win = new JFrame("Jogo da Senha");
        //win.setSize(300, 200);

        

        JPanel topo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel linha2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel linha3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel linha4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel linha5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel linha6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel linha7 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel linha8 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel linha9 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha10= new JPanel(new FlowLayout(FlowLayout.CENTER));

        JLabel tituloJogoSenha = new JLabel("JOGO DA SENHA");
        topo.add(tituloJogoSenha);

        //JLabel linhaVazia = new JLabel(" ");
        //linha2.add(linhaVazia);

        //JLabel linhaEscolhaSenha = new JLabel("ESCOLHA SUA SENHA");
        //linha3.add(linhaEscolhaSenha);


        // primeira tentativa

        tentativaUm = new Pino[4];
        tentativaUm[0] = PinoColorido.criaPinoColorido("RED");
        tentativaUm[1] = PinoColorido.criaPinoColorido("RED");
        tentativaUm[2] = PinoColorido.criaPinoColorido("RED");
        tentativaUm[3] = PinoColorido.criaPinoColorido("RED");
        
        for(Pino p:tentativaUm){
            linha1.add(p);
        }

        JLabel numPinoPretoUm = new JLabel(String.valueOf(numPreto));
        JLabel numPinoBrancoUm = new JLabel(String.valueOf(numBranco));

        linha1.add(PinoPB.criaPinoPreto());
        linha1.add(numPinoPretoUm);
        linha1.add(PinoPB.criaPinoBranco());
        linha1.add(numPinoBrancoUm);


        // segunda

        tentativaDois = new Pino[4];
        tentativaDois[0] = PinoColorido.criaPinoColorido("RED");
        tentativaDois[1] = PinoColorido.criaPinoColorido("RED");
        tentativaDois[2] = PinoColorido.criaPinoColorido("RED");
        tentativaDois[3] = PinoColorido.criaPinoColorido("RED");
        
        for(Pino p:tentativaDois){
            linha2.add(p);
        }

        JLabel numPinoPretoDois = new JLabel(String.valueOf(numPreto));
        JLabel numPinoBrancoDois = new JLabel(String.valueOf(numBranco));
        
        linha2.add(PinoPB.criaPinoPreto());
        linha2.add(numPinoPretoDois);
        linha2.add(PinoPB.criaPinoBranco());
        linha2.add(numPinoBrancoDois);

        // terceira

        tentativaTres = new Pino[4];
        tentativaTres[0] = PinoColorido.criaPinoColorido("RED");
        tentativaTres[1] = PinoColorido.criaPinoColorido("RED");
        tentativaTres[2] = PinoColorido.criaPinoColorido("RED");
        tentativaTres[3] = PinoColorido.criaPinoColorido("RED");
        
        for(Pino p:tentativaTres){
            linha3.add(p);
        }

        JLabel numPinoPretoTres = new JLabel(String.valueOf(numPreto));
        JLabel numPinoBrancoTres = new JLabel(String.valueOf(numBranco));

        linha3.add(PinoPB.criaPinoPreto());
        linha3.add(numPinoPretoTres);
        linha3.add(PinoPB.criaPinoBranco());
        linha3.add(numPinoBrancoTres);

        // quarta

        tentativaQuatro = new Pino[4];
        tentativaQuatro[0] = PinoColorido.criaPinoColorido("RED");
        tentativaQuatro[1] = PinoColorido.criaPinoColorido("RED");
        tentativaQuatro[2] = PinoColorido.criaPinoColorido("RED");
        tentativaQuatro[3] = PinoColorido.criaPinoColorido("RED");
        
        for(Pino p:tentativaQuatro){
            linha4.add(p);
        }

        JLabel numPinoPretoQuatro = new JLabel(String.valueOf(numPreto));
        JLabel numPinoBrancoQuatro = new JLabel(String.valueOf(numBranco));

        linha4.add(PinoPB.criaPinoPreto());
        linha4.add(numPinoPretoQuatro);
        linha4.add(PinoPB.criaPinoBranco());
        linha4.add(numPinoBrancoQuatro);

        // quinta

        tentativaCinco = new Pino[4];
        tentativaCinco[0] = PinoColorido.criaPinoColorido("RED");
        tentativaCinco[1] = PinoColorido.criaPinoColorido("RED");
        tentativaCinco[2] = PinoColorido.criaPinoColorido("RED");
        tentativaCinco[3] = PinoColorido.criaPinoColorido("RED");
        
        for(Pino p:tentativaCinco){
            linha5.add(p);
        }

        JLabel numPinoPretoCinco = new JLabel(String.valueOf(numPreto));
        JLabel numPinoBrancoCinco = new JLabel(String.valueOf(numBranco));

        linha5.add(PinoPB.criaPinoPreto());
        linha5.add(numPinoPretoCinco);
        linha5.add(PinoPB.criaPinoBranco());
        linha5.add(numPinoBrancoCinco);

        // sexta

        tentativaSeis = new Pino[4];
        tentativaSeis[0] = PinoColorido.criaPinoColorido("RED");
        tentativaSeis[1] = PinoColorido.criaPinoColorido("RED");
        tentativaSeis[2] = PinoColorido.criaPinoColorido("RED");
        tentativaSeis[3] = PinoColorido.criaPinoColorido("RED");
        
        for(Pino p:tentativaSeis){
            linha6.add(p);
        }

        JLabel numPinoPretoSeis = new JLabel(String.valueOf(numPreto));
        JLabel numPinoBrancoSeis = new JLabel(String.valueOf(numBranco));

        linha6.add(PinoPB.criaPinoPreto());
        linha6.add(numPinoPretoSeis);
        linha6.add(PinoPB.criaPinoBranco());
        linha6.add(numPinoBrancoSeis);


        // setima

        tentativaSete = new Pino[4];
        tentativaSete[0] = PinoColorido.criaPinoColorido("RED");
        tentativaSete[1] = PinoColorido.criaPinoColorido("RED");
        tentativaSete[2] = PinoColorido.criaPinoColorido("RED");
        tentativaSete[3] = PinoColorido.criaPinoColorido("RED");

        for(Pino p:tentativaSete){
            linha7.add(p);
        }

        JLabel numPinoPretoSete = new JLabel(String.valueOf(numPreto));
        JLabel numPinoBrancoSete = new JLabel(String.valueOf(numBranco));

        linha7.add(PinoPB.criaPinoPreto());
        linha7.add(numPinoPretoSete);
        linha7.add(PinoPB.criaPinoBranco());
        linha7.add(numPinoBrancoSete);

        // oitava

        tentativaOito = new Pino[4];
        tentativaOito[0] = PinoColorido.criaPinoColorido("RED");
        tentativaOito[1] = PinoColorido.criaPinoColorido("RED");
        tentativaOito[2] = PinoColorido.criaPinoColorido("RED");
        tentativaOito[3] = PinoColorido.criaPinoColorido("RED");

        for(Pino p:tentativaOito){
            linha8.add(p);
        }

        JLabel numPinoPretoOito = new JLabel(String.valueOf(numPreto));
        JLabel numPinoBrancoOito = new JLabel(String.valueOf(numBranco));

        linha8.add(PinoPB.criaPinoPreto());
        linha8.add(numPinoPretoOito);
        linha8.add(PinoPB.criaPinoBranco());
        linha8.add(numPinoBrancoOito);

        // senha

        //linha9.add(senha[0]);
        //linha9.add(senha[1]);
        //linha9.add(senha[2]);
        //linha9.add(senha[3]);


        for(Pino p:senha){
            linha9.add(p);
        }


        JButton botaoEnviarSenha = new JButton("ENVIAR");
        linha10.add(botaoEnviarSenha);

        Container painelDeConteudo = win.getContentPane();
        painelDeConteudo.setLayout(new BoxLayout(painelDeConteudo, BoxLayout.PAGE_AXIS));
        
        painelDeConteudo.add(topo);
        painelDeConteudo.add(linha1);
        painelDeConteudo.add(linha2);
        painelDeConteudo.add(linha3);
        painelDeConteudo.add(linha4);
        painelDeConteudo.add(linha5);
        painelDeConteudo.add(linha6);
        painelDeConteudo.add(linha7);
        painelDeConteudo.add(linha8);
        painelDeConteudo.add(linha9);
        painelDeConteudo.add(linha10);

        

        botaoEnviarSenha.addActionListener(ev->trataEventoBotaoNovoJogo(ev));
        
        win.pack();
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    } 

    public void trataEventoBotaoNovoJogo(ActionEvent ev){

        //TelaJogo app = new TelaJogo();    
        //app.criaJanelaPrincipal();
           
    }

    public void habilita(){
        for(Pino p:pinosSenha){
            p.setEnabled(true);
        }
    }

    public void desabilita(){
        for(Pino p:pinosSenha){
            p.setEnabled(false);
        }
    }

    public PinoColorido [] criaSenha() {

        PinoColorido[] senha = new PinoColorido[4];

        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            
            int n = rand.nextInt(4);
          
            switch (n) {

                case 0:
                    pinosSenha[i] = PinoColorido.criaPinoColorido("BLUE");
                case 1:
                    pinosSenha[i] = PinoColorido.criaPinoColorido("RED");
                case 2:
                    pinosSenha[i] = PinoColorido.criaPinoColorido("GREEN");   
                case 3:
                    pinosSenha[i] = PinoColorido.criaPinoColorido("YELLOW");
            }
            pinosSenha[i].setEnabled(false);
        }
        return senha;
    }

    public void comparaPinos (PinoColorido[] primeiro, PinoColorido[] segundo) {

        numBranco = 0;
        numPreto = 0;

        for (int i = 0; i < primeiro.length; i++) {
            if (primeiro[i].equals(segundo[i])) {
                numPreto++;
            }
            else {
                for (int j = 0; i < primeiro.length; j++) {
                    
                }
            }

        }


    }
}

