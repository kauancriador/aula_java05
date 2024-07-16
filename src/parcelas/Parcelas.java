/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcelas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author caio.alunos
 */
public class Parcelas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       double totalcompra, valorparcela;
       int numeroparcela;
       String nome;
         
         // 2 passo - entrada

        JOptionPane.showMessageDialog(null, "Seja bem vindo usuario!");
        
        nome = JOptionPane.showInputDialog("DIgite seu nome");
        
        totalcompra = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de Compras"));
        
        numeroparcela = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de pracelas"));
        
        //passo 3- processamento
        valorparcela = totalcompra / numeroparcela;
        
        // passo 4- saida
        JOptionPane.showMessageDialog(null, "Voce pagara em ate: parcelas " + valorparcela);
        
     }
    
}


 