package br.com.thnocard.faculdade;

import br.com.thnocard.dio_bootcamp.Bootcamp;
import br.com.thnocard.dio_bootcamp.Contents;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Student {

    private String name;
    private Set<Contents> contentsAdicionados = new LinkedHashSet<>(); // Listando...
    private Set<Contents> contentsConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) { // Metodo
        this.contentsAdicionados.addAll(bootcamp.getConteudos());
        bootcamp.getEstudantesMatriculados().add(this);
    }

    public void progredirBootcamp() {
        Optional<Contents> conteudos = this.contentsAdicionados.stream().findFirst();

        if(conteudos.isPresent()) {
            this.contentsConcluidos.add(conteudos.get());
            this.contentsAdicionados.remove(conteudos.get());
        } else {
            System.out.println("Você não está matriculado em nenhum curso");
        }
    }

    public double calculoXP() {
        return this.contentsConcluidos
                .stream()
                .mapToDouble(Contents::calculoXP)
                .sum();
    }

    public void matriculaFaculdade() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Contents> getConteudosAdicionados() {
        return contentsAdicionados;
    }

    public void setConteudosAdicionados(Set<Contents> contentsAdicionados) {
        this.contentsAdicionados = contentsAdicionados;
    }

    public Set<Contents> getConteudosConcluidos() {
        return contentsConcluidos;
    }

    public void setConteudosConcluidos(Set<Contents> contentsConcluidos) {
        this.contentsConcluidos = contentsConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(contentsAdicionados, student.contentsAdicionados) && Objects.equals(contentsConcluidos, student.contentsConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentsAdicionados, contentsConcluidos);
    }
}