
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

}
