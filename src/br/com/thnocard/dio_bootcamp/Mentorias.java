package br.com.thnocard.dio_bootcamp;

import java.time.LocalDate;

public class Mentorias extends Conteudos {

    private LocalDate datePublishMentoria;

    public Mentorias() { // Construtor sem argumentos / vazio
    }

    @Override
    public double calculoXP() {
        return PontosXP_Padrao + 20d;
    }

    public LocalDate getDatePublishMentoria() {
        return datePublishMentoria;
    }

    public void setDatePublishMentoria(LocalDate datePublishMentoria) {
        this.datePublishMentoria = datePublishMentoria;
    }

    @Override
    public String toString() { // Quando a classe mãe for 'privado', usar o método "getVariavelX";
        return "Mentorias{ " +
                "titleMentoria=' " + getTitleContent() + '\'' +
                ", descMentoria=' " + getDescriptContent() + '\'' +
                ", datePublishMentoria= " + datePublishMentoria +
                '}';
    }

}