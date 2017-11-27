package boletin11;

public class Boletin11 {

    public static void main(String[] args) {
        Seleccion sel = new Seleccion();
        Masaxista mas = new Masaxista();
        Xogador xo1 = new Xogador();
        Adestrador ades = new Adestrador();
        Seleccion xo2 = new Xogador();
        mas.concentrarse();
        xo1.concentrarse();
        ades.concentrarse();
        sel.concentrarse();
        //mostra se concentra a seleccion
        sel.viaxar();
        xo1.viaxar();
        
        ades.viaxar();
        mas.viaxar();
        //mostra viaxa a seleccion e viaxa...
        //da superclase non se poden instanciar metodos da subclase
        //xo1.concentrarse();
        //da subclase podense instanciar metodos da superclase
        
    }

}
