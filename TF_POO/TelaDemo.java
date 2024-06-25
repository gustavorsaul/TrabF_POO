
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class TelaDemo {
    
    private JFrame win; // atributo da janela

    private PinoColorido [] tentativaUm;    // arranjo de pinos coloridos para cada uma das oito tentativas
    private PinoColorido [] tentativaDois;
    private PinoColorido [] tentativaTres;
    private PinoColorido [] tentativaQuatro;
    private PinoColorido [] tentativaCinco;
    private PinoColorido [] tentativaSeis;
    private PinoColorido [] tentativaSete;
    private PinoColorido [] tentativaOito;

    private PinoColorido[] pinosSenha;  // arranjo usado no metodo de ativar ou desativar os botoes para serem usados

    private int numPreto;   // numero inteiro que se refere a quantidade de pinos pretos em cada tentativa
    private int numBranco;  // numero inteiro que se refere a quantidade de pinos brancos em cada tentativa
    

    private JLabel numPinoPretoUm; //jlabel para cada um dos valores de cada pino preto e branco que aparecem na tela ao lado do arranjo das tentativas
    private JLabel numPinoBrancoUm; // foram feitos varios pois cada um tem seu valor especifico e podem receber set e serem alterados no andamento do jogo

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

    private PinoColorido[] senha; // arranjo da senha

    private CriadorSenha criaSenha; // referencia a classe que faz a geracao de senha aleatoria do jogo

    private int numTentativas; // valor int que se refere ao numero de tentativas que eh usado dentro do algoritmo do jogo

    private JFrame frame; // jframe usado para criar a janela de vitoria ou derrota

    public TelaDemo(JFrame win, PinoColorido[] senha) { // parametros com a janela gerada e referencia a senha
        this.win = win;
        this.numPreto = 0; // valor dos pinos pretos iniciando em zero
        this.numBranco = 0; // // valor dos pinos brancos iniciando em zero
        this.senha = senha; // construtor da senha
        this.criaSenha = new CriadorSenha(senha); // contrutor da classe que gera a senha
        this.numTentativas = 0; // numero de tentativas iniciando em zero
    }

    public void criaJanelaDemo(){
    
        senha = new PinoColorido[4]; // senha criada com seu tamanho
        senha = criaSenha.criaSenha(); // metodo da classe CriadorSenha que gera uma senha aleatoria 

        win = new JFrame("Jogo da Senha"); // nome da janela
        win.setSize(500, 600); // tamanho da janela

        JPanel topo = new JPanel(new FlowLayout(FlowLayout.CENTER)); // criacao das linhas do painel que sao todas centralizadas
        JPanel linha1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha6 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha7 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha8 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha9 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha10= new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel linha11= new JPanel(new FlowLayout(FlowLayout.CENTER));

        JLabel tituloJogoSenha = new JLabel("JOGO DA SENHA"); // titulo no topo da janela
        topo.add(tituloJogoSenha); // adiciona o titulo no topo da janela

        // todas as tentativas abaixo sao feitas igualmente, portanto so sera comentado sobre a primeira

        // primeira tentativa

        tentativaUm = new PinoColorido[4]; // cria o arranjo da primeira tentativa
        tentativaUm[0] = PinoColorido.criaPinoColorido("RED"); // define uma cor inicial para o pino que podera ser alterada depois
        tentativaUm[1] = PinoColorido.criaPinoColorido("RED"); // define uma cor inicial para o pino que podera ser alterada depois
        tentativaUm[2] = PinoColorido.criaPinoColorido("RED"); // define uma cor inicial para o pino que podera ser alterada depois
        tentativaUm[3] = PinoColorido.criaPinoColorido("RED"); // define uma cor inicial para o pino que podera ser alterada depois
        tentativaUm[0].setEnabled(true); // inicia a primeira tentativa com os botoes ativados
        tentativaUm[1].setEnabled(true);
        tentativaUm[2].setEnabled(true);
        tentativaUm[3].setEnabled(true);

        for(Pino p:tentativaUm){ // adiciona a tentativa um na primeira linha da janela por meio de um laco de repeticao
            linha1.add(p);
        }

        numPinoPretoUm = new JLabel(String.valueOf(numPreto)); // cria o valor do primeiro pino preto que ja esta iniciado no comeco do codigo nos privates
        numPinoBrancoUm = new JLabel(String.valueOf(numBranco)); // cria o valor do primeiro pino branco que ja esta iniciado no comeco do codigo nos privates

        linha1.add(PinoPB.criaPinoPreto()); // adiciona o pino preto na primeira linha ao lado da tentativa
        linha1.add(numPinoPretoUm); // adiciona o valor do pino preto
        linha1.add(PinoPB.criaPinoBranco()); // adiciona o pino branco na primeira linha ao lado da tentativa
        linha1.add(numPinoBrancoUm); // adiciona o valor do pino branco

        // segunda tentativa, feita igual a primeira

        tentativaDois = new PinoColorido[4];
        tentativaDois[0] = PinoColorido.criaPinoColorido("RED");
        tentativaDois[1] = PinoColorido.criaPinoColorido("RED");
        tentativaDois[2] = PinoColorido.criaPinoColorido("RED");
        tentativaDois[3] = PinoColorido.criaPinoColorido("RED");
        tentativaDois[0].setEnabled(false); // a partir da segunda tentativa ate a ultima os botoes sao colocados desativados
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

        // terceira tentativa

        tentativaTres = new PinoColorido[4];
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

        // quarta tentativa

        tentativaQuatro = new PinoColorido[4];
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

        // quinta tentativa

        tentativaCinco = new PinoColorido[4];
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

        // sexta tentativa

        tentativaSeis = new PinoColorido[4];
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


        // setima tentativa

        tentativaSete = new PinoColorido[4];
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

        // oitava tentativa

        tentativaOito = new PinoColorido[4];
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

        // solucao

        JLabel solucao = new JLabel("SOLUCAO"); // linha da solucao
        linha9.add(solucao); // adiciona a linha abaixo de todas as tentativas

        for (Pino p:senha){ // adiciona a senha gerada aleatoriamente no comeco do codigo
            linha10.add(p);
        }

        senha[0].setEnabled(false); // deixa a senha desabilitada, pois so serve para visualizacao no teste
        senha[1].setEnabled(false);
        senha[2].setEnabled(false);
        senha[3].setEnabled(false);

        JButton botaoEnviarSenha = new JButton("ENVIAR"); // botao para enviar a tentativa
        linha11.add(botaoEnviarSenha); // adiciona o botao na ultima linha 

        Container painelDeConteudo = win.getContentPane(); // cria o painel de conteudo da janela
        painelDeConteudo.setLayout(new BoxLayout(painelDeConteudo, BoxLayout.PAGE_AXIS));
        
        painelDeConteudo.add(topo); // adiciona todas as linhas no painel de conteudo para ficarem visiveis na janela
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
        painelDeConteudo.add(linha11);

        botaoEnviarSenha.addActionListener(ev->trataEventoBotaoEnviar(ev)); // acao que responde quando o botao eh apertado e aciona o metodo
        
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
        win.setResizable(false); // bloqueia a janela de ser ajustada
    } 

    public void trataEventoBotaoEnviar(ActionEvent ev) { // metodo executado apos apetar no botao enviar
        
        numTentativas++; // muda o valor do numero de tentativas a cada vez que se aperta no botao enviar
        switch (numTentativas) { // switch com o numero de tentativas, que controla a ativacao dos botoes de cada linha e edita os 
                                // valores dos numeros ao lado dos pinos pretos e brancos
            case 1:
                tentativaUm[0].setEnabled(false); // desativa os botoes da primeira tentativa
                tentativaUm[1].setEnabled(false);
                tentativaUm[2].setEnabled(false);
                tentativaUm[3].setEnabled(false);

                comparaPinos(tentativaUm, senha); // chama o metodo de comparar os pinos e que devolve a dica
                numPinoPretoUm.setText("" + numPreto); // o metodo de cima muda os valores da variavel "numPreto" e o setText altera ela na janela
                numPinoBrancoUm.setText("" + numBranco); // o metodo de cima muda os valores da variavel "numBranco" e o setText altera ela na janela

                tentativaDois[0].setEnabled(true); // ativa os botoes da segunda tentativa
                tentativaDois[1].setEnabled(true);
                tentativaDois[2].setEnabled(true);
                tentativaDois[3].setEnabled(true);
                break;
            case 2: 
                tentativaDois[0].setEnabled(false); // desativa os botoes da segunda tentativa
                tentativaDois[1].setEnabled(false);
                tentativaDois[2].setEnabled(false);
                tentativaDois[3].setEnabled(false);

                comparaPinos(tentativaDois, senha); // repete o que fez acima mas na segunda linha
                numPinoPretoDois.setText("" + numPreto);
                numPinoBrancoDois.setText("" + numBranco);

                tentativaTres[0].setEnabled(true);  // ativa os botoes da terceira tentativa
                tentativaTres[1].setEnabled(true);
                tentativaTres[2].setEnabled(true);
                tentativaTres[3].setEnabled(true);
                break;
            case 4:
                tentativaTres[0].setEnabled(false); // desativa os botoes da terceira tentativa
                tentativaTres[1].setEnabled(false);
                tentativaTres[2].setEnabled(false);
                tentativaTres[3].setEnabled(false);

                comparaPinos(tentativaTres, senha);
                numPinoPretoTres.setText("" + numPreto);
                numPinoBrancoTres.setText("" + numBranco);

                tentativaQuatro[0].setEnabled(true); // ativa os botoes da quarta tentativa
                tentativaQuatro[1].setEnabled(true);
                tentativaQuatro[2].setEnabled(true);
                tentativaQuatro[3].setEnabled(true);
                break;
            case 5:
                tentativaQuatro[0].setEnabled(false); // desativa os botoes da quarta tentativa
                tentativaQuatro[1].setEnabled(false);
                tentativaQuatro[2].setEnabled(false);
                tentativaQuatro[3].setEnabled(false);

                comparaPinos(tentativaQuatro, senha);
                numPinoPretoQuatro.setText("" + numPreto);
                numPinoBrancoQuatro.setText("" + numBranco);

                tentativaCinco[0].setEnabled(true); // ativa os botoes da quinta tentativa
                tentativaCinco[1].setEnabled(true);
                tentativaCinco[2].setEnabled(true);
                tentativaCinco[3].setEnabled(true);
                break;
            case 6:
                tentativaCinco[0].setEnabled(false); // desativa os botoes da quinta tentativa
                tentativaCinco[1].setEnabled(false);
                tentativaCinco[2].setEnabled(false);
                tentativaCinco[3].setEnabled(false);

                comparaPinos(tentativaCinco, senha);
                numPinoPretoCinco.setText("" + numPreto);
                numPinoBrancoCinco.setText("" + numBranco);

                tentativaSeis[0].setEnabled(true); // ativa os botoes da sexta tentativa
                tentativaSeis[1].setEnabled(true);
                tentativaSeis[2].setEnabled(true);
                tentativaSeis[3].setEnabled(true);
                break;
            case 7:
                tentativaSeis[0].setEnabled(false); // desativa os botoes da sexta tentativa
                tentativaSeis[1].setEnabled(false);
                tentativaSeis[2].setEnabled(false);
                tentativaSeis[3].setEnabled(false);

                comparaPinos(tentativaSeis, senha);
                numPinoPretoSeis.setText("" + numPreto);
                numPinoBrancoSeis.setText("" + numBranco);

                tentativaSete[0].setEnabled(true); // ativa os botoes da setima tentativa
                tentativaSete[1].setEnabled(true);
                tentativaSete[2].setEnabled(true);
                tentativaSete[3].setEnabled(true);
                break;
            case 8:
                tentativaSete[0].setEnabled(false); // desativa os botoes da setima tentativa
                tentativaSete[1].setEnabled(false);
                tentativaSete[2].setEnabled(false);
                tentativaSete[3].setEnabled(false);

                comparaPinos(tentativaSete, senha);
                numPinoPretoSete.setText("" + numPreto);
                numPinoBrancoSete.setText("" + numBranco);

                tentativaOito[0].setEnabled(true); // ativa os botoes da oitava tentativa
                tentativaOito[1].setEnabled(true);
                tentativaOito[2].setEnabled(true);
                tentativaOito[3].setEnabled(true);
                break;
            case 9:
                tentativaOito[0].setEnabled(false); // desativa os botoes da oitava tentativa
                tentativaOito[1].setEnabled(false);
                tentativaOito[2].setEnabled(false);
                tentativaOito[3].setEnabled(false);

                comparaPinos(tentativaOito, senha); // faz novamente a comparacao apenas para exibir na tela
                numPinoPretoOito.setText("" + numPreto); // atualiza os valores da oitava tentativa
                numPinoBrancoOito.setText("" + numBranco); 
                
                // caso a oitava tentativa nao tenha resultado em vitoria tudo do "case 9" ocorrera, como acima, e sera chamada uma janela de mensagem
                // janela de derrota
                JOptionPane.showMessageDialog(frame, "VOCE PERDEU! TENTE NOVAMENTE!", "Fim de jogo", JOptionPane.INFORMATION_MESSAGE); 
                System.exit(0); // ao fechar a janela fecha o jogo
                // perdeu
                break;
        }
    }

    public void habilita(){ // metodo feito pelo professor que habilita os pinos para serem utilizados
        for(Pino p:pinosSenha){
            p.setEnabled(true);
        }
    }

    public void desabilita(){ // metodo feito pelo professor que desabilita os pinos impossibilitanto eles de serem clicados
        for(Pino p:pinosSenha){
            p.setEnabled(false);
        }
    }

    public void comparaPinos(PinoColorido[] primeiro, PinoColorido[] segundo) {

        numBranco = 0; // variaveis de pinos brancos e pretos sao zeradas novamente a cada executao da comparacao da senha, 
        numPreto = 0;  // para evitar o acumulo de valores das tentativas anteriores

            boolean[] pretosMarcados = new boolean[primeiro.length]; // arranjos que sinalizam quais pinos ja foram comparados na repeticao
            boolean[] brancosMarcados = new boolean[segundo.length];
        
            // verifica se a senha esta totalmente correta
            if (primeiro[0].getCor().equals(segundo[0].getCor()) && primeiro[1].getCor().equals(segundo[1].getCor()) && // verifica item por item da senha
                primeiro[2].getCor().equals(segundo[2].getCor()) && primeiro[3].getCor().equals(segundo[3].getCor())) { // para evitar erros
                    // em caso de vitoria, assim como na derrota, eh aberta uma janela de aviso que o jogador ganhou
                    JOptionPane.showMessageDialog(frame, "VOCÊ VENCEU! PARABÉNS!", "Fim de jogo", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
            // conta a quantidade de pinos pretos, ou seja, na posicao correta
            for (int i = 0; i < primeiro.length; i++) {
                if (primeiro[i].getCor().equals(segundo[i].getCor())) { // verifica se os pinos da senha e da tentativa na posicao i tem a mesma cor
                    numPreto++; // aumenta o numero de pinos pretos que sera usado na tentativa dentro do switch ja visto posteriormente
                    pretosMarcados[i] = true; // marca o primeiro pino do arranjo como marcado, impossibilitanto colocar outro no lugar
                    brancosMarcados[i] = true; // marca o primeiro pino do arranjo branco tambem, para que nao hajam repeticoes de pinos brancos
                }
            }
            // conta a quantidade de pinos brancos, ou seja, na posicao incorreta
            for (int i = 0; i < primeiro.length; i++) {
                if (!pretosMarcados[i]) { // verifica se o arranjo de boolean nao ha nada naquela posicao, ou seja, se nao foi colocado nenhum pino preto anteriormente
                    for (int j = 0; j < segundo.length; j++) { // se a posicao esta vazia, entra no laco
                        // alem de verificar se as cores da senha e da tentativa sao iguais, tambem verifica se nao ha pino branco ja colocado naquela posicao
                        if (!brancosMarcados[j] && primeiro[i].getCor().equals(segundo[j].getCor())) { 
                            // caso nao haja pinos brancos ocupados na posicao
                            numBranco++; // aumenta o numero de pinos brancos que sera usado na tentativa dentro do switch ja visto posteriormente
                            brancosMarcados[j] = true; // marca essa posicao do arranjo de boolean que verifica posicoes como verdade
                            break;
                    }
                }
            }
        }
    }
}
