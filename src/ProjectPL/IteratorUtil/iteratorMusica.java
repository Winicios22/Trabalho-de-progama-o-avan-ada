
package ProjectPL.IteratorUtil;

import java.util.ArrayList;
import ProjectPL.Musica;


public class iteratorMusica implements myIterator {
    
    private ArrayList<Musica> lista;
    private int count;
    private int qtd;
    
    public iteratorMusica(){
        lista = new <Musica> ArrayList();
        count = 0;
        qtd = 0;
    }
    
    public void add(Musica novo){
        lista.add(novo);
        ++qtd;
    }
    
    public void remove(Musica musica){
        lista.remove(musica);
        --qtd;
    }
    
    @Override
    public boolean hasNext() {
         if(count >= lista.size() || lista.get(count) == null){
            count = 0;
            return false;
        }else{
            return true;
        }
    }
    
    @Override
    public Object next() {
         Musica musica = lista.get(count);
        ++count;
        return musica;
    }
    
}


