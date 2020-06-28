package br.com.marcusmoreira.siscob.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import br.com.marcusmoreira.siscob.model.Usuario;
import br.com.marcusmoreira.siscob.model.Pessoa;
import br.com.marcusmoreira.siscob.model.Divida;
import br.com.marcusmoreira.siscob.model.Pagamento;

public class HibernateUtil {
     private static SessionFactory sessionFactory;

 public static SessionFactory getSessionFactory() {
  if (sessionFactory == null) {
   try {
    Configuration configuration = new Configuration();

    // Hibernate settings equivalent to hibernate.cfg.xml's properties
    Properties settings = new Properties();
    settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
    settings.put(Environment.URL, "jdbc:mysql://localhost:3306/siscob?useTimezone=true&serverTimezone=UTC");
    settings.put(Environment.USER, "root");
    settings.put(Environment.PASS, "123456");
    settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLInnoDBDialect");
    
    settings.put(Environment.SHOW_SQL, "true");
    settings.put(Environment.FORMAT_SQL, "true");
    settings.put(Environment.USE_SQL_COMMENTS, "true");
    
    settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

    //settings.put(Environment.HBM2DDL_AUTO, "validate");

    configuration.setProperties(settings);
    
    configuration.addAnnotatedClass(Usuario.class);
    configuration.addAnnotatedClass(Pessoa.class);
    configuration.addAnnotatedClass(Divida.class);
    configuration.addAnnotatedClass(Pagamento.class);

    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
      .applySettings(configuration.getProperties()).build();
    
    System.out.println("Hibernate Java Config serviceRegistry created");
    
    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    return sessionFactory;

   } catch (Exception e) {
    e.printStackTrace();
   }
  }
  return sessionFactory;
 }
}
