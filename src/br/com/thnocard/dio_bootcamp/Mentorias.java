package br.com.thnocard.dio_bootcamp;

import java.time.LocalDate;

public class Mentorias {

    private String titleMentoria;
    private String descMentoria;
    private LocalDate datePublishMentoria;

    public Mentorias() { // Construtor sem argumentos / vazio
    }

    public String getTitleMentoria() {
        return titleMentoria;
    }

    public void setTitleMentoria(String titleMentoria) {
        this.titleMentoria = titleMentoria;
    }

    public String getDescMentoria() {
        return descMentoria;
    }

    public void setDescMentoria(String descMentoria) {
        this.descMentoria = descMentoria;
    }

    public LocalDate getDatePublishMentoria() {
        return datePublishMentoria;
    }

    public void setDatePublishMentoria(LocalDate datePublishMentoria) {
        this.datePublishMentoria = datePublishMentoria;
    }

    @Override
    public String toString() {
        return "Mentorias{" +
                "titleMentoria='" + titleMentoria + '\'' +
                ", descMentoria='" + descMentoria + '\'' +
                ", datePublishMentoria=" + datePublishMentoria +
                '}';
    }
}