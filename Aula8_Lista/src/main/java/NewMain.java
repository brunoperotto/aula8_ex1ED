/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javax.swing.JOptionPane;

/**
 *
 * @author bperotto
 */
public class NewMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        String palavra;
        String inversa = "";
        
        palavra = JOptionPane.showInputDialog("Informe a palavra: ");
        
        for(int i = (palavra.length()-1); i>=0; i--){
            String m = Character.toString(palavra.charAt(i));
            inversa += palavra.charAt(i);
            pilha.push(m);
            pilha.pop();
        }
        
        if(inversa.equals(palavra)){
            System.out.println("É um palíndromo");
        }else{
            System.out.println("Não é um palíndromo");
        }
    }
}
