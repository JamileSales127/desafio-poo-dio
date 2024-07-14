package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

  LocalDate data;

  public Mentoria(String titulo, String descricao) {
    super(titulo, descricao);
  }

  @Override
  public double calcularXp() {
    return XP_PADRAO + 20d;
  }

  public void adicionarCurso(String titulo, String descricao, LocalDate data){
    this.setTitulo(titulo);
    this.setDescricao(descricao);
    this.data = data;
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "Conteudo{" +
        "titulo='" + getTitulo() + '\'' +
        ", descricao='" + getDescricao() + '\'' +
        ", data='" + data + '\'' +
        '}';
  }

}
