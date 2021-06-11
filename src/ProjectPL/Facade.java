
package ProjectPL;

import java.util.Scanner;


public class Facade {

    public Facade() {
    }
    
    
    public static void play(){
        
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
    
    private static void menu(){
        System.out.println("================Menu principal================");
        System.out.println("      Digite a opçoes: ");
        System.out.println("(1)   PlayLists ");
        System.out.println("(2)   All Musics ");
        System.out.println("(3)   Fechar o programa ");
        System.out.println("==============================================");
    } 
    
    private static void menuPL(){
                    
         dispositivo c = dispositivo.getInstance();
         Scanner scanner = new Scanner(System.in);
        boolean f = false;
        while(!f){
                    c.listarPL();
                    
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
                        c.listarMusicPL(id);
                        musicasPL(id);
                    }
                    if(i==2){
                        System.out.println("Digite o nome da sua Playlist:");
                         String nome = scanner2.nextLine();
                        c.criarPL(nome);
                    }
                    if(i==3){
                        System.out.println("Digite o id da playlist que deseja excluir");
                        int id = scanner2.nextInt();
                        c.excluirPL(id);
                    }
                    if(i==4){f=true;}
        }
        }
    
    private static void menuMusic(){
         
         dispositivo c = dispositivo.getInstance();
         Scanner scanner = new Scanner(System.in);
        
         boolean f = false;
        while(!f){
                    c.listarAllMusica();
                    
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
                        
                        c.addMusicaDisp(musica, banda);
                        
                    }
                    if(j==2){
                        Scanner scan = new Scanner(System.in);
                         System.out.println("Digite o id da musica que deseja excluir");
                        int id = scan.nextInt();
                         c.excluirMusicDisp(id);
                         
                    }
                    if(j==3){f=true;}
                    
        }
    }
    
    private static void musicasPL(int id){
        dispositivo c = dispositivo.getInstance();
         Scanner scanner = new Scanner(System.in);
      
        boolean f = false;
        while(!f){
                    c.listarMusicPL(id);
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
                        c.listarAllMusica();
                        System.out.println("Digite o id da musica que deseja adicionar a playlist:");
                        int musica = scanner3.nextInt();
                        c.addMusic(id, musica);
                        
                    }
                    if(j==2){
                        Scanner scan = new Scanner(System.in);
                        c.listarMusicPL(id);
                         System.out.println("Digite o id da musica que deseja excluir");
                        int music = scan.nextInt();
                         c.excluirMusicPL(id,music);
                         
                    }
                    if(j==3){f=true;}
                    }
        }
}
