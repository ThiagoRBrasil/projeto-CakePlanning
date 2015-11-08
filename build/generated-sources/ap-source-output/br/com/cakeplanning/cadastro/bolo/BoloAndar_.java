package br.com.cakeplanning.cadastro.bolo;

import br.com.cakeplanning.cadastro.componente.Forma;
import br.com.cakeplanning.cadastro.componente.Massa;
import br.com.cakeplanning.cadastro.componente.Recheio;
import br.com.cakeplanning.cadastro.componente.Tamanho;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(BoloAndar.class)
public abstract class BoloAndar_ {

	public static volatile SingularAttribute<BoloAndar, Massa> massa;
	public static volatile SingularAttribute<BoloAndar, Recheio> recheio;
	public static volatile SingularAttribute<BoloAndar, Tamanho> tamanho;
	public static volatile SingularAttribute<BoloAndar, Integer> id;
	public static volatile SingularAttribute<BoloAndar, Forma> forma;

}

