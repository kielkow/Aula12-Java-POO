package aula12;

import javax.swing.JOptionPane;

public class Mamifero extends Animal{
    
    private String corPelo;

    
    
    public Mamifero(String corPelo) {
        this.corPelo = corPelo;
    }

    public Mamifero() {
    }

    
    
    
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    protected void locomover() {
        JOptionPane.showMessageDialog(null, "Correndo");
    }

    @Override
    protected void alimentar() {
        JOptionPane.showMessageDialog(null, "Comendo");
    }

    @Override
    protected void emitirSom() {
        JOptionPane.showMessageDialog(null, "GRRRRRR !!!");
    }
    
    
    
    
    
}
