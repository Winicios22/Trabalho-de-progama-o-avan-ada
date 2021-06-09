
package tentando;

import java.util.ArrayList;
import java.util.Scanner;

public class Tentando {

    
    public static void main(String[] args) {
      
dispositivo c = dispositivo.getInstance();

c.addMusicaDisp("tenebrosa", "mc livinho");
c.addMusicaDisp("azul piscina", "mc livinho");
c.addMusicaDisp("cheia de marra", "mc livinho");
c.addMusicaDisp("fazer falta", "mc livinho");

c.criarPL("funk");
c.criarPL("reggae");
c.criarPL("rock");
c.criarPL("piseiro");

c.listarPL();
c.listarAllMusica();

c.addMusic(0, "tenebrosa", "mc livinho");
c.addMusic(0, "fazer falta", "mc livinho");
c.addMusic(0, "pilantragem", "mc livinho");
c.listarMusicPL(0);
c.excluirMusicPL(0, 0);
c.listarMusicPL(0);

play();
    }
   
    public static void play(){
        
        dispositivo c = dispositivo.getInstance();
        
         Scanner scanner = new Scanner(System.in);
        //boolean forward = true;
        boolean fechar = false;
        
        menu();
        
        while(!fechar){
      
            int escolher = scanner.nextInt();
            scanner.nextLine();
            
//            int escolher2 = scanner.nextInt();
//            scanner.nextLine();
            
            switch(escolher){
                case 0:
                    System.out.println("=============Menu de playlists=============");
                    System.out.println("escolha a opçoes: ");
                    System.out.println("Precione 1 para lista as playlist");
                    System.out.println("Precione 2 para criar uma playlist");
                    System.out.println("Precione 3 para excluir uma playlist");
                    System.out.println("===========================================");
                    
                    int i = scanner.nextInt();
                    scanner.nextLine();
                    
                    Scanner scanner2 = new Scanner(System.in);
                    String nome = scanner2.next();
                    
                    if(i==1){
                        System.out.println("Listar pl");
                        c.listarPL();
                    }
                    if(i==2){
                        System.out.println("Criar uma pl");
                        c.criarPL(nome);
                    }
                    if(i==3){
                        System.out.println("excluir pl");
                        c.excluirPL(nome);
                    }
            break;
            
                case 1:
                    Scanner scanner3 = new Scanner(System.in);
                    String musica = scanner3.nextLine();
                    String banda = scanner3.nextLine();
                    int j=0;
                    System.out.println("================Menu de msicas================");
                    System.out.println("Digite 1 para: Mostra todas as musicas");
                    System.out.println("Digite 2 para: Adicionar musica");
                    System.out.println("Digite 3 para: Excluir musica");
                    System.out.println("==============================================");
                    if(j==1){
                         System.out.println("Mostra todas as musicas");
                         c.listarAllMusica();
                    }
                    if(j==2){
                         System.out.println("Adicionar musica");
                         c.addMusicaDisp(musica, banda);
                    }
                    if(j==3){
                         System.out.println("Excluir musica");
                        // c.excluirMusicPL(i, i);
                    }
                    break;
                    
                    case 2:
                        fechar=true;
                    
            }
        }
    }
    
    public static void menu(){
        System.out.println("escolha a opçoes: ");
        System.out.println("Precione 0 para escolher uma play list \n");
        System.out.println("Precione 1 para acessa as musicas \n");
        System.out.println("Precione 2 para fechar o programa \n");
    } 
    
}





/*System.out.println("escolha a opçoes: ");
        System.out.println("Precione 1 para escolher uma play list ");
        System.out.println("Precione 2 para mostrar todas as musicas ");
        System.out.println("Precione 3 para adicionar musicas ");
        System.out.println("Precione 4 para excluir musica ");
        System.out.println("Precione 99 para fechar o programa ");
*/