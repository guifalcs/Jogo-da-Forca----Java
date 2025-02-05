import jogo.Jogador;
import jogo.Jogo;
import jogo.Palavra;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("");
        Jogador jogador = new Jogador("Alexo");
        Palavra palavra = new Palavra();
        Jogo jogo = new Jogo(palavra, jogador);

        jogo.iniciarJogo();        
    }
}
