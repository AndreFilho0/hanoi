package org.example;

import javax.swing.*;
import java.io.IOException;

public class Jogo {
    public static void main(String[] args) {
        TorreDeHonoi t1 = new TorreDeHonoi();

        try {

            t1.setNumDiscos(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "qual a quantidade de discos ?")));
            if (t1.getNumDiscos()<=0){
                JOptionPane.showMessageDialog(null,"não aceitamos valor negativo ou zero");
                return;
            }
            JOptionPane.showMessageDialog(null,"total de movimentos: "+t1.calculoQtMovimento());


        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"só aceito valor inteiro!");

        }

        }



    }

