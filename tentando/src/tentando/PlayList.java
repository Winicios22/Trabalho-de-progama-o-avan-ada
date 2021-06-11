/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tentando;

import java.util.ArrayList;
import java.util.Iterator;
import tentando.IteratorUtil.iteratorMusica;


public class PlayList {
   
    private String nome ;
    iteratorMusica pl = new iteratorMusica();
    dispositivo ar = dispositivo.getInstance();
   
    public PlayList(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public iteratorMusica getPl() {
        return pl;
    }

    public void setPl(iteratorMusica pl) {
        this.pl = pl;
    }

    

     public void listarMusica() {
         System.out.println("-------------"+nome+"-------------");
        int i=0;
         while(pl.hasNext()){
            
            Musica musica = (Musica) pl.next();
            System.out.println(i + ":" + musica.getNome() + " - " + musica.getArtista());
            i++;
         }
         if(i == 0)
             System.out.println("PlayList vazia!");
        System.out.println("------------------------------");
     }
     
     public void addMusica(String nome, String artista) {
      
      if(vr(nome)== true){
           pl.add(new Musica(nome,artista));
            System.out.println("Nova musica " + nome + " - " + artista + " adicionado a PlayList: " + this.nome);
      }else{ System.out.println("Seu Dispositivo não possui a musica "+"'"+nome+"'");}
      
     }
     
     public void excluirMusic(int index){
      int i =0;
         while(pl.hasNext()){
           Musica pli = (Musica) pl.next();
        if(i == index){
            pl.remove(pli);
        }i++;
   }
     }
     
         public boolean vr(String nome){
             while(ar.arquivo.hasNext()){
           Musica musica = (Musica) ar.arquivo.next();
        if(musica.getNome().equals(nome))
            return true;
         }
        return false;
         }
}
