package boletin11;

public class Xogador extends Seleccion {

    private String demarcacion;
    private int dorsal;

    public Xogador(int id, String nome, String apelido, int edade) {
        super(nome, apelido, id, edade);
        String demarcacion;
        int dorsal;

    }

    public Xogador() {

    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public int getDorsal() {
        return dorsal;
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

    public void xogarPartido() {

    }

    @Override
    public void viaxar() {
        System.out.println("viaxan os xogadores");//To change body of generated methods, choose Tools | Templates.
    }

    public void entrenar() {

    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
