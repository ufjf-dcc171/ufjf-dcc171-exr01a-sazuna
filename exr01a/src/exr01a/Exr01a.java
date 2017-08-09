/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exr01a;

import javax.swing.JOptionPane;

/**
 *
 * @author Master
 */
public class Exr01a {
    
    public static float lerDimensao(String dimensao) throws IllegalArgumentException{
        try{
            String text = JOptionPane.showInputDialog("Digite a " + dimensao);
            float value = Float.parseFloat(text);
            if(value <= 0){
                throw new IllegalArgumentException(dimensao + " deve ser maior que 0!");
            }
            return value;
        }catch(NullPointerException e){
            throw new IllegalArgumentException(dimensao + " é valor obrigatório!");
        }catch(NumberFormatException e){
            throw new IllegalArgumentException(dimensao + " inválida!");
        }
    }
    
    public static void main(String[] args) {
        try{
           float a = lerDimensao("altura");
           float l = lerDimensao("largura");
           float c = lerDimensao("comprimento");
           JOptionPane.showMessageDialog(null, a*l*c);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}
