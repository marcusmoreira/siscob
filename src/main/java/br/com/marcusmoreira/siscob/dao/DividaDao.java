package br.com.marcusmoreira.siscob.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.marcusmoreira.siscob.model.Divida;
import br.com.marcusmoreira.siscob.util.HibernateUtil;

public class DividaDao {

     /**
     * Grava divida
     * @param divida
     */    
    public void saveDebt(Divida divida) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.save(divida);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    /**
     * Atualiza usuario
     * @param divida
     */
    public void updateDebpt(Divida divida) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.update(divida);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    /**
     * Remover divida
     * @param divida
     */
    public void deleteDebt(int intDivida) {

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            Divida divida = session.get(Divida.class, intDivida);
            if (divida != null) {
                session.delete(divida);
                System.out.println("debt is deleted");
            }

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

     /**
     * Pega usuario por login
     * @param login
     * @return
     */    
    public Divida getDebt(Divida divida) {

        Transaction transaction = null;
        Divida divida = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            divida = session.get(Divida.class, divida.getIdDevedor());

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return usuario;
    }

    /**
     * Todos usuarios
     * @return
     */
    @SuppressWarnings("unchecked")
    public List < Usuario > getAllUser() {

        Transaction transaction = null;
        List < Usuario > listOfUser = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            listOfUser = session.createQuery("FROM usuario").getResultList();
            
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return listOfUser;
    }
}
