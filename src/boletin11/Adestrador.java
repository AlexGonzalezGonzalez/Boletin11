package boletin11;

public class Adestrador extends Seleccion {

    private String idFederacion;

    public Adestrador(String idFederacion, String nome, String apelido, int id, int edade) {
        super(nome, apelido, id, edade);
        this.idFederacion = idFederacion;
    }

    public Adestrador() {
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    public String getIdFederacion() {
        return idFederacion;
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

        System.out.println("viaxa o adestrador");//To change body of generated methods, choose Tools | Templates.
    }

    public void dirixirPartido() {
    }

    public void dirixirAdestramento() {
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
