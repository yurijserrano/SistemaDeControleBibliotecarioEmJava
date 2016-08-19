package Itens;



import Reserva.Reserva;
import Emprestimo.Emprestimo;
import java.util.GregorianCalendar;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Serrano
 */
public abstract class Item 
{
    private String titulo;
    private String autor;
    private String assunto;
    private String editora;
    private String edicao;
    private String idioma;
    private String ano;   
    private GregorianCalendar data;
    private Emprestimo emprestimo;
    private Set<Reserva> reservas;
    private int numEmprestimo;
    private int qtdItem=1;
    private int nReserva=0;
    private int emprestado=0;
    private int renovar=0;
    private GregorianCalendar ultimoEmprestimo;
    
    
    /**
     * Retorna o nome do autor
     * @return 
     */
    public String getAutor()
    {
        return autor;
    }

    
    /**
     * Modifica o nome do autor
     * @param autor 
     */
    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    /**
     * Retorna o assunto
     * @return 
     */
    public String getAssunto() 
    {
        return assunto;
    }

    /**
     * Modifica o assunto
     * @param assunto 
     */
    public void setAssunto(String assunto) 
    {
        this.assunto = assunto;
    }

    
    /**
    *Retorna a data do último empréstimo
     * @return 
    */
    public GregorianCalendar getUltimoEmprestimo() 
    {
        return ultimoEmprestimo;
    }

    /**
     * Modifica a data do último empréstimo
     * @param ultimoEmprestimo 
     */
    public void setUltimoEmprestimo(GregorianCalendar ultimoEmprestimo)
    {
        this.ultimoEmprestimo = ultimoEmprestimo;
    }

    /**Retorna o status da renovação.
     * 
     * @return 
     */
    public int getRenovar() 
    {
        return renovar;
    }

    /**
     * Modifica o status da renovação.
     * @param renovar 
     */
    public void setRenovar(int renovar) 
    {
        this.renovar = renovar;
    }
      

    /**
     * Retorna o status se o item esta emprestado ou não.
     * @return 
     */
    public int getEmprestado() 
    {
        return emprestado;
    }

    /**
     * Modifica o status se o item esta emprestado ou não.
     * @param emprestado
     */
    public void setEmprestado(int emprestado)
    {
        this.emprestado = emprestado;
    }
    
    
    /**
     * Retorna a data que o item foi inserido(criado)
     * @return 
     */
    public GregorianCalendar getData() 
    {
        return data;
    }

    /**
     * Modifica a data que o item foi inserido(criado)
     * @param data 
     */
    public void setData(GregorianCalendar data) 
    {
        this.data = data;
    }
    
    
    /**
     * Retorna o número de reservas para determinado item
     * @return 
     */
    public int getnReserva() 
    {
        return nReserva;
    }

    /**
     * Modifica o número de reservas para determinado item
     * @param nReserva 
     */
    public void setnReserva(int nReserva) 
    {
        this.nReserva = nReserva;
    }
   

    /**
     * Retorna o número de empréstimos de determinado item
     * @return 
     */
    public int getNumEmprestimo() 
    {
        return numEmprestimo;
    }

    /**
     * Modifica o número de empréstimos de determinado item
     * @param numEmprestimo 
     */
    public void setNumEmprestimo(int numEmprestimo)
    {
        this.numEmprestimo = numEmprestimo;
    }
    
    
    /**
     * Retorna a quantidade de itens
     * @return 
     */
    public int getQtdItem() 
    {
        return qtdItem;
    }

    
    /**
     * Modifica a quantida de itens
     * @param qtdItem 
     */
    public void setQtdItem(int qtdItem) 
    {
        this.qtdItem = qtdItem;
    }
       

    /**
     * Retorna o empréstimo
     * @return 
     */
    public Emprestimo getEmprestimo() 
    {
        return emprestimo;
    }

    
    /**
     * Modifica o empréstimo
     * @param emprestimo 
     */
    public void setEmprestimo(Emprestimo emprestimo) 
    {
        this.emprestimo = emprestimo;
    }
    
   /**
    * Retorna o ano
    * @return 
    */   
    public String getAno() 
    {
        return ano;
    }

    /**
     * Modifica o ano
     * @param ano 
     */
    public void setAno(String ano) 
    {
        this.ano = ano;
    }
    

    /**
     * Retorna o título
     * @return 
     */
    public String getTitulo() 
    {
        return titulo;
    }

    /**
     * Modifica o título do item
     * @param titulo 
     */    
    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    
    /**
     * Retorna a editora
     * @return 
     */
    public String getEditora() 
    {
        return editora;
    }

    
    /**
     * Modifica a editora do item
     * @param editora 
     */
    public void setEditora(String editora)
    {
        this.editora = editora;
    }
    
    
    /**
     * Retorna a edição do item
     * @return 
     */
    public String getEdicao() 
    {
        return edicao;
    }

    /**
     * Modifica a edição do item
     * @param edicao 
     */
    public void setEdicao(String edicao) 
    {
        this.edicao = edicao;
    }

    /**
     * Retorna o idioma do item
     * @return 
     */
    public String getIdioma() 
    {
        return idioma;
    }

    /**
     * Modifica o idioma do item
     * @param idioma 
     */
    public void setIdioma(String idioma) 
    {
        this.idioma = idioma;
    }
    
    
    /**
     * Este método adiciona a reserva
     * @param user 
     */
    public void addReserva(Reserva user)
    {
        reservas.add(user);
    }
    
    /**
     * Este método remove a reserva
     * @param user 
     */
    public void removeReserva(Reserva user)
    {
        reservas.remove(user);
    }
    
    
    /**
     * Este método verifica se o usuário possui a reserva
     * @param user
     * @return 
     */
    public boolean containsReserva(Reserva user)
    {
        if(reservas.contains(user))
            return true;
        
        else
            return false;
    }   
    
    
    
}
