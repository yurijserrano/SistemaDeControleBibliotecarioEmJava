package Reserva;



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
public class Reserva  
{
    
    private Usuario usuario;
    private Item item;
    private GregorianCalendar Date;

   
     
    
    /**
     * Retorna a data da reserva feita pelo usuário
     * @return 
     */
    public GregorianCalendar getDate() 
    {
        return Date;
    }

    /**
     * Muda a data da reserva feita pelo usuário 
     * @param Date
     */
    public void setDate(GregorianCalendar Date) 
    {
        this.Date = Date;
    }
    
    /**
     * Mostra o nome do usuário ,data e o nome do título reservado.
     */
    public void mostraRes()
    {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");  
        Date data = Date.getTime();
        System.out.println(usuario.getNome()+"  |  " + item.getTitulo()+" | "+item.getnReserva()+" | "
                +  sd.format(data));
    }
    
    /**
     * Construtor da classe Reserva
     * @param usuario
     * @param item 
     */
    public Reserva(Usuario usuario,Item item)
    {
        this.usuario=usuario;
        this.item=item;
        this.Date=new GregorianCalendar();
        
    }    
    
    
    /**
     * Retorna o usuário da reserva
     * @return 
     */
    public Usuario getUsuario() 
    {
        return usuario;
    }

    /**
     * Modifica o usuário da Reserva
     * @param usuario 
     */
    public void setUsuario(Usuario usuario) 
    {
        this.usuario = usuario;
    }

    /**
     * Retorna o Item da Reserva
     * @return 
     */
    public Item getItem() 
    {
        return item;
    }

    /**
     * Modifica o item que esta na reserva
     * @param item 
     */
    public void setItem(Item item) 
    {
        this.item = item;
    }
    
}
    