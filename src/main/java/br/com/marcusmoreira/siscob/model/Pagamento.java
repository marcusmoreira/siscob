package br.com.marcusmoreira.siscob.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PAGAMENTO")
public class Pagamento {
    @Id
    @Column(name="id_pagamento")
    private int idPagamento;
    @Column(name="id_divida")
    private int idDivida;
    @Column(name="data_pagamento")
    private Date dataPagamento;
    @Column(name="valor_pago")
    private float valorPago;

    public Pagamento(){
        
    }
    
    public Pagamento(int idDivida, Date dataPagamento, float valorPago){
        super();
        this.idDivida = idDivida;
        this.dataPagamento = dataPagamento;
        this.valorPago = valorPago;
    }    
    
    public Pagamento(int idPagamento, int idDivida, Date dataPagamento, float valorPago){
        super();
        this.idPagamento = idPagamento;
        this.idDivida = idDivida;
        this.dataPagamento = dataPagamento;
        this.valorPago = valorPago;
    }

    public int getIdPagamento() {
        return idPagamento;
    }


    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }


    public int getIdDivida() {
        return idDivida;
    }


    public void setIdDivida(int idDivida) {
        this.idDivida = idDivida;
    }


    public Date getDataPagamento() {
        return dataPagamento;
    }


    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }


    public float getValorPago() {
        return valorPago;
    }


    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

 
}
