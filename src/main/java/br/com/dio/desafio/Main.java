package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descrição curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("curso js");
    curso2.setDescricao("descrição curso js");
    curso2.setCargaHoraria(4);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria de java");
    mentoria.setDescricao("descrição mentoria java");
    mentoria.setData(LocalDate.now());
    Bootcamp bootcamp = new Bootcamp();

    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);

    Dev devJamile = new Dev();
    devJamile.setNome("Jamile");
    devJamile.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos Jamile:" + devJamile.getConteudosInscritos());
    devJamile.progredir();
    System.out.println("-");
    System.out.println("Conteúdos Inscritos Jamile:" + devJamile.getConteudosInscritos());
    System.out.println("Conteúdos Concluídos Jamile:" + devJamile.getConteudosConcluidos());
    System.out.println("XP:" + devJamile.calcularTotalXp());

    System.out.println("-------");

    Dev devLucas = new Dev();
    devLucas.setNome("Lucas");
    devLucas.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos Lucas:" + devLucas.getConteudosInscritos());
    devLucas.progredir();
    System.out.println("-");
    System.out.println("Conteúdos Inscritos Lucas:" + devLucas.getConteudosInscritos());
    System.out.println("Conteúdos Concluidos Lucas:" + devLucas.getConteudosConcluidos());
    System.out.println("XP:" + devLucas.calcularTotalXp());

  }
}