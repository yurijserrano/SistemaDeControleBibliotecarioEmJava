package Itens;


import Reserva.Reserva;
import Emprestimo.Emprestimo;
import java.util.List;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Serrano
 * 
 */

/**
 * Construtor da classe livro
 * @author Serrano
 */
public class Livro extends Item
{
    private String titulo;
    private String autor;
    private String assunto;
    private int volume;
    private List<Reserva> reservas;
    private Emprestimo emprestimo;   
    private int qtdItem;
    private int nReserva;    
    private int emprestado;
    private GregorianCalendar data;
    private int renovar;    
    private int numEmprestimo;
    private GregorianCalendar ultimoEmprestimo;

    
    /**
     * Retorna se a revista foi emprestada ou não
     * @return 
     */
    @Override
    public int getEmprestado() 
    {
        return emprestado;
    }

    
    /**
     * Modifica o status de emprestado ou não
     * @param emprestado 
     */
    @Override
    public void setEmprestado(int emprestado)
    {
        this.emprestado = emprestado;
    }
    
    /**
     * Retorna o número de empréstimos
     * @return 
     */
    @Override
    public int getNumEmprestimo() 
    {
        return numEmprestimo;
    }

    /**
     * Modifica o número de empréstimos
     * @param numEmprestimo 
     */
    @Override
    public void setNumEmprestimo(int numEmprestimo)
    {
        this.numEmprestimo = numEmprestimo;
    }
    
    
    /**
     * Retorna a data do último emréstimo
     * @return 
     */
    @Override
    public GregorianCalendar getUltimoEmprestimo() 
    {
        return ultimoEmprestimo;
    }

    /**
     * Modifica a data do último empréstimo
     * @param ultimoEmprestimo 
     */
    @Override
    public void setUltimoEmprestimo(GregorianCalendar ultimoEmprestimo)
    {
        this.ultimoEmprestimo = ultimoEmprestimo;
    }


    /**
     * Retorna o número de reservas de determinado item.
     * @return 
     */
    @Override
    public int getRenovar() 
    {
        return renovar;
    }

    /**
     * Modifica o número de reservas de determinado item.
     * @param renovar 
     */
    @Override
    public void setRenovar(int renovar) 
    {
        this.renovar = renovar;
    }
      
    
    /**
     * Construtor da classe Livro
     * @param titulo
     * @param assunto
     * @param autor
     * @param volume 
     */
    public Livro(String titulo,String assunto,String autor,int volume)
    {
        
        this.titulo=titulo;
        this.autor=autor;
        this.assunto=assunto;
        this.volume=volume;        
        reservas = new ArrayList<Reserva>();
        this.qtdItem=1;
        this.nReserva=0;
        this.emprestado=0;
        this.numEmprestimo=0;
        this.renovar=0;
        this.ultimoEmprestimo = new GregorianCalendar();
        this.data=new GregorianCalendar();
    }
    
    /**
     * Retorna a data que o item foi colocado
     * @return 
     */
    @Override
    public GregorianCalendar getData() 
    {
        return data;
    }

    /**
     * Modifica a data que o item foi colocado
     * @param data 
     */
    @Override
    public void setData(GregorianCalendar data) 
    {
        this.data = data;
    }
    
    
    /**
     * Retorna a quantidade do item
     * @return 
     */
    @Override
    public int getQtdItem() 
    {
        return qtdItem;
    }

    /**
     * Modifica a quantidade do item
     * @param qtdItem 
     */
    @Override
    public void setQtdItem(int qtdItem) 
    {
        this.qtdItem = qtdItem;
    }
    
    

    /**
     *Retorna o empréstimo 
     * @return
     */
    
    @Override
     public Emprestimo getEmprestimo() 
    {
        return emprestimo;
    }

     /**
      * Modifica o empréstimo
      * @param emprestimo 
      */
    @Override
    public void setEmprestimo(Emprestimo emprestimo) 
    {
        this.emprestimo = emprestimo;
    }
    
    
    /**
     * Retorna o título do livro
     * @return 
     */
    @Override
    public String getTitulo() 
    {
        return titulo;
    }
    
    /**
     * Modifica o titulo do livro
     * @param titulo 
     */
    @Override
    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

   
    /**
     * Retorna o autor
     * @return 
     */
    @Override
    public String getAutor() 
    {
        return autor;
    }
    
    /**
     * Modifica o autor
     * @param titulo 
     */
    @Override
    public void setAutor(String titulo) 
    {
        this.titulo = titulo;
    }

       

    /**
     * Retorna o número de reservas
     * @return 
     */
    @Override
    public int getnReserva() 
    {
        return nReserva;
    }

    /**
     * Modifica o número de reservas
     * @param nReserva 
     */
    @Override
    public void setnReserva(int nReserva) 
    {
        this.nReserva = nReserva;
    }
   
   

    /**
     * Retorna o assunto do livro
     * @return 
     */
    @Override
    public String getAssunto() 
    {
        return assunto;
    }

    /**
     * Modifica o assunto do livro
     * @param assunto 
     */
    @Override
    public void setAssunto(String assunto) 
    {
        this.assunto = assunto;
    }

    /**
     * Retorna o volume do livro
     * @return 
     */
    public int getVolume() 
    {
        return volume;
    }

    /**
     * Modifica o volume do livro
     * @param volume 
     */
    public void setVolume(int volume) 
    {
        this.volume = volume;
    }
   
    /**
     * Adiciona uma reserva ao usuário
     * @param user 
     */
    @Override
    public void addReserva(Reserva user)
    {
        reservas.add(user);
    }
    
    /**
     * Remove a reserva
     * @param user 
     */
    @Override
    public void removeReserva(Reserva user)
    {
        reservas.remove(user);
    }
    
    /**
     * Verifica se possui a reserva
     * @param user
     * @return 
     */
    @Override
    public boolean containsReserva(Reserva user)
    {
        if(reservas.contains(user))
            return true;
        
        else
            return false;
    } 
}
