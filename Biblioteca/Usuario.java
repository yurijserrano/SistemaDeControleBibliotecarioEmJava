package Biblioteca;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Serrano
 */
import Reserva.Reserva;
import Emprestimo.Emprestimo;
import Itens.Item;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class Usuario  
{
    
    
    
    private String nome;    
    private List<Emprestimo> emprestimos;
    private List<Reserva> reservas;
    private int restricao;
    private int contrestricao;
    private GregorianCalendar suspenso;

    
    /**
     * Retorna a data da suspensão
     * @return 
     */
    public GregorianCalendar getSuspenso() 
    {
        return suspenso;
    }
    
    /**
     * Muda a data da suspensão
     * @param suspenso
     */
    public void setSuspenso(GregorianCalendar suspenso)
    {
        this.suspenso = suspenso;
    }
    
    /**
     * Retorna a quantidade do número de devoluções
     * corretas feitas pelo usuário que esta com a restrição 1
     * @return 
     */
    public int getContrestricao() 
    {
        return contrestricao;
    }

    /**
     * Muda o valor do número de devoluções 
     * @param contrestricao
     */
    public void setContrestricao(int contrestricao) 
    {
        this.contrestricao = contrestricao;
    }
    

    /**
     * Retorna o número da restrição.
     * @return 
     */
    public int getRestricao() 
    {
        return restricao;
    }

    /**
     * Muda o valor da restrição
     * @param restricao
     */
    public void setRestricao(int restricao)
    {
        this.restricao = restricao;
    }
    
    /**
     * Construtor da classe Usuário
     * @param nome
     */
    public Usuario(String nome)
    {
        this.nome=nome;
        emprestimos = new ArrayList<Emprestimo>();
        reservas = new ArrayList<Reserva>();
        this.suspenso=null;
        this.restricao=0;
        this.contrestricao=0;
    }
    
    
    /**
     * Este método tem a função de retornar o empréstimo que
     * determinado usuário fez,sendo informado como parâmetros
     * o nome do usuário e o título que ele emprestou.
     * @param nome
     * @param titulo
     * @return 
     */
    public Emprestimo buscaEmprestimo(String nome,String titulo)
    {
        Iterator<Emprestimo> iterador = emprestimos.iterator();
        Emprestimo emp = null;
        
        while(iterador.hasNext())
        {
            Emprestimo it = iterador.next();
            
            if(it.getUsuario().getNome().equals(nome) && it.getItem().getTitulo().equals(titulo))
            {
                emp= it;
                
            }           
        }       
        return emp;
    }
    
    /**
     * Exibe todos os empréstimos feitos pelo usuário
     */
    public void exibeEmp()
    {
        Iterator<Emprestimo> emp = emprestimos.iterator();
               
        while(emp.hasNext())
        {
            Emprestimo e = emp.next();
            
            e.mostraEmp();
        }
    }
    
      /**
     * Exibe todas as reservas feitas pelos usuários
     */
    public void exibeRes()
    {
        Iterator<Reserva> res = reservas.iterator();
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");   
        GregorianCalendar gc;
        
        while(res.hasNext())
        {
            Reserva r = res.next();
            
            r.mostraRes();
        }
    }
    
    /**
     * Este método tem a função de retornar a reserva que
     * determinado usuário fez,sendo informado como parâmetros
     * o nome do usuário e o título que ele emprestou.
     * @param nome
     * @param titulo
     * @return 
     */
    public Reserva buscaReserva(String nome,String titulo)
    {
        Iterator<Reserva> iterador = reservas.iterator();
        Reserva res = null;
        
        while(iterador.hasNext())
        {
            Reserva it = iterador.next();
            
            if(it.getUsuario().getNome().equals(nome) && it.getItem().getTitulo().equals(titulo))
            {               
                    res= it;                
            }           
        }
        return res;
    }
    
    /**
     * Este método adiciona o empréstimo que o usuário fez
     * @param user
     */
    public void addEmprestimo(Emprestimo user)
    {
        emprestimos.add(user);
    }
    
    /**
     * Este método remove o empréstimo que o usuário fez
     * @param user
     */
    public void removeEmprestimo(Emprestimo user)
    {
        emprestimos.remove(user);
    }
    
    
    /**
     * Este método verifica se  o usuário possui determinado
     * empréstimo
     * @param user
     * @return 
     */
    public boolean containsEmprestimo(Emprestimo user)
    {
        if(emprestimos.contains(user))
            return true;
        
        else
            return false;
    }
    
    /**
     * Este método adiciona a reserva que o usuário fez
     * @param user
     */
    public void addReserva(Reserva user)
    {
        reservas.add(user);
    }
    
    /**
     * Este método remove a reserva que o usuário fez
     * @param user
     */
    public void removeReserva(Reserva user)
    {
        reservas.remove(user);
    }
    
    
    /**
     * Este método verifica se  o usuário possui determinada
     * reserva
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
    
    /**
     * Este método retorna o nome do usuário
     * @return 
     */
    public String getNome() 
    {
        return nome;
    }

    
    /**
     * Este método modifica o nome do usuário
     * @param nome
     */
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

       
   /** 
    * Este método imprime o nome do usuário
     * @return 
    */
     
    @Override
    public String toString() 
    {

        return this.nome;

    }
    
    
}
