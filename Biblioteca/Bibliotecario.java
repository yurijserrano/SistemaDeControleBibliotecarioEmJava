package Biblioteca;


import Biblioteca.Biblioteca;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Serrano
 */
public class Bibliotecario 
{

    
    private Biblioteca biblioteca;
    private String nome;
    private int codbibliotecario;
  
    /**
     * Construtor da classe bibliotecário
     * @param nome 
     */
    public Bibliotecario(String nome)
    {
        this.nome=nome;
                
    }
    
    /**
     * Retorna a biblioteca
     * @return 
     */
    public Biblioteca getBiblioteca()
    {
        return biblioteca;
    }

    /**
     * Modifica a biblioteca
     * @param biblioteca 
     */
    public void setBiblioteca(Biblioteca biblioteca) 
    {
        this.biblioteca = biblioteca;
    }

    /**
     * Retorna o nome do bibliotecário
     * @return 
     */
    public String getNome() 
    {
        return nome;
    }

    /**
     * Modifica o nome do bibliotecário
     * @param nome 
     */
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    /**
     * Retorna o código do bibliotecário
     * @return 
     */
    public int getCodbibliotecario() 
    {
        return codbibliotecario;
    }

    /**
     * Modifica o código do bibliotecário
     * @param codbibliotecario 
     */
    public void setCodbibliotecario(int codbibliotecario) 
    {
        this.codbibliotecario = codbibliotecario;
    }
    
}
