package aula12;

import javax.swing.JOptionPane;

public class Cachorro extends Mamifero{
    
    protected  void enterrarOsso(){
        JOptionPane.showMessageDialog(null, "Osso enterrado");
    }
    
    protected  void abanarRabo(){
        JOptionPane.showMessageDialog(null, "Abanando rabo");
    }
    
    @Override
    protected void emitirSom(){
        JOptionPane.showMessageDialog(null, "AUUUUUUUUUUU !!!");
    }
}
