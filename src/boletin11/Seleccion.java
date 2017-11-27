/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

/**
 *
 * @author agonzalezgonzalez
 */
public class Seleccion {
    
     private String nome,apelido;
       int id,edade;
      public Seleccion(String nome,String apelido, int id,int edade){
      nome=nome;
      apelido=apelido;
      id=id;
      edade=edade;
}
      public Seleccion(){
          
      }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public int getId() {
        return id;
    }

    public int getEdade() {
        return edade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }
      
    public void concentrarse(){
        System.out.println("concentrarse a seleccion");

}
    public void viaxar() {
        System.out.println("viaxa a seleccion");
    }
    
    @Override
    public String toString() {
        return "Seleccion{" + "nome=" + nome + ", apelido=" + apelido + ", id=" + id + ", edade=" + edade + '}';
    
    
    }
   
}




