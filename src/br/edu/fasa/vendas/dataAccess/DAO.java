/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.dataAccess;

import br.edu.fasa.vendas.domainModel.Repository;
import java.util.List;
import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Chrome
 */
public class DAO<T> implements Repository<T>{

    private EntityManager manager;
    private Class classe;
    
    public DAO(Class t){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("VendasPU");
        manager = factory.createEntityManager();
        classe = t;
    }
    
    @Override
    public T abrir(Long Id) {
        return (T)manager.find(classe, Id);
    }

    @Override
    public void apagar(T obj) {
        EntityTransaction tran = manager.getTransaction();
        try{
            tran.begin();;
            manager.remove(obj);
            tran.commit();
        }
        catch(Exception ex){
            tran.rollback();
            ex.printStackTrace();
        }
              
    }

    @Override
    public List<T> listar() {
        
        Query query = manager.createQuery(query);
    }

    @Override
    public void salvar(T obj) {
        EntityTransaction tran = manager.getTransaction();
        try{
            tran.begin();;
            manager.persist(obj);
            tran.commit();
        }
        catch(Exception ex){
            tran.rollback();
            ex.printStackTrace();
        }
    }
    
    
    
}
