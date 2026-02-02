package br.com.thnocard.dio_bootcamp;

import br.com.thnocard.faculdade.Student;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String name;
    private String description;
    private final LocalDate dateStart = LocalDate.now();
    private final LocalDate dateEnding = LocalDate.now().plusDays(50);

    private Set<Student> estudantesMatriculados = new HashSet<>();
    private Set<Contents> conteudos = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public LocalDate getDateEnding() {
        return dateEnding;
    }

    public Set<Student> getEstudantesMatriculados() {
        return estudantesMatriculados;
    }

    public void setEstudantesMatriculados(Set<Student> estudantesMatriculados) {
        this.estudantesMatriculados = estudantesMatriculados;
    }

    public Set<Contents> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Contents> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(dateStart, bootcamp.dateStart) && Objects.equals(dateEnding, bootcamp.dateEnding) && Objects.equals(estudantesMatriculados, bootcamp.estudantesMatriculados) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, dateStart, dateEnding, estudantesMatriculados, conteudos);
    }

}