package Emprestimo;



import Itens.Item;
import Biblioteca.Usuario;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Serrano
 */
public class Emprestimo 
{
    private Usuario usuario;
    private Item item;
    private GregorianCalendar data;   

    
    /**
     * Mostra o nome do usuário ,data e o nome do título emprestado.
     */
    public void mostraEmp()
    {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");  
        Date date = data.getTime();
        System.out.println(usuario.getNome()+"  |  " + item.getTitulo()+" | "+sd.format(date));
    }
    
    /**
     * Construtor da classe empréstimo
     * @param usuario
     * @param item 
     */
    public Emprestimo(Usuario usuario,Item item)
    {
        this.usuario=usuario;
        this.item=item;
        this.data=new GregorianCalendar();
      
        
    }

    /**
     * Retorna o usuário
     * @return 
     */
    public Usuario getUsuario() 
    {
        return usuario;
    }

    /**
     * Modifica o usuário
     * @param usuario 
     */
    public void setUsuario(Usuario usuario) 
    {
        this.usuario = usuario;
    }

    /**
     * Retorna o item
     * @return 
     */
    public Item getItem() 
    {
        return item;
    }

    
    /**
     * Modifica o item
     * @param item 
     */
    public void setItem(Item item) 
    {
        this.item = item;
    }

    /**
     * Retorna a data do empréstimo
     * @return 
     */
    public GregorianCalendar getData() 
    {
        return data;
    }

    /**
     * Modifica a data do empréstimo
     * @param data 
     */
    public void setData(GregorianCalendar data) 
    {
        this.data = data;
    }
            
    
}
