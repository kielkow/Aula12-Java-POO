package aula12;

import javax.swing.JOptionPane;

public class Ave extends Animal{
    
    private String corPena;

    
    
    
    public Ave(String corPena) {
        this.corPena = corPena;
    }
    public Ave() {
    }

    
    
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
    public final void fazerNinho(){
        JOptionPane.showMessageDialog(null, "Ninho feito");
    }

    @Override
    protected void locomover() {
        JOptionPane.showMessageDialog(null, "Voando");
    }

    @Override
    protected void alimentar() {
        JOptionPane.showMessageDialog(null, "Comendo ratos");
    }

    @Override
    protected void emitirSom() {
        JOptionPane.showMessageDialog(null, "PIIIIIUUU !!!");
    }
    
}
