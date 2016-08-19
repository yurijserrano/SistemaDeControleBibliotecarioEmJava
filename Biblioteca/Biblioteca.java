package Biblioteca;


import Itens.Item;
import Reserva.Reserva;
import Emprestimo.Emprestimo;
import Catalogo.Catalogo;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.GregorianCalendar;
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
public class Biblioteca  implements EmprestimoReserva
{

    
    private Catalogo catalogo;
    private List<Usuario> usuarios;
    private List<Item> itens;
    private List<Bibliotecario> bibliotecarios;
    private List<Item> estoque;
    
    
      
    
    /**
     * Construtor da classe Biblioteca
     */
    public Biblioteca()
    {
        this.usuarios= new ArrayList<Usuario>();
        this.itens= new ArrayList<Item>();
        this.estoque=new ArrayList<Item>();
        this.bibliotecarios=new ArrayList<Bibliotecario>();
        this.catalogo=new Catalogo();
    }
    
    /**
     * Retorna o catalogo da biblioteca
     * @return 
     */
    public Catalogo getCatalogo()
    {
        return catalogo;
    }

    /**
     * Modifica o catalogo da biblioteca
     * @param catalogo 
     */
    public void setCatalogo(Catalogo catalogo) 
    {
        this.catalogo = catalogo;
    }
    
    /**
     * Adiciona o usuário na lista de usuários
     * @param usuario 
     */
    @Override
    public void addUsuario(Usuario usuario)
    {
        if(!usuarios.contains(usuario))
            this.usuarios.add(usuario);
    }
    
    /**
     * Exibe todos os itens da biblioteca
     */
    public void exibeItensBiblioteca()
    {
        Iterator<Item> it = itens.iterator();
        
        while(it.hasNext())
        {
            Item i = it.next();
            
            System.out.println(i.getTitulo()+" | "+i.getAutor());
        }
    }
     /**
     * Exibe todos os itens da estoque mais sua quantidade
     */
    public void exibeItensEstoque()
    {
        Iterator<Item> it = estoque.iterator();
        
        while(it.hasNext())
        {
            Item i = it.next();
            
            System.out.println(i.getTitulo()+" | "+i.getAutor()+" | "+i.getQtdItem());
        }
    }
    
    /**
     * Exibe os empréstimos de determinado usuário
     * @param usuario 
     */
    public void exibeEmprestimos(String usuario)
    {
        Iterator<Usuario> us = usuarios.iterator();
       
        
        while(us.hasNext())
        {
            Usuario u = us.next();
            
            if(u.getNome().equals(usuario))
            {
                u.exibeEmp();
                
            }
        }
    }
    
    
    /**
     * Exibe as reservas de um determinado usuário
     * @param usuario 
     */
    public void exibeReservas(String usuario)
    {
        Iterator<Usuario> us = usuarios.iterator();
       
        
        while(us.hasNext())
        {
            Usuario u = us.next();
            
            if(u.getNome().equals(usuario))
            {
                u.exibeRes();
                
            }
        }
    }
    
    /**
     * Busca um determinado usuário que esta na lista de
     * usuários.
     * @param usuario
     * @return 
     */
    public Usuario buscaUsuario(String usuario)
    {
        Iterator<Usuario> user = usuarios.iterator();
        Usuario us= null;
        
        while(user.hasNext())
        {
            Usuario u = user.next();
            
            if(u.getNome().equals(usuario))
            {
                us=u;
            }
        }
        
        return us;
    }
    
    /**
     * Adiciona o bibliotecario na lista de bibliotecarios
     * @param bibliotecario 
     */
    @Override
    public void addBibliotecario(Bibliotecario bibliotecario)
    {
        if(!bibliotecarios.contains(bibliotecario))
            this.bibliotecarios.add(bibliotecario);
    }
    
     /**
     * Busca um determinado bibliotecário que esta na lista de
     * bibliotecários.
     * @param bibliotecario
     * @return 
     */
    public Bibliotecario buscaBibliotecario(String bibliotecario)
    {
        Iterator<Bibliotecario> br = bibliotecarios.iterator();
        Bibliotecario bs= null;
        
        while(br.hasNext())
        {
            Bibliotecario b = br.next();
            
            if(b.getNome().equals(bibliotecario))
            {
                bs=b;
            }
        }
        
        return bs;
    }
    
    /**
     * Exibe os itens do catalogo
     */
    
    public void exibeItensCatalogo()
    {
        catalogo.exibeItensCatalogo();
    }
    
    /**
     * Exibe todos os usuários da biblioteca
     */
    public void exibeUsuarios()
    {
        Iterator<Usuario> us = usuarios.iterator();
        
        while(us.hasNext())
        {
            Usuario u = us.next();
            
            System.out.println(u.getNome());
        }
        
    }
    
    /**
     * Adiciona um item na lista de itens e na lista de estoques
     * @param item 
     */
    @Override
    public void addItemBiblioteca(Item item)
    {
        this.itens.add(item);
        
        Iterator<Item> es = estoque.iterator();
        int cont =0;
        while(es.hasNext())
        {
            Item t = es.next();
            
            if(t.getTitulo().equals(item.getTitulo()))
                cont=1;   
            
        }
        
        if(cont==0)
            this.estoque.add(item);
        
        
        
        
        else
        {
            Iterator<Item> iterador = estoque.iterator();
            
            while(iterador.hasNext())
            {
                Item i = iterador.next();
                
                if(i.getTitulo().equals(item.getTitulo()))
                    i.setQtdItem(i.getQtdItem()+1);
                
                
            }
                
        }
            
        
    }
    /**
     * Busca um determinado item que esta na lista de
     * itens
     * @param item
     * @return 
     */
    @Override
    public Item buscaItemItens(String item)
    {
        Iterator<Item> it = itens.iterator();
        Item i= null;
        
        while(it.hasNext())
        {
            Item ii = it.next();
            
            if(ii.getTitulo().equals(item))
            {
                i=ii;
            }
        }
        
        return i;
    }
    
    
    /**
     * Busca um determinado item que esta na lista de
     * itens e retorna uma lista dos elementos iguais
     * @param item
     * @return 
     */
    @Override
    public List<Item> buscaItemItens2(String item)
    {
        Iterator<Item> it = itens.iterator();
        List<Item> i= new ArrayList<Item>();
        
        while(it.hasNext())
        {
            Item ii = it.next();
            
            if(ii.getTitulo().equals(item))
            {
                i.add(ii);
            }
        }
        
        return i;
    }
    
    /**
     * Busca um determinado item que esta na lista de
     * estoque
     * @param item
     * @return 
     */
    @Override
    public Item buscaItemEstoque(String item)
    {
        Iterator<Item> it = estoque.iterator();
        Item i= null;
        
        while(it.hasNext())
        {
            Item ii = it.next();
            
            if(ii.getTitulo().equals(item))
            {
                i=ii;
            }
        }
        
        return i;
    }
    
    
    /**
     * Adiciona o item no catalogo
     * @param i 
     */
    @Override
    public void addItemCatalogo(Item i)
    {
        this.catalogo.addItem(i);
    }
    
    
    /**
     * Remove o item do catalogo,sendo para isto digitar
     * o sue título para a busca e remoção.
     * @param titulo 
     */
    @Override
    public void removeItemCatalogo(String titulo)
    {
         /**
         * Arrumam os problemas gerados pela regra de negócios
         */
        CorrigeProblemas1();
        CorrigeProblemas2();
        CorrigeProblemas3();
        CorrigeProblemas4();
        CorrigeProblemas5();
        CorrigeProblemas6();
        
        this.catalogo.removeItem(titulo);
        Iterator<Item> it = itens.iterator();
        
        while(it.hasNext())
        {
            Item item = it.next();
            
            if(item.getTitulo().equals(titulo))
            {
                it.remove();
            }
        }
        
        Iterator<Item> it2 = estoque.iterator();
        
        while(it2.hasNext())
        {
         
            Item item2 = it2.next();
            
            if(item2.getTitulo().equals(titulo))
            {
                it2.remove();
            }
        }
        
    }
    
    /**
     * Este método realiza a compra dos itens (5) segundo a especificação
     * da RN e incrementa em cinco a quantidade dele no estoque.
     * @param item 
     */
    @Override
    public void compraItem(Item item)
    {
        int i=0;
        
        for(i=0;i<5;i++)
        {
            itens.add(item);
        }
        
        Iterator<Item> it = estoque.iterator();
        
        while(it.hasNext())
        {
            Item j = it.next();
            
            if(j.getTitulo().equals(item.getTitulo()))
            {
                j.setQtdItem(j.getQtdItem()+5);
            }
        }
        
        
    }
    
    
    /**
     * Este método faz a renovação do item mediante o nome do
     * usuário e o nome do item.
     * @param usuario
     * @param titulo 
     */
    @Override
    public void RenovaItem(String usuario,String titulo)
    {
        
        Iterator<Usuario> us = usuarios.iterator();
        
        while(us.hasNext())
        {
            Usuario u = us.next();
            
            if(u.getNome().equals(usuario))
            {
                Emprestimo emp = u.buscaEmprestimo(usuario, titulo);
                
                Iterator<Item> item = itens.iterator();
        
                while(item.hasNext())
                {
                    Item i = item.next();
                    if(i.equals(emp.getItem()))
                       if(i.getTitulo().equals(titulo) && i.getRenovar()==0)
                       {
                         GregorianCalendar gc;
                         GregorianCalendar gc2 = new GregorianCalendar();
                
                         gc= i.getUltimoEmprestimo();
                
                         long dif = gc2.getTimeInMillis() - gc.getTimeInMillis();
                         long dias = dif/(24*60*60*1000);
                
                         if(dias>7)
                         {
                             System.out.println("Sua renovação não pode ser feita vista que a mesma excedeu"
                            + " o tempo de 7 dias");
                         }
                
                         if(dias<=7)
                         {
                            i.setRenovar(1);
                            i.setUltimoEmprestimo(gc2);
                         }
                       }
            
                    }
              }
        }      
    }
    
    
    /**
     * Este método faz a devolução do item mediante o nome do usuário e o título 
     * do item,em que são feitos tratamentos com relação ao prazo da entrega
     * especificado pela RN,em que caso o usuáro atrase ele será sancionado.
     * @param usuario
     * @param titulo 
     */
    @Override
    public void DevolveItem(String usuario,String titulo)
    {
        /**
         * Arrumam os problemas gerados pela regra de negócios
         */
        CorrigeProblemas1();
        CorrigeProblemas2();
        CorrigeProblemas3();
        CorrigeProblemas4();
        CorrigeProblemas5();
        CorrigeProblemas6();
        
        Iterator<Item> item = itens.iterator();
        int cont=0;
       
        while(item.hasNext())
        {
            Item it = item.next();
            
            if(it.getTitulo().equals(titulo) && it.getEmprestado()==1)
            {
                Iterator<Usuario> user = usuarios.iterator();
                while(user.hasNext())
                {
                    Usuario us = user.next();
                    
                    if(us.getNome().equals(usuario))
                    {
                        Emprestimo emp = us.buscaEmprestimo(usuario,titulo);
                        GregorianCalendar gc =emp.getItem().getUltimoEmprestimo();
                        
                        if(!it.getUltimoEmprestimo().equals(gc))
                            break;
                        
                        if(it.getUltimoEmprestimo().equals(gc))
                        {
                            cont=1;
                            if(us.getRestricao()==0 && it.getRenovar()==0)
                            {
                                
                                GregorianCalendar gc2 = new GregorianCalendar();
                                long dif =gc2.getTimeInMillis()-gc.getTimeInMillis();
                                long dias = dif/(24*60*60*1000);
                                
                                if(dias<=7)
                                {

                                    us.removeEmprestimo(emp);
                                    it.setEmprestado(0);
                                    
                                    Iterator<Item> it5 = estoque.iterator();
                                    
                                    while(it5.hasNext())
                                    {
                                        Item ite2 = it5.next();
                                        
                                        if(ite2.getTitulo().equals(titulo))
                                        {
                                            ite2.setQtdItem(ite2.getQtdItem()+1);
                                        }
                                    }
                                    
                                }
                                if(dias>7)
                                {
                                                                                                           
                                    us.removeEmprestimo(emp);
                                    us.setRestricao(1);
                                    it.setEmprestado(0);
                                    
                                    Iterator<Item> it4 = estoque.iterator();
                                    
                                    while(it4.hasNext())
                                    {
                                        Item ite = it4.next();
                                        
                                        if(ite.getTitulo().equals(titulo))
                                        {
                                            ite.setQtdItem(ite.getQtdItem()+1);
                                        }
                                    }
                                    
                                }
                                
                             break;   
                            }
                            if(us.getRestricao()==0 && it.getRenovar()==1)
                            {
                                GregorianCalendar gc2 = new GregorianCalendar();
                                long dif =gc2.getTimeInMillis()-gc.getTimeInMillis();
                                long dias = dif/(24*60*60*1000);
                                
                                if(dias>7)
                                {
                                    us.setRestricao(1);
                                    it.setRenovar(0);
                                    us.removeEmprestimo(emp);
                                    it.setEmprestado(0);
                                    
                                    Iterator<Item> it4 = estoque.iterator();
                                    
                                    while(it4.hasNext())
                                    {
                                        Item ite = it4.next();
                                        
                                        if(ite.getTitulo().equals(titulo))
                                        {
                                            ite.setQtdItem(ite.getQtdItem()+1);
                                        }
                                    }
                                    
                                }
                                if(dias<=7)
                                {
                                    
                                    us.removeEmprestimo(emp);
                                    it.setEmprestado(0);
                                    it.setRenovar(0);
                                    
                                    Iterator<Item> it4 = estoque.iterator();
                                    
                                    while(it4.hasNext())
                                    {
                                        Item ite = it4.next();
                                        
                                        if(ite.getTitulo().equals(titulo))
                                        {
                                            ite.setQtdItem(ite.getQtdItem()+1);
                                        }
                                    }
                                    
                                }
                                
                                break;
                            }
                            
                            if(us.getRestricao()==1 && it.getRenovar()==0)
                            {
                                GregorianCalendar gc2 = new GregorianCalendar();
                                long dif =gc2.getTimeInMillis()-gc.getTimeInMillis();
                                long dias = dif/(24*60*60*1000);
                                
                                if(dias>4)
                                {
                                    GregorianCalendar gc3 = new GregorianCalendar();
                                    us.setRestricao(2);
                                    us.setSuspenso(gc3);
                                    us.removeEmprestimo(emp);
                                    it.setEmprestado(0);
                                    
                                    Iterator<Item> it4 = estoque.iterator();
                                    
                                    while(it4.hasNext())
                                    {
                                        Item ite = it4.next();
                                        
                                        if(ite.getTitulo().equals(titulo))
                                        {
                                            ite.setQtdItem(ite.getQtdItem()+1);
                                        }
                                    }
                                    
                                }
                                if(dias<=4)
                                {
                                    
                                    us.removeEmprestimo(emp);
                                    it.setEmprestado(0);
                                    us.setContrestricao(us.getContrestricao()+1);
                                    Iterator<Item> it4 = estoque.iterator();
                                    
                                    while(it4.hasNext())
                                    {
                                        Item ite = it4.next();
                                        
                                        if(ite.getTitulo().equals(titulo))
                                        {
                                            ite.setQtdItem(ite.getQtdItem()+1);
                                        }
                                    }
                                    
                                }
                                
                                break;
                            }
                            if(us.getRestricao()==1 && it.getRenovar()==1)
                            {
                                GregorianCalendar gc2 = new GregorianCalendar();
                                long dif =gc2.getTimeInMillis()-gc.getTimeInMillis();
                                long dias = dif/(24*60*60*1000);
                                
                                if(dias>4)
                                {
                                    GregorianCalendar gc3 = new GregorianCalendar();
                                    us.setRestricao(2);
                                    it.setRenovar(0);
                                    us.setSuspenso(gc3);
                                    us.removeEmprestimo(emp);
                                    it.setEmprestado(0);
                                    
                                    Iterator<Item> it4 = estoque.iterator();
                                    
                                    while(it4.hasNext())
                                    {
                                        Item ite = it4.next();
                                        
                                        if(ite.getTitulo().equals(titulo))
                                        {
                                            ite.setQtdItem(ite.getQtdItem()+1);
                                        }
                                    }
                                    
                                }
                                if(dias<=4)
                                {
                                    
                                    us.removeEmprestimo(emp);
                                    it.setRenovar(0);
                                    it.setEmprestado(0);
                                    us.setContrestricao(us.getContrestricao()+1);
                                    Iterator<Item> it4 = estoque.iterator();
                                    
                                    while(it4.hasNext())
                                    {
                                        Item ite = it4.next();
                                        
                                        if(ite.getTitulo().equals(titulo))
                                        {
                                            ite.setQtdItem(ite.getQtdItem()+1);
                                        }
                                    }
                                    
                                }
                                
                                break;
                            }
                            
                        }
                    }
                    
                }
            }
            if(cont==1)
                break;
        }        
    }
    
    /**
     * Este metodo reserva um item mediante o nome do usuário e o título do item.
     * @param usuario
     * @param titulo 
     */
    @Override
    public void ReservaItem(String usuario,String titulo)
    {
         /**
         * Arrumam os problemas gerados pela regra de negócios
         */
        CorrigeProblemas1();
        CorrigeProblemas2();
        CorrigeProblemas3();
        CorrigeProblemas4();
        CorrigeProblemas5();
        CorrigeProblemas6();
        
        Iterator<Usuario> th = usuarios.iterator();
        int cont =0;
        
        while(th.hasNext())
        {
            Usuario u = th.next();
            if(u.getNome().equals(usuario))
            {
                cont=1;
                Iterator<Item> it = estoque.iterator();
                Item ti = it.next();
                
                if(ti.getTitulo().equals(titulo))
                {
                    Reserva res = new Reserva(u,ti);
                    
                    u.addReserva(res);
                    
                    ti.setnReserva(ti.getnReserva()+1);
                }
            }
            if(cont==1)
                break;
        }
    }
    
    
    /**
     * Este método remove a reserva ,mediante o nome do usuário
     * e o título do item reservado
     * @param usuario
     * @param titulo 
     */
    @Override
    public void RemoveReserva(String usuario,String titulo)
    {
         /**
         * Arrumam os problemas gerados pela regra de negócios
         */
        CorrigeProblemas1();
        CorrigeProblemas2();
        CorrigeProblemas3();
        CorrigeProblemas4();
        CorrigeProblemas5();
        CorrigeProblemas6();
        
        Iterator<Usuario> us = usuarios.iterator();
        
        while(us.hasNext())
        {
            Usuario user = us.next();
            
            if(user.getNome().equals(usuario))
            {
                Reserva res = user.buscaReserva(usuario, titulo);
                if(res==null)
                    System.out.println("Reserva não encontrada");
                
                if(res!=null)
                {
                    user.removeReserva(res);
                
                    Iterator<Item> it = estoque.iterator();
                
                    while(it.hasNext())
                    {
                        Item item = it.next();
                    
                        if(item.getTitulo().equals(titulo))
                        {
                            item.setnReserva(item.getnReserva()-1);
                        }
                    }
                }
           }
     
        }
        
    }
    
    /**
     * Este metodo Remove todos os itens que foram emprestados mais de 15 vezes
     */
    
    public void CorrigeProblemas1()
    {
        /**
         * 1° Remove todos os itens que foram emprestados mais de 15 vezes
         */
        Iterator<Item> iterador = itens.iterator();
        Item aux=null ;
        
        while(iterador.hasNext())
        {
            Item i = iterador.next();
            
            if(i.getNumEmprestimo() > 15)
            {
                aux=i;
                iterador.remove();
                
            
            
            
                Iterator<Item> it = estoque.iterator();
                while(it.hasNext())
                {
                    Item f = it.next();
                    if(f.getTitulo().equals(aux.getTitulo()))
                    {
                        f.setQtdItem(f.getQtdItem()-1);
                    }
                }
           }
        }
            
        /**
         * 1° Fim do procedimento
         */
    }
    
     /**
     * Este metodo Verifica se um item possui mais de 10 reservas sem estar disponível 
     * na biblioteca, caso tenha realiza a compra de mais 5 itens ,decrementando a
     * quantidade de reservas em 5
     */    
    public void CorrigeProblemas2()
    {
        /**
         * 2° Verifica se um item possui mais de 10 reservas sem estar disponível na biblioteca, caso tenha
         * realiza a compra de mais 5 itens ,decrementando a quantidade de reservas em 5
         */
         
            
         Iterator<Item> es3 = estoque.iterator();
         
         while(es3.hasNext())
         {
             Item et = es3.next();
             
             if(et.getQtdItem()==0 && et.getnReserva()> 10)
             {
                 //Este método realiza a compra dos itens
                 compraItem(et);
                 et.setnReserva(et.getnReserva()-5);
             }
         }
         
         
         /**
         * 2° Fim do procedimento
         */
            
    }
    
     /**
     * Este metodo Compra 5 itens se a qtdItem for 0 na estoque  e se não tiver
     * nenhum na itens.
     */    
    public void CorrigeProblemas3()
    {
         /**
         * 3° Compra 5 itens se a qtdItem for 0 na estoque  e se não tiver
         * nenhum na itens.
         */
        Iterator<Item> iterador2 = estoque.iterator();
        Item aux2=null ;
        
        while(iterador2.hasNext())
        {
                Item i = iterador2.next();
         
                if(i.getQtdItem()==0)
                {
                    
                        aux2=buscaItemItens(i.getTitulo());
                        
                        if(aux2==null)
                            compraItem(i);
                 }
                                
         }
        
        
            
            
        /**
         * 3° Fim do procedimento
         */   
            
    }
    
    /**
     * Este método remove todos os itens em que seu último empréstimo foi efetudo a mais de 2 anos
     */
    public void CorrigeProblemas4()
    {
        /**
         * 4° Remove todos os itens em que seu último empréstimo foi efetudo a mais de 2 anos
         */
            
            GregorianCalendar gc2 = new GregorianCalendar();
            
            Iterator<Item> it2 = itens.iterator();
            
            while(it2.hasNext())
            {
                Item ite = it2.next();
                
                GregorianCalendar gc = ite.getUltimoEmprestimo();
                              
                long dif =gc2.getTimeInMillis()-gc.getTimeInMillis();
                long dias = dif/(24*60*60*1000);
                
                if(dias > 731)
                {
                    it2.remove();
                
                
                    Iterator<Item> es = estoque.iterator();
                
                    while(es.hasNext())
                    {
                        Item e = es.next();
                        
                        if(e.getTitulo().equals(ite.getTitulo()))
                        {
                            e.setQtdItem(e.getQtdItem()-1);
                        }
                    
                    }
                }
            }
            
         /**
         * 4° Fim do procedimento
         */
            
            
    }
     /**
     * Este Verifica se o usuário que esta suspenso já cumpriu os seus 31 dias de suspensão,
     * caso tenha cumprido sua restrição será retirada.
     */
    public void CorrigeProblemas5()
    {
        /**
         * 5° Verifica se o usuário que esta suspenso já cumpriu os seus 31 dias de suspensão,caso tenha cumprido
         * sua restrição será retirada.
         */
         
         Iterator<Usuario> us4 = usuarios.iterator();
         GregorianCalendar hoje = new GregorianCalendar();
         
         while(us4.hasNext())
         {
             
             Usuario suspenso = us4.next();
             
             
             
             if(suspenso.getRestricao()==2)
             {
                 GregorianCalendar datasusp = suspenso.getSuspenso();
                 long dif =hoje.getTimeInMillis()-datasusp.getTimeInMillis();
                 long dias = dif/(24*60*60*1000);
                 
                 if(dias>31)
                 {
                     suspenso.setRestricao(0);
                 }
                 
                 else
                     System.out.println("Ainda não cumpriu sus suspensão");
             }
         }
         
         /**
         * 5° Fim do procedimento
         */
         
            
            
    }
    
    /**
     * Este Verifica se o usuário que esta com a restrição um fez a devolução dos itens corretamente
     *caso os tenha entre corretamente sua restrição será removida.
     */
    public void CorrigeProblemas6()
    {
        /**
         * 6° Verifica se o usuário que esta com a restrição um fez a devolução dos itens corretamente
         * caso os tenha entre corretamente sua restrição será removida.
         */
         
         Iterator<Usuario> us5 = usuarios.iterator();
         
         while(us5.hasNext())
         {
             Usuario ut = us5.next();
             if(ut.getRestricao()==1 && ut.getContrestricao()==5)
             {
                 ut.setRestricao(0);
                 ut.setContrestricao(0);
             }
         }
         
         /**
         * 6° Fim do procedimento
         */
        
       }
         
            
            
     /**
     * Este metodo realiza o empréstimo do item mediante o nome do usuário
     * e o título do item.
     * @param usuario
     * @param titulo 
     */
    @Override
    public void EmprestaItem(String usuario,String titulo)
    {
         /**
         * Arrumam os problemas gerados pela regra de negócios
         */
        CorrigeProblemas1();
        CorrigeProblemas2();
        CorrigeProblemas3();
        CorrigeProblemas4();
        CorrigeProblemas5();
        CorrigeProblemas6();
        
        int cont = 0;
        int cont2=0;
        
        
        Iterator<Item> iterador = estoque.iterator();
        
        while(iterador.hasNext())
        {
            Item i = iterador.next();
            
            if(i.getTitulo().equals(titulo))
            {
                if(i.getQtdItem() != 0)
                    cont=1;
                
                if(i.getQtdItem() == 0)
                {
                   
                    System.out.println("Não temos este item disponível no nosso estoque");
                }
            }
        }
        
        
        if(cont==1)
        {
            
            Iterator<Item> it = itens.iterator();
            
            while(it.hasNext())
            {
                Item i2 = it.next();
                if(i2.getTitulo().equals(titulo) && i2.getEmprestado() == 0)
                {
                    cont2=1;
                    Iterator<Usuario> us = usuarios.iterator();
                    
                    while(us.hasNext())
                    {
                        Usuario user = us.next();
                        
                        if(user.getNome().equals(usuario))
                        {
                            Emprestimo emp;
                            emp = new Emprestimo(user,i2);
                            
                            user.addEmprestimo(emp);                     
                            
                        }
                    }
                    
                    Iterator<Item> iterador2 = estoque.iterator();
                     
                    while(iterador2.hasNext())
                    {
                        Item j = iterador2.next();
                        
                        if(j.getTitulo().equals(titulo))
                        {
                            j.setQtdItem(j.getQtdItem()-1);
                            
                        }
                    }
                    
                    Iterator<Usuario> us2 = usuarios.iterator();
                    
                    while(us2.hasNext())
                    {
                        Usuario user2 = us2.next();
                        
                        if(user2.getNome().equals(usuario))
                        {
                            
                            Reserva res = user2.buscaReserva(usuario, titulo);
                            
                            if(res==null)
                                System.out.println("Este item não possui uma reserva");
                            
                            else
                            {
                                Item d = res.getItem();
                                user2.removeReserva(res);
                                
                                Iterator<Item> reserva = estoque.iterator();
                                while(reserva.hasNext())
                                {
                                    Item f = reserva.next();
                                    
                                    if(f.equals(d))
                                    {
                                        f.setnReserva(f.getnReserva()-1);
                                    }
                                }
                                
                            }
                        }
                    }
                    
                    
            
                       i2.setEmprestado(1);
                                              
                       GregorianCalendar gc = new GregorianCalendar();
                       i2.setUltimoEmprestimo(gc);
          
                    
                }
                if(cont2==1)
                    break;
            }
            
        }       
        
      }  
    
    }
    
    
    
    
    

