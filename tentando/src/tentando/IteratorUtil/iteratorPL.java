/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tentando.IteratorUtil;

import java.util.ArrayList;
import tentando.PlayList;

/**
 *
 * @author ufcju
 */
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
    public void remove(String pl){
         boolean remove = lista.remove(pl);
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
