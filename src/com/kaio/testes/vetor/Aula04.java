package com.kaio.testes.vetor;

import com.kaio.estruturadedados.vetor.Vetor;

public class Aula04 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.adicionarElemento(1);
        vetor.adicionarElemento(2);
        vetor.adicionarElemento(3);
        vetor.adicionarElemento(3);

        System.out.println(vetor.tamanho());
        System.out.println(vetor);
    }
}
