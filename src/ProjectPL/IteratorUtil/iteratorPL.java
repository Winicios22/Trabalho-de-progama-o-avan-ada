
package ProjectPL.IteratorUtil;

import java.util.ArrayList;
import ProjectPL.PlayList;


public class iteratorPL implements myIterator {

     private ArrayList<PlayList> lista;
    private int count;
    private int qtd;
    
    public iteratorPL(){
        lista = new <PlayList> ArrayList();
        count = 0;
        qtd = 0;
    }
    
    public void add(PlayList novo){
        lista.add(novo);
        ++qtd;
    }
    
    public void remove(PlayList pl){
        lista.remove(pl);
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
         PlayList pl = lista.get(count);
        ++count;
        return pl;
    }
    
}
