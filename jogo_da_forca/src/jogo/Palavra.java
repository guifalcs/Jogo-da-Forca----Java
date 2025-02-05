package jogo;

import java.util.Arrays;
import java.util.List;

public class Palavra {
    private final List<String> palavras = Arrays.asList("Alex", "Pereira", "Poatan", "Charles", "do Bronx");
    private String palavraSecreta;
    private String palavraComChute;

    public void gerarPalavraSecreta(){
        var range = this.palavras.size();
        var index = (int) (Math.random() * range);

        this.palavraSecreta = this.palavras.get(index);
        this.palavraComChute = "_".repeat(this.palavraSecreta.length());
    }

    public void revelarLetra(String letra){
        for(int i= 0; i < this.palavraSecreta.length(); i++){
            if(this.palavraSecreta.charAt(i) == letra.charAt(0)){
                this.palavraComChute = this.palavraComChute.substring(0, i) + letra + this.palavraComChute.substring(i + 1);
            }
        }
    }

    public boolean palavraCompleta(){
        return !this.palavraComChute.contains("_");
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