package com.kaio.estruturadedados.vetor;

import java.util.Arrays;

public class Vetor {

    private int[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new int[capacidade];
        this.tamanho = 0;
    }
//Metodo não muito eficiente
//    public void adicionarElemento(int elemento){
//        for (int i = 0; i < this.elementos.length; i++){
//            if (this.elementos[i] == 0){
//                this.elementos[i] = elemento;
//                break;
//            }
//        }
//    }

//    public void adicionarElemento(int elemento) throws Exception{
//        if (this.tamanho < this.elementos.length){
//            this.elementos[this.tamanho] = elemento;
//            this.tamanho++;
//        }else {
//            throw new Exception("Vetor com capacidade esgotada");
//        }
//    }

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

        for(int i = 0; i < this.tamanho-1; i++){
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
