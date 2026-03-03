package br.com.thnocard.principal;

import br.com.thnocard.dio_bootcamp.Bootcamp;
import br.com.thnocard.dio_bootcamp.CursosDIO;
import br.com.thnocard.dio_bootcamp.Mentorias;
import br.com.thnocard.faculdade.Student;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    private final static Scanner scander = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println();
        System.out.println("======================================================== 'UNIVERSIDADE DIO' ========================================================");
        System.out.println();

        var option = 0;
        while (true) {
            System.out.println("Escolha uma das opções: ");
            System.out.println("1. Matricular Estudante na Graduação");
            System.out.println("2. Matricular Estudante nos Cursinhos");
            System.out.println("3. Adicionar Professores");
            System.out.println("4. Remover Professores");
            System.out.println("5. Adicionar Matérias");
            System.out.println("6. Remover Matérias");
            System.out.println("7. Sair");
            option = scander.nextInt();

            if(option == 1) {
                registerGraduationStudents();
            } else if(option == 2) {
                registerDIOCourses();
            } else if(option == 3) {
                registerProfessors();
            } else if(option == 4) {
                deleteProfessors();
            } else if(option == 5) {
                registerGraduationContents();
            } else if(option == 6) {
                deleteGraduationContents();
            } else if(option == 7) {
                System.out.println("\n" + "Muito obrigado e volte logo!");
                System.out.println("Programa finalizado!");
                break;
            } else {
                System.out.println("\n" + "ATENÇÃO!");
                System.out.println("Opção Inválida");
                System.out.println();
                continue;
            }

        }

    }

    // Metodo de Matricular / Registrar os(as) estudantes
    private static void registerGraduationStudents() {
    }

    // Metodo de Matricular os(as) estudantes nos cursinhos / bootcamps da DIO
    private static void registerDIOCourses() {
        System.out.println();

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
        System.out.println();

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
        System.out.println();
    }

    // Metodo de Cadastrar Professores da Graduação
    private static void registerProfessors() {
    }

    // Metodo de Excluir Professores
    private static void deleteProfessors() {
    }

    // Metodo de Matricular / Registrar os(as) estudantes
    private static void deleteGraduationContents() {
    }

    // Metodo de Registrar materias / conteudos dos cursos de graduação
    private static void registerGraduationContents() {
    }

}