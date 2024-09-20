package br.com.springboot.dao;

import java.util.List;

import br.com.springboot.model.Cliente;

public interface CRUD<T, ID> {
    T pesquisaPeloId(ID id);
    void insere(T t);
    void atualiza(T t);
    void remove(T t);
	List<Cliente> lista();
	List<Cliente> listaTodos();
}