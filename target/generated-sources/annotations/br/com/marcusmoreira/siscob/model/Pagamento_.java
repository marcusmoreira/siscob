package br.com.marcusmoreira.siscob.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pagamento.class)
public abstract class Pagamento_ {

	public static volatile SingularAttribute<Pagamento, Integer> idPagamento;
	public static volatile SingularAttribute<Pagamento, String> dataPagamento;
	public static volatile SingularAttribute<Pagamento, Integer> idDividaPagamento;
	public static volatile SingularAttribute<Pagamento, Float> valorPago;

}

