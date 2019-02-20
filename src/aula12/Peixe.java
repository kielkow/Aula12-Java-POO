package aula12;

import javax.swing.JOptionPane;

public class Peixe extends Animal{
    
    
    private String corEscama;

    
    
    
    public Peixe(String corEscama) {
        this.corEscama = corEscama;
    }
    public Peixe() {
    }

    
    
    
    
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    
    protected final void soltarBolha(){
        JOptionPane.showMessageDialog(null, "000 Bolha 000");
    }

    @Override
    protected void locomover() {
        JOptionPane.showMessageDialog(null, "Nadando");
    }

    @Override
    protected void alimentar() {
        JOptionPane.showMessageDialog(null, "Comendo plantas marinhas");
    }

    @Override
    protected void emitirSom() {
        JOptionPane.showMessageDialog(null, "BLUUUUUB !!!");
    }
}
