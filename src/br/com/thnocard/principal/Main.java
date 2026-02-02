package br.com.thnocard.principal;

import br.com.thnocard.dio_bootcamp.CursosDIO;
import br.com.thnocard.dio_bootcamp.Mentorias;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        CursosDIO curso1 = new CursosDIO();
        curso1.setTitleContent("Curso Java");
        curso1.setDescriptContent("Curso de Formação Profissional de Desenvolvimento Java");
        curso1.setTimeTableBootcamp(22);

        CursosDIO curso2 = new CursosDIO();
        curso2.setTitleContent("Curso C# .NET");
        curso2.setDescriptContent("Curso de Formação Profissional de Desenvolvimento em C# .NET");
        curso2.setTimeTableBootcamp(40);

        CursosDIO curso3 = new CursosDIO();
        curso3.setTitleContent("Curso Lógica de Programação com JS");
        curso3.setDescriptContent("Curso Inicial de Lógica de Programação com JavaScritp");
        curso3.setTimeTableBootcamp(30);

        Mentorias metoria1 = new Mentorias();
        metoria1.setTitleContent("Mentoria de Java");
        metoria1.setDescriptContent("Macetes e dicas para entrevistas de emprego e curriculo");
        metoria1.setDatePublishMentoria(LocalDate.now());


        System.out.println("======================= CURSOS DA 'UNIVERSIDADE DIO' ==============================");
        System.out.println();

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);

        System.out.println();
        System.out.println(metoria1);

    }
}