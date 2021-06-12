
package ProjectPL;

import java.util.Scanner;


public class Facade {

    public Facade() {
    }
    dispositivo c = dispositivo.getInstance();
    
    public void play(){
        
        Scanner scanner = new Scanner(System.in);
        boolean fechar = false;
        while(!fechar){
            menu();
            int escolher = scanner.nextInt();
            switch(escolher){
                case 1:
                    menuPL();
                 break;
                case 2:
                   menuMusic();
                 break;
                case 3:
                    fechar=true;
                 break;
            }
        }
}
    
    private void menu(){
        System.out.println("================Menu principal================");
        System.out.println("      Digite a opçoes: ");
        System.out.println("(1)   PlayLists ");
        System.out.println("(2)   All Musics ");
        System.out.println("(3)   Fechar o programa ");
        System.out.println("==============================================");
    } 
    
    private void menuPL(){
                    
         dispositivo c = dispositivo.getInstance();
         Scanner scanner = new Scanner(System.in);
        boolean f = false;
        while(!f){
                    listarPL();
                    
                    System.out.println("=============Menu de PlayLists=============");
                    System.out.println("      Escolha a opçoes: ");
                    System.out.println("(1)   Selecionar PlayList");
                    System.out.println("(2)   Criar PlayList");
                    System.out.println("(3)   Excluir PlayList");
                    System.out.println("(4)   Voltar");
                    System.out.println("===========================================");
                    
                    int i = scanner.nextInt();
                    
                    Scanner scanner2 = new Scanner(System.in);
                    
                    if(i==1){
                        System.out.println("Digite o id da Playlist que deseja selecionar");
                        int id = scanner.nextInt();
                        listarMusicPL(id);
                        musicasPL(id);
                    }
                    if(i==2){
                        System.out.println("Digite o nome da sua Playlist:");
                         String nome = scanner2.nextLine();
                        criarPL(nome);
                    }
                    if(i==3){
                        System.out.println("Digite o id da playlist que deseja excluir");
                        int id = scanner2.nextInt();
                        excluirPL(id);
                    }
                    if(i==4){f=true;}
        }
        }
    
    private void menuMusic(){
         
         dispositivo c = dispositivo.getInstance();
         Scanner scanner = new Scanner(System.in);
        
         boolean f = false;
        while(!f){
                    listarAllMusica();
                    
                    System.out.println("==============Menu de Musicas==============");
                    System.out.println("      Escolha a opçoes: ");
                    System.out.println("(1)   Adicionar Musica");
                    System.out.println("(2)   Excluir Musica");
                    System.out.println("(3)   Voltar");
                    System.out.println("===========================================");
                    
                     Scanner escolher2 = new Scanner(System.in);
                    
                    int j = escolher2.nextInt();
                    if(j==1){
                        Scanner scanner3 = new Scanner(System.in);
                        System.out.println("Digite o nome da musica:");
                        String musica = scanner3.nextLine();
                        System.out.println("Digite o nome da banda:");
                        String banda = scanner3.nextLine();
                        
                        addMusicaDisp(musica, banda);
                        
                    }
                    if(j==2){
                        Scanner scan = new Scanner(System.in);
                         System.out.println("Digite o id da musica que deseja excluir");
                        int id = scan.nextInt();
                         excluirMusicDisp(id);
                         
                    }
                    if(j==3){f=true;}
                    
        }
    }
    
    private void musicasPL(int id){
        dispositivo c = dispositivo.getInstance();
         Scanner scanner = new Scanner(System.in);
      
        boolean f = false;
        while(!f){
                    listarMusicPL(id);
                    System.out.println("=============Menu de Musicas=============");
                    System.out.println("      Escolha a opçoes: ");
                    System.out.println("(1)   Adicionar Musica");
                    System.out.println("(2)   Excluir Musica");
                    System.out.println("(3)   Voltar");
                    System.out.println("===========================================");
                    
                     Scanner escolher2 = new Scanner(System.in);
                    
                    int j = escolher2.nextInt();
                    if(j==1){
                        Scanner scanner3 = new Scanner(System.in);
                        listarAllMusica();
                        System.out.println("Digite o id da musica que deseja adicionar a playlist:");
                        int musica = scanner3.nextInt();
                        addMusic(id, musica);
                        
                    }
                    if(j==2){
                        Scanner scan = new Scanner(System.in);
                        listarMusicPL(id);
                         System.out.println("Digite o id da musica que deseja excluir");
                        int music = scan.nextInt();
                        excluirMusicPL(id,music);
                         
                    }
                    if(j==3){f=true;}
                    }
        }
    
       public void addMusicaDisp(String nome, String artista) {
       c.arquivo.add(new Musica(nome,artista));
       System.out.println("Nova musica " + nome + " - " + artista + " adicionado ao dispositivo ");
}
    
   public void criarPL(String nome){
       if(vr(nome)!= true){
       c.playlists.add(new PlayList(nome));
        System.out.println("Nova PlayList " + nome + " foi criada!");
       }else{System.out.println("Já existe uma playlist com o nome "+ nome);}
   }
   
   public void excluirPL(int index){
       int i=0;
       while(c.playlists.hasNext()){
            PlayList pla = (PlayList) c.playlists.next();
            if(i == index){
                c.playlists.remove(pla);
       System.out.println("A playlist "+ pla.getNome() + " foi excluida com sucesso!");
            }
            i++;
        }
      
   }
   
   public void listarPL() {
      // if(c.arquivo.hasNext() == true){
           int i = 0;
           System.out.println("-----------ALL PLAYLISTS-----------");
        while(c.playlists.hasNext()){
            PlayList pl = (PlayList) c.playlists.next();
            System.out.println(i + ":" + pl.getNome());
            i++;
        }if(i == 0)
             System.out.println("Nenhuma PlayList encontrada!");
        System.out.println("-----------------------------------");
       // }else{System.out.println("Nenhuma PlayList foi encontrada!");}
   }
   
   public void listarAllMusica() {
       int i = 0;
       System.out.println("-----------ALL MUSICS-----------");
        while(c.arquivo.hasNext()){
           Musica musica = (Musica) c.arquivo.next();
            System.out.println(i + ":" + musica.getNome() + " - " + musica.getArtista());
            i++;
        }
        System.out.println("---------------------------------");
   }
   
   public void addMusic(int index, int inde){
       int i = 0;
       while(c.playlists.hasNext()){
           PlayList pl = (PlayList) c.playlists.next();
        if(i == index){
            pl.addMusica(inde);
        }i++;
   }
   }
   
   public void listarMusicPL(int index){
       int i = 0;
       while(c.playlists.hasNext()){
           PlayList pl = (PlayList) c.playlists.next();
        if(i == index){
            pl.listarMusica();
        }i++;
   }
   }
   
   public void excluirMusicDisp(int index){
       int i = 0;
       while(c.arquivo.hasNext()){
           Musica pl = (Musica) c.arquivo.next();
        if(i == index){
            c.arquivo.remove(pl);
            System.out.println("A musica " + pl.getNome() + " - " + pl.getArtista() + " foi removida");
        }i++;
   }
   }
   
   public void excluirMusicPL(int index, int music){
        int i = 0;
       while(c.playlists.hasNext()){
           PlayList pl = (PlayList) c.playlists.next();
        if(i == index){
            pl.excluirMusic(music);
        }i++;
   }
   }
   
   public boolean vr(String nome){
        while(c.playlists.hasNext()){
           PlayList pl = (PlayList) c.playlists.next();
        if(pl.getNome().equals(nome))
            return true;
         }
        return false;
         }
}
