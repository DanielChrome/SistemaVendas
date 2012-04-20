/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;
import java.util.List;
import java.util.Date;
import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author DanielChrome
 * @version 0.4.13
 */
@Entity
public class Venda implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_venda;
    
    @ManyToOne(cascade= CascadeType.PERSIST)
    @JoinColumn(name="cliente")
    private Cliente cliente;
    
    @OneToMany(cascade= CascadeType.ALL, targetEntity=ItemVenda.class)
    private List<ItemVenda> itens; // letra minúscula e nome no plural

    public Venda(){
        
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public Date getData() {
        return data_venda;
    }

    public void setData(Date data_venda) {
        this.data_venda = data_venda;
    }
    
    public void addItem(ItemVenda iv){
        itens.add(iv);
    }
    
    public ItemVenda getItem(int n){
        return itens.get(n);
    }
    
    public List getItens(){
        return itens;
    }
   
    public void removItem(int n){
        itens.remove(n);
    }
    
}
