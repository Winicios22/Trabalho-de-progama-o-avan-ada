/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tentando;

import java.util.ArrayList;

/**
 *
 * @author ufcju
 */
public class PlayList {
    private String nome ;
    ArrayList<Musica> pl = new ArrayList();

    public PlayList(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   

    public ArrayList<Musica> getPl() {
        return pl;
    }

    public void setPl(ArrayList<Musica> pl) {
        this.pl = pl;
    }

  
    
     public void addMusica(String nome) {
        
                pl.add(new Musica(nome));
                System.out.println("Nova musica " + nome + " - " + " adicionado a " + this.nome);
        
                 
         }
         

     public void listarMusica() {

        for (int i = 0; i < this.pl.size(); i++) {
            System.out.println(i + " - " + this.pl.get(i).getNome() + " - " + this.pl.get(i).getArtista());
        }
     }
}
