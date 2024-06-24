import java.util.Random;

public class CriadorSenha {
    
    private PinoColorido[] pinosSenha;

    

    public CriadorSenha(PinoColorido[] pinosSenha) {
        this.pinosSenha = pinosSenha;
    }

    public PinoColorido [] criaSenha() {

        PinoColorido[] senha = new PinoColorido[4];

        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            
            int n = rand.nextInt(4);
          
            switch (n) {

                case 0:
                    senha[i] = PinoColorido.criaPinoColorido("BLUE");
                    break;
                case 1:
                    senha[i] = PinoColorido.criaPinoColorido("RED");
                    break;
                case 2:
                    senha[i] = PinoColorido.criaPinoColorido("GREEN");  
                    break; 
                case 3:
                    senha[i] = PinoColorido.criaPinoColorido("YELLOW");
                    break;
            }
            //pinosSenha[i].setEnabled(false);
        }
        return senha;
    }
}
