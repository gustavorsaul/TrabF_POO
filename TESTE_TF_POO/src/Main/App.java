package Main;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {
    public void criaJanelaPrincipal() {
        JFrame frame = new JFrame("Hello World!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());

        Pino[] pinos = new Pino[5];
        pinos[0] = PinoPB.criaPinoBranco();
        pinos[1] = PinoPB.criaPinoPreto();
        pinos[2] = PinoColorido.criaPinoColorido("BLUE");
        pinos[3] = PinoColorido.criaPinoColorido("RED");
        pinos[4] = PinoColorido.criaPinoColorido("YELLOW");
        for(Pino p:pinos){
            contentPane.add(p);
        }

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                App app = new App();
                app.criaJanelaPrincipal();
            }
        });
    }
}