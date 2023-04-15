package gestores;

import artigos.Artigo;
import utilizadores.Utilizador;

import java.util.*;

public class GestorUtilizadores{

    private List<Utilizador> catalogo_utilizadores;

    public GestorUtilizadores(){
        this.catalogo_utilizadores = new ArrayList<Utilizador>();
    }

    public void addUtilizador(Utilizador utilizador){
        this.catalogo_utilizadores.add(utilizador.clone());
    }

    public void addUtilizadorArtigoAVenda(Artigo artigo){
        this.catalogo_utilizadores.get(artigo.getVendedor()).addArtigoAVenda(artigo);
    }

    public void removeUtilizadorArtigoAVenda(Artigo artigo){
        this.catalogo_utilizadores.get(artigo.getVendedor()).removeArtigoAVenda(artigo);
    }

    public void addUtilizadorArtigoVendido(Artigo artigo){
        this.catalogo_utilizadores.get(artigo.getVendedor()).addArtigoVendido(artigo);
    }

    public void removeUtilizadorArtigoVendido(Artigo artigo){
        this.catalogo_utilizadores.get(artigo.getVendedor()).removeArtigoVendido(artigo);
    }

    public void addUtilizadorArtigoAdquirido(int utilizador, Artigo artigo){
        this.catalogo_utilizadores.get(utilizador).addArtigoAdquirido(artigo);
    }

    public void removeUtilizadorArtigoAdquirido(int utilizador, Artigo artigo){
        this.catalogo_utilizadores.get(utilizador).removeArtigoAdquirido(artigo);

    }

    public int getSize(){
        return this.catalogo_utilizadores.size();
    }

    public String toString(){

        return this.catalogo_utilizadores
                    .stream()
                    .map((x) -> x.toString())
                    .reduce("Catalogos Utilizadores:", (a,b) -> a + "\n" + b);
    }
}