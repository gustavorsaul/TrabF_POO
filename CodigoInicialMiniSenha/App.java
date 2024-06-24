import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;



public class App {
    private int nroTentativa;
    private JFrame frame;
    private Tentativas tentativas;
    private UmaTentativa linhaTentativa1;
    private PinoColorido[] pinos;
    private JPanel pnSenha;

    public App(){
        nroTentativa = 0;
        linhaTentativa1 = new UmaTentativa();
        //JPanel pnSenha = new JPanel();
        

    }

    public void verifica(){
        if (nroTentativa >= Tentativas.NROTEN-1){
            JOptionPane.showMessageDialog(frame, "Voce perdeu", "Fim de jogo", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        tentativas.getTentativaComDica(nroTentativa).getTentativa().desabilita();
        nroTentativa++;
        tentativas.getTentativaComDica(nroTentativa).getTentativa().habilita();


    }

    public void criaJanelaPrincipal() {
    

        pinos = new PinoColorido[4];
        JPanel pnSenha = new JPanel();

        //GeradorSenha senhaJogo = new GeradorSenha();
        App app = new App();
        
        frame = new JFrame("Hello World!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lbConfig = new JLabel("Controles");
        JButton btVerificar = new JButton("Verificar");
        btVerificar.addActionListener(e->verifica());
        JButton btSair = new JButton("Sair");
        btSair.addActionListener(e->System.exit(0));
        JPanel pnCtrl = new JPanel();
        pnCtrl.setLayout(new BoxLayout(pnCtrl, BoxLayout.PAGE_AXIS));
        pnCtrl.add(lbConfig);
        pnCtrl.add(btVerificar);
        pnCtrl.add(btSair);

        tentativas = new Tentativas();

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));

        contentPane.add(pnCtrl,BorderLayout.WEST);
        

        //contentPane.add(linhaTentativa1.getPainel(), BorderLayout.CENTER);
        //contentPane.add(linhaTentativa2.getPainel(), BorderLayout.CENTER);
        contentPane.add(tentativas.getPainel(),BorderLayout.CENTER);
        contentPane.add(app.geraSolucao(), BorderLayout.CENTER);

        // Libera a primeira linha de tentativa
        linhaTentativa1.habilita();
        tentativas.getTentativaComDica(nroTentativa).getTentativa().habilita();

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //TelaInicio app = new TelaInicio();
                //app.criaJanelaNovoJogo();

                TelaEscolha escolha = new TelaEscolha(null, null, null);
                escolha.criaJanelaEscolhaSenha();
            }
        });
    }

    
    
    public JPanel geraSolucao() {

        

        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            
            int n = rand.nextInt(8);
          
            switch (n) {

                case 1:
                    pinos[i] = PinoColorido.criaPinoColorido("GRAY");
                case 2:
                    pinos[i] = PinoColorido.criaPinoColorido("RED");
                case 3:
                    pinos[i] = PinoColorido.criaPinoColorido("GREEN");   
                case 4:
                    pinos[i] = PinoColorido.criaPinoColorido("YELLOW");
                case 5:
                    pinos[i] = PinoColorido.criaPinoColorido("BLUE");
                case 6:
                    pinos[i] = PinoColorido.criaPinoColorido("MAGENTA");
                case 7:
                    pinos[i] = PinoColorido.criaPinoColorido("ORANGE");
                case 0:
                    pinos[i] = PinoColorido.criaPinoColorido("PINK");
            }
            pinos[i].setEnabled(false);
        }

        pnSenha.setLayout(new BoxLayout(pnSenha, BoxLayout.LINE_AXIS));
        for(Pino p:pinos){
            pnSenha.add(p);
        }

        return pnSenha;

    }

    public JPanel getPainelSenha(){
        return pnSenha;
    }














}


