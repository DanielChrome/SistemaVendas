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
 */
@Entity
public class Produto implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    
    @Column
    private String descricao;
    
    @Column
    private int estoque;
    
    public Produto(){
        
    }
    
    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
}
