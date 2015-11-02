package br.com.cakeplanning.cadastro.bolo;

import br.com.cakeplanning.cadastro.componente.Forma;
import br.com.cakeplanning.cadastro.componente.Massa;
import br.com.cakeplanning.cadastro.componente.Recheio;
import br.com.cakeplanning.cadastro.componente.Tamanho;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 * @author Thiago Brasil
 */

@Entity
public class BoloAndar implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    
    @ManyToOne
    private Forma forma;
    
    @ManyToOne
    private Massa massa;
    
    @ManyToOne
    private Recheio recheio;
    
    @ManyToOne
    private Tamanho tamanho;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Forma getForma() {
        return forma;
    }

    public void setForma(Forma forma) {
        this.forma = forma;
    }

    public Massa getMassa() {
        return massa;
    }

    public void setMassa(Massa massa) {
        this.massa = massa;
    }

    public Recheio getRecheio() {
        return recheio;
    }

    public void setRecheio(Recheio recheio) {
        this.recheio = recheio;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

}
