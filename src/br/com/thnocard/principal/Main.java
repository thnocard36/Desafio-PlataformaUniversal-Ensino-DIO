package br.com.thnocard.principal;

import br.com.thnocard.dio_bootcamp.Bootcamp;
import br.com.thnocard.dio_bootcamp.CursosDIO;
import br.com.thnocard.dio_bootcamp.Mentorias;
import br.com.thnocard.faculdade.Student;

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

        CursosDIO curso4 = new CursosDIO();
        curso4.setTitleContent("Curso de Banco de Dados SQL Server");
        curso4.setDescriptContent("Curso de Gerenciamento de Banco de Dados SQL");
        curso4.setTimeTableBootcamp(16);


        Mentorias metoria1 = new Mentorias();
        metoria1.setTitleContent("Mentoria de Java");
        metoria1.setDescriptContent("Macetes e dicas para entrevistas de emprego e curriculo");
        metoria1.setDatePublishMentoria(LocalDate.now());

        Mentorias metoria2 = new Mentorias();
        metoria2.setTitleContent("Mentoria de C# .NET");
        metoria2.setDescriptContent("Dúvidas relacionadas ao Commit de Projetos .NET para o GitHub");
        metoria2.setDatePublishMentoria(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Backend com Java e AWS");
        bootcamp.setDescription("Bootcamp Backend com Java e AWS");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(metoria1);
        bootcamp.getConteudos().add(curso4);

        /*Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setName("Bootcamp Backend com C# .NET");
        bootcamp1.setDescription("Bootcamp Backend com C# .NET");
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(metoria2);
        bootcamp1.getConteudos().add(curso4);*/




        System.out.println();
        System.out.println("======================================================== 'UNIVERSIDADE DIO' ========================================================");
        System.out.println();

        Student studentThiago = new Student();
        studentThiago.setName("Thiago");
        studentThiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Thiago: " + studentThiago.getConteudosAdicionados());
        studentThiago.progredirBootcamp();
        studentThiago.progredirBootcamp();
        studentThiago.progredirBootcamp();

        System.out.println("-----------------------------------------------------------");
        System.out.println("Conteúdos Inscritos de Thiago: " + studentThiago.getConteudosAdicionados());
        System.out.println("Conteúdos Concluidos de Thiago: " + studentThiago.getConteudosConcluidos());
        System.out.println("XP: " + studentThiago.calculoXP());
        System.out.println();


        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");

        Student studentMaraiana = new Student();
        studentMaraiana.setName("Maraina");
        studentMaraiana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Maraina: " + studentMaraiana.getConteudosAdicionados());

        System.out.println("-----------------------------------------------------------");
        studentMaraiana.progredirBootcamp();
        studentMaraiana.progredirBootcamp();
        studentMaraiana.progredirBootcamp();
        studentMaraiana.progredirBootcamp();
        System.out.println("Conteúdos Inscritos de Maraina: " + studentMaraiana.getConteudosAdicionados());
        System.out.println("Conteúdos Concluidos de Maraina: " + studentMaraiana.getConteudosConcluidos());
        System.out.println("XP: " + studentMaraiana.calculoXP());


    /**
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);

        System.out.println();
        System.out.println(metoria1);  **/

    }
}