package Catalogo;



import Itens.Item;
import Itens.Livro;
import Itens.Revista;
import java.util.ArrayList;
import java.util.Iterator;
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
public class Catalogo implements Busca
{

   
    private List<Item> itens; 
    
    
    /**
     * Construtor da classe catálogo
     */
    @SuppressWarnings({"unchecked", "unchecked"})
    public Catalogo()
    {
        this.itens=  new ArrayList<Item>();
    }
    
    /**
     * Adiciona o item no catálogo
     * @param i 
     */
    public void addItem(Item i)
    {
        Iterator<Item> it = itens.iterator();
        int cont =0;
        while(it.hasNext())
        {
            Item i2 = it.next();
            
            if(i2.getTitulo().equals(i.getTitulo()))
                cont=1;
            
           
        }
        
        if(cont==0)
            this.itens.add(i);
              
    }
    
    /**
     * Exibe todos os itens existentes no catalogo
     */
    public void exibeItensCatalogo()
    {
        Iterator<Item> it = itens.iterator();
        
        while(it.hasNext())
        {
            Item i = it.next();
            
            System.out.println(i.getTitulo()+" | "+i.getAssunto()+" | "+i.getAutor());
        }
    }
    
    /**
     * Exibe todos os itens que foram encontrados pelos métodos de busca
     * @param i2
     */
    public void exibeItensBusca(List<Item> i2)
    {
        Iterator<Item> it = i2.iterator();
        
        while(it.hasNext())
        {
            Item i = it.next();
            
            System.out.println(i.getTitulo()+" | "+i.getAssunto()+" | "+i.getAutor());
        }
    }
    
    
    
    /**
     * Busca um item específico contido no catalogo
     * @param item 
     * @return  
     */
    @Override
    public Item buscaItemCatalogo(String item)
    {
        Iterator<Item> ite = itens.iterator();
        Item ii = null;
        
        while(ite.hasNext())
        {
            Item i = ite.next();
            if(i.getTitulo().equals(item))
                ii=i;
            
        }
        
        return ii;
        
    }
    
    
    /**
     * Este método busca os itens pelo título dele trazendo
     * os itens pela grafia correta ou se a pessoa digitar somente
     * com letras minúsculas
     * retornando uma lista de itens
     * @param palavra
     * @return 
     */
    @Override
    public List<Item> buscaTitulo(String palavra)
    {
        Iterator<Item> iterador = itens.iterator();
        List<Item> pesquisa = new ArrayList<Item>();
        
        while(iterador.hasNext())
        {
            
                Item item = iterador.next();
                
                if(item.getTitulo().contains(palavra))
                {
                    pesquisa.add(item);
                }
                else if(item.getTitulo().toLowerCase().contains((palavra)))
                {
                    pesquisa.add(item);
                } 
                     
                    
         }         
        
        return pesquisa;
            
        }

    
    /**
     * Este método busca os itens pelo assunto dele trazendo
     * os itens de determinado assunto pela grafia correta ou 
     * se a pessoa digitar somente com letras minúsculas
     * @param palavra
     * @return 
     */
    @Override
    public List<Item> buscaAssunto(String palavra)
    {
        Iterator<Item> iterador = itens.iterator();
        List<Item> pesquisa = new ArrayList<Item>();
        
        
        
        while(iterador.hasNext())
        {
            
            
                Item item = iterador.next();
                
                if(item.getAssunto().contains(palavra))
                {
                    pesquisa.add(item);
                    
                }
                else if(item.getAssunto().toLowerCase().contains((palavra)))
                {
                    pesquisa.add(item);
                    
                } 
                
                
                    
            }
            
        
            return pesquisa;
       
            
        }
    
    
    /**
     * Este método busca os itens pelo nome do autor dele trazendo
     * os itens de acordo com determinado autor pela grafia correta ou 
     * se a pessoa digitar somente com letras minúsculas
     * @param palavra
     * @return 
     */
    @Override
    public List<Item> buscaAutor(String palavra)
    {
        Iterator<Item> iterador = itens.iterator();
        List<Item> pesquisa = new ArrayList<Item>();
        
        
        while(iterador.hasNext())
        {
           
                Item item = iterador.next();
                
                if(item.getAutor().contains(palavra))
                {
                    pesquisa.add(item);
                    
                }
                else if(item.getAutor().toLowerCase().contains((palavra)))
                {
                    pesquisa.add(item);
                    
                }                 
                                    
         }          
          
        
        
            return pesquisa;
       
       }
    
    /**
     *Remove um item do catálogo ,digitando seu título como busca
     * @param palavra
     * @return 
     */
    @Override
    public void removeItem(String palavra)
    {
         
        Iterator<Item> iterador = itens.iterator();
        
        
        
        while(iterador.hasNext())
        {
            
            
                Item item = iterador.next();
                
                if(item.getTitulo().contains(palavra))
                {
                    iterador.remove();
                    
                }
                else if(item.getTitulo().toLowerCase().contains(palavra))
                {
                    iterador.remove();
                }               
          }
        
                
    }
    
}
        
       
            
    

    

   
   
        
        
    

    
   
    

