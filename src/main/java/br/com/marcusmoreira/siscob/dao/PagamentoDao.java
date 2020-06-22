package br.com.marcusmoreira.siscob.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.marcusmoreira.siscob.model.Pagamento;
import br.com.marcusmoreira.siscob.util.HibernateUtil;

public class PagamentoDao {

     /**
     * Grava pagamento
     * @param pagamento
     */    
    public void savePayment(Pagamento pagamento) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.save(pagamento);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    /**
     * Atualiza pagamento
     * @param pagamento
     */
    public void updatePayment(Pagamento pagamento) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.update(pagamento);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    /**
     * Remover pagamento
     * @param idPagamento
     */
    public void deletePayment(int idPagamento) {

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            Pagamento pagamento = session.get(Pagamento.class, idPagamento);
            if (pagamento != null) {
                session.delete(pagamento);
                System.out.println("payment is deleted");
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
     * Pega pagamento por id_pagamento
     * @param idPagamento
     * @return
     */    
    public Pagamento getPayment(int idPagamento) {

        Transaction transaction = null;
        Pagamento pagamento = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            pagamento = session.get(Pagamento.class, idPagamento);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return pagamento;
    }

    /**
     * Todos os pagamentos
     * @return
     */
    @SuppressWarnings("unchecked")
    public List < Pagamento > getAllPayment() {

        Transaction transaction = null;
        List < Pagamento > listOfPayment = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            listOfPayment = session.createQuery("FROM pagamento").getResultList();
            
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return listOfPayment;
    }
}
