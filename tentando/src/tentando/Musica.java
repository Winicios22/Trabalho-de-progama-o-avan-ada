/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tentando;

/**
 *
 * @author ufcju
 */
public class Musica {
    
    
    private String nome;
    private String artista;

    public Musica(String nome, String artista) {
        this.nome = nome;
        this.artista = artista;
    }
    public Musica(String nome) {
        this.nome = nome;
       
    }

    public Musica() {
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
   
    
}
