package Presentation;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.persistence.*;
import br.edu.fasa.vendas.domainModel.*;
/**
 *
 * @author Chrome
 */
public class Console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("VendasPU");
        EntityManager manager = factory.createEntityManager();
        // TODO code application logic here
    }
}
