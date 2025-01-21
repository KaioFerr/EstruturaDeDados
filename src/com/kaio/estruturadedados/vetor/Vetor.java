package com.kaio.estruturadedados.vetor;

import java.util.Arrays;

public class Vetor {

    private int[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new int[capacidade];
        this.tamanho = 0;
    }

    public int getIndex (int elemento){
        for (int i = 0; i < this.tamanho; i++){
            if (this.elementos[i] == elemento){
                return i;
            }
        }
        return -1;
    }

    public int search (int position){
        if (!(position > 0 && position < this.tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[position];
    }


    public boolean adicionarElemento(int elemento) {
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0){
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");

        return s.toString();
    }
}
