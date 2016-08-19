/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestMains;

import Catalogo.Catalogo;
import Itens.Item;
import Itens.Livro;
import Itens.Revista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Serrano
 */
public class TestMainCatalogo  
{
    public static void main(String[] args)
    {
        Catalogo c = new Catalogo();
        List<Item> item = new ArrayList<Item>();
        
        
        Item i = new Revista("TITITI","Fofoca","Decio");
        Item i2 = new Revista("Ego","Fofoca","Decio");
        Item i3 = new Revista("CulinariasGourmet","Culinária","Palmirinha");
        Item i4 = new Livro("Análise Numérica","Cálculo Numérico","Richard L.Burden",1);
        Item i5 = new Livro("Análise Numérica II","Cálculo Numérico","Richard L.Burden",2);
        Item i6 = new Livro("Harry Potter e as Relíquias da Morte","Ficção","J.K Rowlings",1);
        
        c.addItem(i);
        c.addItem(i2);
        c.addItem(i3);
        c.addItem(i4);
        c.addItem(i5);
        c.addItem(i6);
        
        
        /**
         * Exibe itens da classe Catalogo
         */
         c.exibeItensCatalogo();
        
        /** Exemplo Busca por Assunto 
         * 
         */
         
         System.out.println();
         System.out.println();
         
         
         System.out.println("Busca por Assunto\nAssunto:Fofoca\nResultados:");
        
         c.exibeItensBusca(c.buscaAssunto("Fofoca"));
         
         
         /** Exemplo Busca por Titulo
         * 
         */
         
         System.out.println();
         System.out.println();
         
         
         System.out.println("Busca por Titulo\nTítulo:Análise Numérica II\nResultados:");
        
         c.exibeItensBusca(c.buscaTitulo("Análise Numérica II"));
        
         
         /** Exemplo Busca por Autor
         * 
         */
         
         System.out.println();
         System.out.println();
         
         
         System.out.println("Busca por Autor\nAutor:Decio\nResultados:");
        
         c.exibeItensBusca(c.buscaAutor("decio"));
        
         System.out.println();
         System.out.println();
         
         /**
          * Exemplo Adicionando um novo título
          */
         
         Item i7 = new Livro("Java como Programar","Programação","Deitel",1);
         
         System.out.println("Adicionar Título\nTítulo:Java Como Programar\nResultados:");
         
         c.addItem(i7);      
         c.exibeItensCatalogo();
         
         System.out.println();
         System.out.println();
         
         /**
          * Exemplo Removendo um título
          */
         System.out.println("Remover Título\nTítulo:TITITI\nResultados:");
         
         c.removeItem("TITITI");
         c.exibeItensCatalogo();
        
    }
    
    
}
