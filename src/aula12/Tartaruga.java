package aula12;

import javax.swing.JOptionPane;

public class Tartaruga extends Reptil{
    
   @Override
   protected void locomover(){
       JOptionPane.showMessageDialog(null, "Andando bem devagar");
   }
}
