package Catalogo;


import Itens.Item;
import java.util.List;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Serrano
 */
public interface Busca 
{
    /**
     * Métodos da interface busca que são implementados pela classe catálogo.
     * @param palavra
     * @return 
     */
    public List<Item> buscaTitulo(String palavra);
    public List<Item> buscaAutor(String palavra);
    public List<Item> buscaAssunto(String palavra);
    public Item buscaItemCatalogo(String item);
    public void removeItem(String palavra);
    
}
