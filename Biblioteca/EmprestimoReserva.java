package Biblioteca;


import Itens.Item;
import Biblioteca.Bibliotecario;
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
public interface EmprestimoReserva 
{
    /**
     * Esta interface contém os metodos que serão implementados pela classe biblioteca
     * @param usuario 
     */
    public void addUsuario(Usuario usuario);
    public void addBibliotecario(Bibliotecario bibliotecario);
    public void addItemBiblioteca(Item item);
    public void addItemCatalogo(Item i);
    public void removeItemCatalogo(String titulo);
    public void compraItem(Item item);
    public void RenovaItem(String usuario,String titulo);
    public void DevolveItem(String usuario,String titulo);
    public void ReservaItem(String usuario,String titulo);
    public void RemoveReserva(String usuario,String titulo);
    public void EmprestaItem(String usuario,String titulo);
    public List<Item> buscaItemItens2(String item);
    public Item buscaItemItens(String item);
    public Item buscaItemEstoque(String item); 
    
}
