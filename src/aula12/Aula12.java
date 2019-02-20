package aula12;

public class Aula12 {

    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        
        
        
        m.setPeso(70.5);
        m.setIdade(5);
        m.setMembros(4);
        m.setCorPelo("Preto");
        m.emitirSom();
        m.alimentar();
        m.locomover();
        
        
        p.setPeso(25);
        p.setIdade(2);
        p.setMembros(0);
        p.setCorEscama("Amarelo");
        p.alimentar();
        p.emitirSom();
        p.locomover();
        
        
        r.setPeso(10);
        r.setIdade(4);
        r.setMembros(4);
        r.setCorEscama("Marrom");
        r.alimentar();
        r.emitirSom();
        r.locomover();
        
        
        a.setPeso(7);
        a.setMembros(2);
        a.setIdade(80);
        a.setCorPena("Branca");
        a.alimentar();
        a.emitirSom();
        a.locomover();
        
        
        
        Cachorro c = new Cachorro();
        Canguru k = new Canguru();
        
        
        c.abanarRabo();
        c.enterrarOsso();
        c.locomover();
        
        k.locomover();
        
        
        
    }
    
}
