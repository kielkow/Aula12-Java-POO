package aula12;

import javax.swing.JOptionPane;

public class Canguru extends Mamifero{
    
    
    protected void usarBolsa(){
        JOptionPane.showMessageDialog(null, "Usando Bolsa");
    }
    
    @Override
    protected void locomover(){
        JOptionPane.showMessageDialog(null, "Saltando");
    }
            
}
