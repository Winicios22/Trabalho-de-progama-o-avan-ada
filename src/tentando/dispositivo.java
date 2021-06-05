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
public class dispositivo {
     ArrayList<Musica> arquivo = new ArrayList();
    ArrayList<PlayList> playlists = new ArrayList();
    private static dispositivo instance = null;
    
    public static dispositivo getInstance(){
        if(instance == null)
            instance = new dispositivo();
        return instance;
    }

    public ArrayList<Musica> getArquivo() {
        return arquivo;
    }

    public void setArquivo(ArrayList<Musica> arquivo) {
        this.arquivo = arquivo;
    }
    
    //----------------------------------------------------
    
    public void addMusicaDisp(String nome, String artista) {
       arquivo.add(new Musica(nome,artista));
       System.out.println("Nova musica " + nome + " - " + artista + " adicionado ao dispositivo ");
}
    
   public void criarPL(String nome){
       playlists.add(new PlayList(nome));
        System.out.println("Nova PlayList " + nome + " foi criada!");
   }
   
   public void listarPL() {

        for (int i = 0; i < this.playlists.size(); i++) {
            System.out.println(i + " - " + this.playlists.get(i).getNome());
        }
   }
}
