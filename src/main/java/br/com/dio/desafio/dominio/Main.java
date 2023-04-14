package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descriçao curso Java");
        curso1.setCargaHoraria(8);
        
        
        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("descriçao curso Js");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Desccição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamilla = new Dev();
        devCamilla.setNome("Camilla");
        devCamilla.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camilla: " + devCamilla.getConteudosInscritos());
        devCamilla.progredir();
        System.out.println("Conteudos Inscritos Camilla: " + devCamilla.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camilla: " + devCamilla.getConteudosConcluidos());
        System.out.println("XP:" + devCamilla.calcularTotalXp());

        System.out.println();
        System.out.println("=-------------------------------------------------------------------------------=");
        System.out.println();

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        //devJoao.progredir();
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}
