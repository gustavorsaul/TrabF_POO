

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

    private PinoColorido [] tentativaUm;
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

    private JLabel numPinoPretoUm;
    private JLabel numPinoBrancoUm;

    private JLabel numPinoPretoDois;
    private JLabel numPinoBrancoDois;
    
    private JLabel numPinoPretoTres;
    private JLabel numPinoBrancoTres;

    private JLabel numPinoPretoQuatro;
    private JLabel numPinoBrancoQuatro;

    private JLabel numPinoPretoCinco;
    private JLabel numPinoBrancoCinco;

    private JLabel numPinoPretoSeis;
    private JLabel numPinoBrancoSeis;

    private JLabel numPinoPretoSete;
    private JLabel numPinoBrancoSete;

    private JLabel numPinoPretoOito;
    private JLabel numPinoBrancoOito;


    private PinoColorido[] senha;

    private CriadorSenha criaSenha;

    private int numTentativas;

    public TelaEscolha(JFrame win, PinoColorido[] pinosEscolhaSenha) {
        this.win = win;
        this.tentativaUm = pinosEscolhaSenha;
        this.numPreto = 0;
        this.numBranco = 0;
        this.senha = new PinoColorido[4];
        this.criaSenha = new CriadorSenha(senha);
        this.numTentativas = 0;
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

        tentativaUm = new PinoColorido[4];
        tentativaUm[0] = PinoColorido.criaPinoColorido("RED");
        tentativaUm[1] = PinoColorido.criaPinoColorido("RED");
        tentativaUm[2] = PinoColorido.criaPinoColorido("RED");
        tentativaUm[3] = PinoColorido.criaPinoColorido("RED");
        tentativaUm[0].setEnabled(true);
        tentativaUm[1].setEnabled(true);
        tentativaUm[2].setEnabled(true);
        tentativaUm[3].setEnabled(true);

        for(Pino p:tentativaUm){
            linha1.add(p);
        }

        numPinoPretoUm = new JLabel(String.valueOf(numPreto));
        numPinoBrancoUm = new JLabel(String.valueOf(numBranco));

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
        tentativaDois[0].setEnabled(false);
        tentativaDois[1].setEnabled(false);
        tentativaDois[2].setEnabled(false);
        tentativaDois[3].setEnabled(false);


        for(Pino p:tentativaDois){
            linha2.add(p);
        }

        numPinoPretoDois = new JLabel(String.valueOf(numPreto));
        numPinoBrancoDois = new JLabel(String.valueOf(numBranco));
        
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
        tentativaTres[0].setEnabled(false);
        tentativaTres[1].setEnabled(false);
        tentativaTres[2].setEnabled(false);
        tentativaTres[3].setEnabled(false);
        
        for(Pino p:tentativaTres){
            linha3.add(p);
        }

        numPinoPretoTres = new JLabel(String.valueOf(numPreto));
        numPinoBrancoTres = new JLabel(String.valueOf(numBranco));

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
        tentativaQuatro[0].setEnabled(false);
        tentativaQuatro[1].setEnabled(false);
        tentativaQuatro[2].setEnabled(false);
        tentativaQuatro[3].setEnabled(false);
        
        for(Pino p:tentativaQuatro){
            linha4.add(p);
        }

        numPinoPretoQuatro = new JLabel(String.valueOf(numPreto));
        numPinoBrancoQuatro = new JLabel(String.valueOf(numBranco));

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
        tentativaCinco[0].setEnabled(false);
        tentativaCinco[1].setEnabled(false);
        tentativaCinco[2].setEnabled(false);
        tentativaCinco[3].setEnabled(false);
        
        for(Pino p:tentativaCinco){
            linha5.add(p);
        }

        numPinoPretoCinco = new JLabel(String.valueOf(numPreto));
        numPinoBrancoCinco = new JLabel(String.valueOf(numBranco));

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
        tentativaSeis[0].setEnabled(false);
        tentativaSeis[1].setEnabled(false);
        tentativaSeis[2].setEnabled(false);
        tentativaSeis[3].setEnabled(false);

        for(Pino p:tentativaSeis){
            linha6.add(p);
        }

        numPinoPretoSeis = new JLabel(String.valueOf(numPreto));
        numPinoBrancoSeis = new JLabel(String.valueOf(numBranco));

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
        tentativaSete[0].setEnabled(false);
        tentativaSete[1].setEnabled(false);
        tentativaSete[2].setEnabled(false);
        tentativaSete[3].setEnabled(false);

        for(Pino p:tentativaSete){
            linha7.add(p);
        }

        numPinoPretoSete = new JLabel(String.valueOf(numPreto));
        numPinoBrancoSete = new JLabel(String.valueOf(numBranco));

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
        tentativaOito[0].setEnabled(false);
        tentativaOito[1].setEnabled(false);
        tentativaOito[2].setEnabled(false);
        tentativaOito[3].setEnabled(false);

        for(Pino p:tentativaOito){
            linha8.add(p);
        }

        numPinoPretoOito = new JLabel(String.valueOf(numPreto));
        numPinoBrancoOito = new JLabel(String.valueOf(numBranco));

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

        senha[0].setEnabled(false);
        senha[1].setEnabled(false);
        senha[2].setEnabled(false);
        senha[3].setEnabled(false);


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

        for (int i = 0; i < senha.length; i ++) {
            System.out.println(senha[i].getCor());
        }

        

        botaoEnviarSenha.addActionListener(ev->trataEventoBotaoEnviar(ev));
        
        win.pack();
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    } 

    public void trataEventoBotaoEnviar(ActionEvent ev) {
        
        PinoColorido [] senhaTeste = new PinoColorido[4];
        

        numTentativas++;
        switch (numTentativas) {
            case 1:
                tentativaUm[0].setEnabled(false);
                tentativaUm[1].setEnabled(false);
                tentativaUm[2].setEnabled(false);
                tentativaUm[3].setEnabled(false);

                //for (int i = 0; i < senha.length; i ++) {
                //    System.out.println(senha[i].getCor());
                //}

                for (int i = 0; i < tentativaUm.length; i ++) {
                    System.out.println(tentativaUm[i].getCor());
                }

                comparaPinos(tentativaUm, senha);
                numPinoPretoUm.setText("" + numPreto);
                numPinoBrancoUm.setText("" + numBranco);

                tentativaDois[0].setEnabled(true);
                tentativaDois[1].setEnabled(true);
                tentativaDois[2].setEnabled(true);
                tentativaDois[3].setEnabled(true);
                break;
            case 2:
                tentativaDois[0].setEnabled(false);
                tentativaDois[1].setEnabled(false);
                tentativaDois[2].setEnabled(false);
                tentativaDois[3].setEnabled(false);

                tentativaTres[0].setEnabled(true);
                tentativaTres[1].setEnabled(true);
                tentativaTres[2].setEnabled(true);
                tentativaTres[3].setEnabled(true);
                break;
            case 4:
                tentativaTres[0].setEnabled(false);
                tentativaTres[1].setEnabled(false);
                tentativaTres[2].setEnabled(false);
                tentativaTres[3].setEnabled(false);

                tentativaQuatro[0].setEnabled(true);
                tentativaQuatro[1].setEnabled(true);
                tentativaQuatro[2].setEnabled(true);
                tentativaQuatro[3].setEnabled(true);
                break;
            case 5:
                tentativaQuatro[0].setEnabled(false);
                tentativaQuatro[1].setEnabled(false);
                tentativaQuatro[2].setEnabled(false);
                tentativaQuatro[3].setEnabled(false);

                tentativaCinco[0].setEnabled(true);
                tentativaCinco[1].setEnabled(true);
                tentativaCinco[2].setEnabled(true);
                tentativaCinco[3].setEnabled(true);
                break;
            case 6:
                tentativaCinco[0].setEnabled(false);
                tentativaCinco[1].setEnabled(false);
                tentativaCinco[2].setEnabled(false);
                tentativaCinco[3].setEnabled(false);

                tentativaSeis[0].setEnabled(true);
                tentativaSeis[1].setEnabled(true);
                tentativaSeis[2].setEnabled(true);
                tentativaSeis[3].setEnabled(true);
                break;
            case 7:
                tentativaSeis[0].setEnabled(false);
                tentativaSeis[1].setEnabled(false);
                tentativaSeis[2].setEnabled(false);
                tentativaSeis[3].setEnabled(false);

                tentativaSete[0].setEnabled(true);
                tentativaSete[1].setEnabled(true);
                tentativaSete[2].setEnabled(true);
                tentativaSete[3].setEnabled(true);
                break;
            case 8:
                tentativaSete[0].setEnabled(false);
                tentativaSete[1].setEnabled(false);
                tentativaSete[2].setEnabled(false);
                tentativaSete[3].setEnabled(false);

                tentativaOito[0].setEnabled(true);
                tentativaOito[1].setEnabled(true);
                tentativaOito[2].setEnabled(true);
                tentativaOito[3].setEnabled(true);
                break;
            case 9:
                // perdeu
                break;
        }

        
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
    
    /*
    public void comparaPinos (Pino[] primeiro, PinoColorido[] segundo) {

        numBranco = 0;
        numPreto = 0;

        for (int i = 0; i < primeiro.length - 1; i++) {
            if (primeiro[i] == (segundo[i])) {
                numPreto++;

            }
            else {
                for (int j = 0; j < primeiro.length - 1; j++) {
                    if (primeiro[j].equals(segundo[j]));
                    numBranco++;
                }
            }
        }
    }
         */

    public void comparaPinos(PinoColorido[] primeiro, PinoColorido[] segundo) {

        numBranco = 0;
        numPreto = 0;
            boolean[] marcadosPrimeiro = new boolean[primeiro.length];
            boolean[] marcadosSegundo = new boolean[segundo.length];
        
            // Contar pinos pretos (corretos na posição correta)
            for (int i = 0; i < primeiro.length; i++) {
                if (primeiro[i].getCor().equals(segundo[i].getCor())) {
                    numPreto++;
                    marcadosPrimeiro[i] = true;
                    marcadosSegundo[i] = true;
                    System.out.println("teste");
                }
            }
        
            // Contar pinos brancos (corretos na posição errada)
            for (int i = 0; i < primeiro.length; i++) {
                if (!marcadosPrimeiro[i]) {
                    for (int j = 0; j < segundo.length; j++) {
                        if (!marcadosSegundo[j] && primeiro[i].equals(segundo[j])) {
                            numBranco++;
                            marcadosSegundo[j] = true;
                            break;
                        }
                    }
                }
            }
         
        }
}
