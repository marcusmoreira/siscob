package br.com.marcusmoreira.siscob.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pessoa.class)
public abstract class Pessoa_ {

	public static volatile SingularAttribute<Pessoa, Integer> idPessoa;
	public static volatile SingularAttribute<Pessoa, String> uf;
	public static volatile SingularAttribute<Pessoa, String> telefone;
	public static volatile SingularAttribute<Pessoa, String> endereco;
	public static volatile SingularAttribute<Pessoa, String> nomePessoa;
	public static volatile SingularAttribute<Pessoa, String> documento;
	public static volatile SingularAttribute<Pessoa, String> email;

}

