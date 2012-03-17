/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;
import java.util.List;
/**
 *
 * @author DanielChrome
 * @version 0.3.17
 */
public class Venda {
    private int codVenda;
    private String data;
    private Cliente Cliente;
    private List<ItemVenda> ItemVenda;

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public int getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public void addItem(ItemVenda iv){
        ItemVenda.add(iv);
    }
    
    public ItemVenda getItem(int n){
        return ItemVenda.get(n);
    }
    
    public void removItem(int n){
        ItemVenda.remove(n);
    }
    
}
