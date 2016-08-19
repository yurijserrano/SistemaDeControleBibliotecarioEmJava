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
 */
public class Revista extends Item 
{
    private String titulo;   
    private String autor;
    private String assunto;
    private List<Reserva> reservas;
    private Emprestimo emprestimo;
    private int qtdItem;
    private int nReserva;
    private GregorianCalendar data;
    private int renovar;
    private int emprestado;
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
     * Retorna o nome do autor do item
     * @return 
     */
    @Override
     public String getAutor() 
     {
        return autor;
    }

    /**
     * Modifica o nome do autor do livro.
     * @param autor 
     */
    @Override
    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    /**
     * Retorna o assunto do item
     * @return 
     */
    @Override
    public String getAssunto() 
    {
        return assunto;
    }

    /**
     *Modifica o assunto do item
     * @param assunto
     */
    @Override
    public void setAssunto(String assunto)
    {
        this.assunto = assunto;
    }
    
    /**
     * Retorna a data do último empréstimo
     * @return 
     */
    @Override
    public GregorianCalendar getUltimoEmprestimo() 
    {
        return ultimoEmprestimo;
    }

    /**
     * Este método muda a data do último empréstimo
     * @param ultimoEmprestimo
     */
    @Override
    public void setUltimoEmprestimo(GregorianCalendar ultimoEmprestimo)
    {
        this.ultimoEmprestimo = ultimoEmprestimo;
    }


    /**
     *Retorna o número ,que verifica se o funcionário renovou ou não o livro.
     * @return
     */
    @Override
    public int getRenovar() 
    {
        return renovar;
    }
    
    /**
     *Muda o número ,que verifica se o funcionário renovou ou não o livro.
     * @param renovar
     */    
    @Override
    public void setRenovar(int renovar) 
    {
        this.renovar = renovar;
    }
      
    /**
     * Construtor da Classe Revista
     * @param titulo
     * @param assunto
     * @param autor 
     */
    public Revista(String titulo,String assunto,String autor)
    {
        this.titulo=titulo;
        this.assunto=assunto;
        this.autor=autor;
        this.qtdItem=1;
        this.nReserva=0;
        this.renovar=0;
        this.data=new GregorianCalendar();
        this.ultimoEmprestimo=new GregorianCalendar();
        this.reservas=new ArrayList<Reserva>();
        
    }   
    
    /**
     * Retorna a data que foi gerada
     * 
     * @return 
     */
    @Override
    public GregorianCalendar getData() 
    {
        return data;
    }

    
    /**
     * Muda a data que foi gerada
     * @param data 
     */
    @Override
    public void setData(GregorianCalendar data) 
    {
        this.data = data;
    }
        

    /**
     * Retorna a quantidade de itens
     * @return 
     */
    @Override
    public int getQtdItem() 
    {
        return qtdItem;
    }

    /**
     * Modifica a quantidade de itens
     * @param qtdItem 
     */
    @Override
    public void setQtdItem(int qtdItem) 
    {
        this.qtdItem = qtdItem;
    }
        
   /**
    * Retorna o empréstimo
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
     * Retorna o título do item
     * @return 
     */
    @Override
    public String getTitulo() 
    {
        return titulo;
    }

    /**
     * Modifica o título do item
     * @param titulo 
     */
    @Override
    public void setTitulo(String titulo) 
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
   
    
    
    
}
