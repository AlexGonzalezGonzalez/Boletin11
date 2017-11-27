package boletin11;

public class Masaxista extends Seleccion {

    private String titulacion;
    private int anosExperiencia;

    public Masaxista() {
    }

    public Masaxista(String titulacion, int anosExperiencia, String nome, String apelido, int id, int edade) {
        super(nome, apelido, id, edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public int getId() {
        return id;
    }

    public int getEdade() {
        return edade;
    }

    @Override
    public void concentrarse() {
        super.concentrarse(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void viaxar() {

        System.out.println("viaxa o masaxista");//To change body of generated methods, choose Tools | Templates.
    }

    public void darMasaxes() {

    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
