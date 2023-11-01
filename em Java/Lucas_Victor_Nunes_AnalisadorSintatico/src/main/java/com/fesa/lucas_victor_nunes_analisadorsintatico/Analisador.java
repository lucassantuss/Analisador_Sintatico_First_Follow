package com.fesa.lucas_victor_nunes_analisadorsintatico;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Analisador {
    private Stack<Character> pilha = new Stack<>();
    private String input;
    private int indiceAtual;

    private List<Character> terminais = new ArrayList<>();
    private List<Character> variaveis = new ArrayList<>();

    private String[][] tabelaTransicoes = {
        { "Aa", "Aa", "Aa" },       // S
        { "", "BD", "BD" },         // A
        { "-",  "b", "" },          // B
        { "",  "-", "d" },           // D
    };

    public boolean realizaAnalise(String input) {
        iniciaAnalisador(input);
        return validaInput();
    }

    private void iniciaAnalisador(String input) {
        pilha.clear();
        pilha.push('S');

        indiceAtual = 0;
        this.input = input.toLowerCase();
        
        terminais.add('a');
        terminais.add('b');
        terminais.add('d');
        
        variaveis.add('S');
        variaveis.add('A');
        variaveis.add('B');
        variaveis.add('D');
    }

    private boolean validaInput() {
        char simboloAtual;

        int posVariavel;
        int posTerminal;
        String valorEmpilhar;

        while (!pilha.isEmpty()) {
            simboloAtual = pilha.pop();

            if (verificaSeContem(simboloAtual, terminais)) {
                if (indiceAtual >= input.length() || input.charAt(indiceAtual) != simboloAtual)
                    return false;

                indiceAtual++;
            } else if (verificaSeContem(simboloAtual, variaveis)) {
                posVariavel = retornaPosicaoLista(simboloAtual, variaveis);

                if (indiceAtual >= input.length())
                    posTerminal = tabelaTransicoes[0].length - 1;
                else
                    posTerminal = retornaPosicaoLista(input.charAt(indiceAtual), terminais);

                if (posTerminal == -1)
                    return false;

                valorEmpilhar = tabelaTransicoes[posVariavel][posTerminal];

                if (valorEmpilhar.equals("-"))
                    return false;

                for (int i = valorEmpilhar.length() - 1; i >= 0; i--) {
                    pilha.push(valorEmpilhar.charAt(i));
                }
            } else {
                return false;
            }
        }

        return indiceAtual == input.length();
    }

    private boolean verificaSeContem(char simbolo, List<Character> lista) {
        return lista.contains(simbolo);
    }

    private int retornaPosicaoLista(char simbolo, List<Character> lista) {
        return lista.indexOf(simbolo);
    }
}