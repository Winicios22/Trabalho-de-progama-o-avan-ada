
package ProjectPL;

import java.util.ArrayList;
import ProjectPL.IteratorUtil.iteratorMusica;
import ProjectPL.IteratorUtil.iteratorPL;


public class dispositivo {
     iteratorMusica arquivo = new iteratorMusica();
    iteratorPL playlists = new iteratorPL();
    private static dispositivo instance = null;
    
    public static dispositivo getInstance(){
        if(instance == null)
            instance = new dispositivo();
        return instance;
    }

    public iteratorMusica getArquivo() {
        return arquivo;
    }

    public void setArquivo(iteratorMusica arquivo) {
        this.arquivo = arquivo;
    }

    public iteratorPL getPlaylists() {
        return playlists;
    }

    public void setPlaylists(iteratorPL playlists) {
        this.playlists = playlists;
    }

    
    //----------------------------------------------------
    
    public void addMusicaDisp(String nome, String artista) {
       arquivo.add(new Musica(nome,artista));
       System.out.println("Nova musica " + nome + " - " + artista + " adicionado ao dispositivo ");
}
    
   public void criarPL(String nome){
       if(vr(nome)!= true){
       playlists.add(new PlayList(nome));
        System.out.println("Nova PlayList " + nome + " foi criada!");
       }else{System.out.println("Já existe uma playlist com o nome "+ nome);}
   }
   
   public void excluirPL(int index){
       int i=0;
       while(playlists.hasNext()){
            PlayList pla = (PlayList) playlists.next();
            if(i == index){
                playlists.remove(pla);
       System.out.println("A playlist "+ pla.getNome() + " foi excluida com sucesso!");
            }
            i++;
        }
      
   }
   
   public void listarPL() {
       if(arquivo.hasNext() == true){
           int i = 0;
           System.out.println("-----------ALL PLAYLISTS-----------");
        while(playlists.hasNext()){
            PlayList pl = (PlayList) playlists.next();
            System.out.println(i + ":" + pl.getNome());
            i++;
        }
        System.out.println("-----------------------------------");
        }else{System.out.println("Nenhuma PlayList foi encontrada!");}
   }
   
   public void listarAllMusica() {
       int i = 0;
       System.out.println("-----------ALL MUSICS-----------");
        while(arquivo.hasNext()){
           Musica musica = (Musica) arquivo.next();
            System.out.println(i + ":" + musica.getNome() + " - " + musica.getArtista());
            i++;
        }
        System.out.println("---------------------------------");
   }
   
   public void addMusic(int index, int inde){
       int i = 0;
       while(playlists.hasNext()){
           PlayList pl = (PlayList) playlists.next();
        if(i == index){
            pl.addMusica(inde);
        }i++;
   }
   }
   
   public void listarMusicPL(int index){
       int i = 0;
       while(playlists.hasNext()){
           PlayList pl = (PlayList) playlists.next();
        if(i == index){
            pl.listarMusica();
        }i++;
   }
   }
   
   public void excluirMusicDisp(int index){
       int i = 0;
       while(arquivo.hasNext()){
           Musica pl = (Musica) arquivo.next();
        if(i == index){
            arquivo.remove(pl);
            System.out.println("A musica " + pl.getNome() + " - " + pl.getArtista() + " foi removida");
        }i++;
   }
   }
   
   public void excluirMusicPL(int index, int music){
        int i = 0;
       while(playlists.hasNext()){
           PlayList pl = (PlayList) playlists.next();
        if(i == index){
            pl.excluirMusic(music);
        }i++;
   }
   }
   
   public boolean vr(String nome){
        while(playlists.hasNext()){
           PlayList pl = (PlayList) playlists.next();
        if(pl.getNome().equals(nome))
            return true;
         }
        return false;
         }
}
