package br.com.thnocard.principal;

import br.com.thnocard.dio_bootcamp.CursosDIO;

public class Main {

    public static void main(String[] args) {

        CursosDIO curso1 = new CursosDIO();
        curso1.setTitleBootcamp("Curso Java");
        curso1.setDescriptBootcamp("Curso de Formação Profissional em Desenvolvimento Java");
        curso1.setTimeTableBootcamp(16);

        System.out.println(curso1);

    }
}