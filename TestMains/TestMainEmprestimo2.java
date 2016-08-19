/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestMains;

import Biblioteca.Biblioteca;
import Biblioteca.Usuario;
import Emprestimo.Emprestimo;
import Itens.Item;
import Itens.Revista;

/**
 *
 * @author Serrano
 */
public class TestMainEmprestimo2 
{
    
    /**
     * Mostra o tratamento quando ocorre a inserção de itens iguais
     * @param args 
     */
    public static void main(String[] args)
    {
        Biblioteca b = new Biblioteca();
        
        Usuario u = new Usuario("Chacrinha");
        
        Usuario u2 = new Usuario("Ronald Golias");
        
        Item i = new Revista("TITITI","Fofoca","Decio");
        
        Item i2 = new Revista("Playboy MAIO","Masculino","Juca Kfoury");
        
        Item i3 = new Revista("TITITI","Fofoca","Decio");
 
        
        /**
         * Exemplo adicionando usuários
         */
        System.out.println("| Usuários |\n");
        b.addUsuario(u);
        b.addUsuario(u2);
        
        b.exibeUsuarios();
        
        System.out.println();
        System.out.println();
        
        
        /**
         * Exemplo adicionando itens no catalogo
         */
        System.out.println("| Catálogo |\n");
        b.addItemCatalogo(i);
        b.addItemCatalogo(i2);
        b.addItemCatalogo(i3);
        
        b.exibeItensCatalogo();
        
        System.out.println();
        System.out.println();
        
        
        /**
         * Exemplo adicionando itens na Biblioteca
         */
        System.out.println("| Biblioteca |\n");
        b.addItemBiblioteca(i);
        b.addItemBiblioteca(i2);
        b.addItemBiblioteca(i3);
        
        b.exibeItensBiblioteca();
        
        System.out.println();
        System.out.println();
        
        
        /**
         * Exemplo os itens do Estoque
         */
        System.out.println("| Estoque |\n");
        
        b.exibeItensEstoque();
        
         
        
        /**
         * Exemplo Empresta Item 
         */
        System.out.println();
        System.out.println();
        
        
        System.out.println("Empréstimo\nTítulo:TITITI\nUsuario:Ronald Golias");
        b.EmprestaItem("Ronald Golias","TITITI");
        b.exibeEmprestimos("Ronald Golias");
        
        /**
         * Verificando se o empréstimo foi computado
         * 
         */
        System.out.println();
        b.exibeItensEstoque();
        
        System.out.println();
        System.out.println();
        
        /**
         * Realizando a Devolução do Item
         */
        System.out.println("Devolução\nTítulo:TITITI\nUsuario:Ronald Golias");       
        b.DevolveItem("Ronald Golias","TITITI");
        b.exibeEmprestimos("Ronald Golias");
        
        /**
         * Verificando se a devolução foi computada
         */
        
        System.out.println();
        b.exibeItensEstoque();
        
        System.out.println();
        System.out.println();
        
        /**
         * Testando a remoção de um item do catálogo e por conseguintes
         * da biblioteca e do estoque
         */
        
        b.removeItemCatalogo("Playboy MAIO");
        
        b.exibeItensBiblioteca();
        b.exibeItensEstoque();
        b.exibeItensCatalogo();
        
        
        
    }
    
}
