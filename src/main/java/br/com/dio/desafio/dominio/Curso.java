package br.com.dio.desafio.dominio;

public class Curso {
  private String titulo;
  private String descricao;
  private int cargaHoraria;

  public Curso() {
    this.titulo = titulo;
    this.descricao = descricao;
    this.cargaHoraria = cargaHoraria;
  }

  public void adicionarCurso(String titulo, String descricao, int cargaHoraria){
    this.titulo = titulo;
    this.descricao = descricao;
    this.cargaHoraria = cargaHoraria;
  }
  public String getTitulo() {
    return titulo;
  }

  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public String toString() {
    return "Curso{" +
        "titulo='" + titulo + '\'' +
        ", descricao='" + descricao + '\'' +
        ", cargaHoraria=" + cargaHoraria +
        '}';
  }
}
