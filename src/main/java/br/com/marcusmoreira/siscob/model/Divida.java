package br.com.marcusmoreira.siscob.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="DIVIDA")
public class Divida implements Serializable {
    @Id
    @Column(name="id_divida")
    private int idDivida;
    @Column(name="id_credor")
    private int idCredor;
    @Column(name="data_atualizacao")
    private Date dataAtualizacao;
    @Column(name="valor_divida")
    private float valorDivida;
    @Column(name="id_devedor")
    private int idDevedor;

    public Divida(){
        
    }
    
    public Divida(int idCredor, Date dataAtualizacao, float valorDivida, int idDevedor){
        super();
        this.idCredor = idCredor;
        this.dataAtualizacao = dataAtualizacao;
        this.valorDivida = valorDivida;
        this.idDevedor = idDevedor;
    }
    
    public Divida(int idDivida, int idCredor, Date dataAtualizacao, float valorDivida, int idDevedor){
        super();
        this.idDivida = idDivida;
        this.idCredor = idCredor;
        this.dataAtualizacao = dataAtualizacao;
        this.valorDivida = valorDivida;
        this.idDevedor = idDevedor;
    }
    
    public int getIdDivida() {
        return idDivida;
    }

    public void setIdDivida(int idDivida) {
        this.idDivida = idDivida;
    }

    public int getIdCredor() {
        return idCredor;
    }

    public void setIdCredor(int idCredor) {
        this.idCredor = idCredor;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public float getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getIdDevedor() {
        return idDevedor;
    }

    public void setIdDevedor(int idDevedor) {
        this.idDevedor = idDevedor;
    }
    
}
