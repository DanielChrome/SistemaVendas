/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainModel;

import java.util.List;

/**
 *
 * @author Chrome
 */
public interface Repository <T>{
    
    void salvar (T obj);
    T abrid(Long Id);
    void apagar(T obj);
    List<T> listar();
    
}
