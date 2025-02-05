package jogo;

import java.util.Scanner;
import java.util.ArrayList;

public class Jogo {
    private final Palavra palavra;
    private final Jogador jogador;

    public Jogo(Palavra palavra, Jogador jogador) {
        this.palavra = palavra;
        this.jogador = jogador;
    }

    public void iniciarJogo(){
        int numeroChutes = 10;
        ArrayList<String> chutes = new ArrayList<String>();

        this.palavra.gerarPalavraSecreta();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, " + jogador.getNome() + "! Vamos começar o jogo da forca!");
        System.out.println("Você tem " + numeroChutes + " chutes para adivinhar a palavra.");
        System.out.println(this.palavra.getPalavraComChute() + "\n");

        while(!this.palavra.palavraCompleta() && chutes.size() < numeroChutes){
            System.out.println("Digite seu chute:");
            var chute = scanner.nextLine();

            if(chutes.contains(chute)){
                System.out.println("Você já chutou essa letra. Tente outra.");
                continue;
            }

            chutes.add(chute);

            this.palavra.revelarLetra(chute);

            System.out.println("Palavra: " + this.palavra.getPalavraComChute());
            
            if(this.palavra.palavraCompleta()){
                System.out.println("Parabéns, você acertou a palavra!");
            } else {
                System.out.println("Chutes restantes: " + (numeroChutes - chutes.size()));
            }
        }
    }
}
