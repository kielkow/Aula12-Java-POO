package aula12;

import javax.swing.JOptionPane;

public class Reptil extends Animal{
    
    
    private String corEscama;

    
    
    public Reptil(String corEscama) {
        this.corEscama = corEscama;
    }
    public Reptil() {
    }

    
    
    
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    protected void locomover() {
        JOptionPane.showMessageDialog(null, "Rastejando");
    }

    @Override
    protected void alimentar() {
        JOptionPane.showMessageDialog(null, "Comendo vegetais");
    }

    @Override
    protected void emitirSom() {
        JOptionPane.showMessageDialog(null, "KSSSSSS !!!");
    }
    
    
    
    
    
}
