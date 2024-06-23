import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class App {
    private int nroTentativa;
    private JFrame frame;
    private Tentativas tentativas;

    public App(){
        nroTentativa = 0;
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
        contentPane.setLayout(new BorderLayout());

        contentPane.add(pnCtrl,BorderLayout.WEST);
        contentPane.add(tentativas.getPainel(),BorderLayout.CENTER);

        // Libera a primeira linha de tentativa
        tentativas.getTentativaComDica(nroTentativa).getTentativa().habilita();

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TelaInicio app = new TelaInicio();
                app.criaJanelaNovoJogo();
            }
        });
    }
}