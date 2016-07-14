package rafael.couto.newvia;

import java.io.Serializable;

/**
 * Created by Rafael on 29/05/2016.
 */
public class Loja implements Serializable {
    private String nome;
    private String descricao;
    private String categoria;
    private String atendimento;
    private String contato;
    private String selecao;

    public Loja() {
    }

    public Loja(String nome, String descricao, String categoria, String atendimento, String contato, String selecao) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.atendimento = atendimento;
        this.contato = contato;
        this.selecao = selecao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(String atendimento) {
        this.atendimento = atendimento;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getSelecao() {
        return selecao;
    }

    public void setSelecao(String selecao) {
        this.selecao = selecao;
    }
}
