package com.fesa.lucas_victor_nunes_analisadorsintatico;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
        boolean continuar = true;

        while (continuar) {
            String input = JOptionPane.showInputDialog("Digite a entrada:");
            
            Analisador analisador = new Analisador();
            boolean resultado = analisador.realizaAnalise(input);

            if (resultado) {
                JOptionPane.showMessageDialog(null, "Válido");
            } else {
                JOptionPane.showMessageDialog(null, "Inválido");
            }

            int escolha = JOptionPane.showConfirmDialog(null, "Deseja digitar novamente?", "Escolha", JOptionPane.YES_NO_OPTION);

            if (escolha != JOptionPane.YES_OPTION) {
                continuar = false;
            }
        }
    }
}