package com.kaio.testes.vetor;

import com.kaio.estruturadedados.vetor.Vetor;

public class Aula05 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.adicionarElemento(1);
        vetor.adicionarElemento(2);
        vetor.adicionarElemento(3);

        System.out.println("posição: " + vetor.getIndex(2));
        System.out.println("Elemento na posicão 2: elemento " + vetor.search(2));
        System.out.println(vetor.search(4)); //posição inválida

    }
}
