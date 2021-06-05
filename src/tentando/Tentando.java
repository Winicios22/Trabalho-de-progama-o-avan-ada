
package tentando;

import java.util.ArrayList;

public class Tentando {

    
    public static void main(String[] args) {
      
dispositivo c = dispositivo.getInstance();

c.addMusicaDisp("tenebrosa", "mc livinho");
c.addMusicaDisp("azul piscina", "mc livinho");

c.criarPL("funk");
c.criarPL("rock");
c.playlists.get(0).addMusica("tenebrosa");
c.playlists.get(0).addMusica("azul piscina");
c.playlists.get(1).addMusica("final countdown");

    }
    
}
