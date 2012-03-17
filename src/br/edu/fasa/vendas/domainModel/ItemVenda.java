/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;

/**
 *
 * @author DanielChrome
 * @version 0.3.17
 * 
 */
public class ItemVenda {
    private Venda Venda;
    private Produto Produto;
    private int quantidade;
    private float valor;

    public Produto getProduto() {
        return Produto;
    }

    public void setProduto(Produto Produto) {
        this.Produto = Produto;
    }

    public Venda getVenda() {
        return Venda;
    }

    public void setVenda(Venda Venda) {
        this.Venda = Venda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    
    
}
