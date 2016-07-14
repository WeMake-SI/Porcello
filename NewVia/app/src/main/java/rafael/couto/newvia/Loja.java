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
    private String abertura;
    private String fechamento;
    private String contato;
    private String selecao;
    private String imageURL;

    public Loja() {
    }

    public Loja(String nome, String descricao, String categoria, String atendimento, String abertura, String fechamento, String contato, String selecao, String imageURL){
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.atendimento = atendimento;
        this.abertura = abertura;
        this.fechamento = fechamento;
        this.contato = contato;
        this.selecao = selecao;
        this.imageURL = imageURL;
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

    public String getImageURL(){
        return imageURL;
    }

    public void setImageURL(String imageURL){
        this.imageURL = imageURL;
    }

    public String getAbertura(){
        return abertura;
    }

    public void setAbertura(String abertura){
        this.abertura = abertura;
    }

    public String getFechamento(){
        return fechamento;
    }

    public void setFechamento(String fechamento){
        this.fechamento = fechamento;
    }
}
