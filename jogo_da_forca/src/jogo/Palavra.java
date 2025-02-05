package jogo;

import java.util.Arrays;
import java.util.List;

public class Palavra {
    private final List<String> palavras = Arrays.asList("Alex", "Pereira", "Poatan", "Charles", "do Bronx");
    private String palavraSecreta;
    private String palavraComChute;

    public void gerarPalavraSecreta(){
        var range = this.palavras.size() - 1;
        var index = Math.random() * range;
    }

    public String getPalavraComChute() {
        return palavraComChute;
    }

    public String getPalavraSecreta() {
        return palavraSecreta;
    }

    public List<String> getPalavras() {
        return palavras;
    }

    public void setPalavraComChute(String palavraComChute) {
        this.palavraComChute = palavraComChute;
    }
}
