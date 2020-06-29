package br.com.marcusmoreira.siscob.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Divida.class)
public abstract class Divida_ {

	public static volatile SingularAttribute<Divida, Integer> idDivida;
	public static volatile SingularAttribute<Divida, String> dataAtualizacao;
	public static volatile SingularAttribute<Divida, Float> valorDivida;
	public static volatile SingularAttribute<Divida, Integer> idCredor;
	public static volatile SingularAttribute<Divida, Integer> idDevedor;

}

