package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitluo("curso Java");
        curso1.setDescricao("descriçao curso Java");
        curso1.setCargaHoraria(8);
        
        
        Curso curso2 = new Curso();
        curso2.setTitluo("curso Js");
        curso2.setDescricao("descriçao curso Js");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
