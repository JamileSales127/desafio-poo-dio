package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

  private int cargaHoraria;

  public Curso(String titulo, String descricao) {
    super(titulo, descricao);
  }

  @Override
  public double calcularXp() {
    return XP_PADRAO * cargaHoraria;
  }

  public void adicionarCurso(String titulo, String descricao, int cargaHoraria){
    this.setTitulo(titulo);
    this.setDescricao(descricao);
    this.cargaHoraria = cargaHoraria;
  }

  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }


  @Override
  public String toString() {
    return "Conteudo{" +
        "titulo='" + getTitulo() + '\'' +
        ", descricao='" + getDescricao() + '\'' +
        ", carga horaria='" + cargaHoraria + '\'' +
        '}';
  }
}
