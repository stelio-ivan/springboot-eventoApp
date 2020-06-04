package com.eventoapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;


@Entity
public class Evento implements Serializable {

    private static final long serialVersionUUId=1L;


    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    @GeneratedValue(strategy  = GenerationType.AUTO)
    @Id
    private long codigo;

    @NotEmpty
    private String nome;
    @NotEmpty
    private String data;
    @NotEmpty
    private String local;
    @NotEmpty
    private String horario;

    @OneToMany( mappedBy="evento", cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Convidado> convidados;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public List<Convidado> getConvidados() {
        return convidados;
    }

    public void setConvidados(List<Convidado> convidados) {
        this.convidados = convidados;
    }
}