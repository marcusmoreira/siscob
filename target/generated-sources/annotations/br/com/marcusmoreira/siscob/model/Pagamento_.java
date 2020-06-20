package br.com.marcusmoreira.siscob.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pagamento.class)
public abstract class Pagamento_ {

	public static volatile SingularAttribute<Pagamento, Integer> idPagamento;
	public static volatile SingularAttribute<Pagamento, Integer> idDivida;
	public static volatile SingularAttribute<Pagamento, Date> dataPagamento;
	public static volatile SingularAttribute<Pagamento, Float> valorPago;

}

