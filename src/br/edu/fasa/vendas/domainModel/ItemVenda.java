/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;
import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author DanielChrome
 * @version 0.4.13
 * 
 */

@Entity
@Table(name="itemvenda")
public class ItemVenda {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    
    
    @ManyToOne(cascade= CascadeType.PERSIST)
    @JoinColumn(name="venda")
    private Produto Venda;
    
    @ManyToOne(cascade= CascadeType.PERSIST)
    @JoinColumn(name="produto")
    private Produto Produto;
    
    @Column
    private int quantidade;
    
    @Column
    private float valor;
    
    public ItemVenda(){
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return Produto;
    }

    public void setProduto(Produto Produto) {
        this.Produto = Produto;
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
