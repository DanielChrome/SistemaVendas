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
    private List<ItemVenda> ItemVenda; // letra minúscula e nome no plural

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
        ItemVenda.add(iv);
    }
    
    public ItemVenda getItem(int n){
        return ItemVenda.get(n);
    }
    
    
    // Falta um getItens, que retorna toda a lista
    
    public void removItem(int n){
        ItemVenda.remove(n);
    }
    
}
