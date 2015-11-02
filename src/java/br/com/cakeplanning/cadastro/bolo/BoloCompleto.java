package br.com.cakeplanning.cadastro.bolo;

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
public class BoloCompleto implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    
    @ManyToOne
    private BoloAndar andar1;
    
    @ManyToOne
    private BoloAndar andar2;
    
    @ManyToOne
    private BoloAndar andar3;
    
    @ManyToOne
    private BoloAndar andar4;
    
    @ManyToOne
    private BoloAndar andar5;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BoloAndar getAndar1() {
        return andar1;
    }

    public void setAndar1(BoloAndar andar1) {
        this.andar1 = andar1;
    }

    public BoloAndar getAndar2() {
        return andar2;
    }

    public void setAndar2(BoloAndar andar2) {
        this.andar2 = andar2;
    }

    public BoloAndar getAndar3() {
        return andar3;
    }

    public void setAndar3(BoloAndar andar3) {
        this.andar3 = andar3;
    }

    public BoloAndar getAndar4() {
        return andar4;
    }

    public void setAndar4(BoloAndar andar4) {
        this.andar4 = andar4;
    }

    public BoloAndar getAndar5() {
        return andar5;
    }

    public void setAndar5(BoloAndar andar5) {
        this.andar5 = andar5;
    }

}
