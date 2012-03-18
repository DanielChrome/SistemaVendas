/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;
import java.util.List;
import java.util.Date;
/**
 *
 * @author DanielChrome
 * @version 0.3.17
 */
public class Venda {
    private int id;
    private Date data;
    private Cliente Cliente;
    private List<ItemVenda> itens; // letra minúscula e nome no plural

    public Venda(){
        
    }
    
    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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
