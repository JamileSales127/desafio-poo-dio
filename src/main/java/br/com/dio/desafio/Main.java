package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Curso;

public class Main {

  public static void main(String[] args) {
    Curso curso = new Curso();
    curso.adicionarCurso("Confeitaria", "aprenda a fazer doces deliciosos", 40);
    System.out.println(curso);
  }
}