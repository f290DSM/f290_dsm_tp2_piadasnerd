package br.com.fatecararas.f290_dsm_tp2_piadasnerd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "piadas")
public class Piada {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descricao;
    private String resposta;
    private boolean possuiResposta;

    public Piada() {
    }
    public Piada(String descricao, String resposta, boolean possuiResposta) {
        this.descricao = descricao;
        this.resposta = resposta;
        this.possuiResposta = possuiResposta;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getResposta() {
        return resposta;
    }
    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    public boolean isPossuiResposta() {
        return possuiResposta;
    }
    public void setPossuiResposta(boolean possuiResposta) {
        this.possuiResposta = possuiResposta;
    }
    @Override
    public String toString() {
        return "Piada [descricao=" + descricao + ", resposta=" + resposta + ", possuiResposta=" + possuiResposta + "]";
    }

}
