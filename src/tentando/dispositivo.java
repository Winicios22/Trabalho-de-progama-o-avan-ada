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
    
    private ArrayList<Musica> arquivo;
    
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
    
    public void addMusica(String nome, String artista) {
       
        System.out.println("new song " + nome + ": " + artista + " added to album " + this.nome);
}
}
