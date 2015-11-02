package br.com.cakeplanning.cadastro.componente;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author Thiago Brasil
 */

@Entity
public class Forma implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    
    @Column(nullable = false)
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
