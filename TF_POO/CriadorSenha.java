
import java.util.Random;

public class CriadorSenha { // classe que gera a senha aleatoria
    
    public CriadorSenha(PinoColorido[] pinosSenha) { // construtor feito para a classe ser chamada dentro de outra classe
        
    }

    public PinoColorido [] criaSenha() { // metodo que retorna um arranjo de pinos coloridos aleatorio que sera usado como senha

        PinoColorido[] senha = new PinoColorido[4]; // cria o arranjo da senha de tamanho quatro

        Random rand = new Random(); // funcao random que gera valores aleatorios

        for (int i = 0; i < 4; i++) { // laco de repeticao do tamanho do arranjo da senha, preenchendo cada pino da senha
    
            int n = rand.nextInt(6); // determina o valor minimo e maximo "0-5" que o numero sera gerado aleatoriamente
          
            switch (n) { // switch do numero aleatorio que escolhe baseado no numero sorteado a cor de determinado pino
                case 0:
                    // posicao i do arranjo fica com a cor ao lado dependendo do caso, todos funcionam iguais
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
                case 4:
                    senha[i] = PinoColorido.criaPinoColorido("MAGENTA");
                    break;
                case 5:
                    senha[i] = PinoColorido.criaPinoColorido("ORANGE");
                    break;
            }
        }
        return senha; // retorna a senha com os valores aleatorios
    }
}
