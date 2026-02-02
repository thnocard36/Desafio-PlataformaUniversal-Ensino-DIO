package br.com.thnocard.dio_bootcamp;

public class CursosDIO extends Contents {

    private int timeTableBootcamp;

    public CursosDIO() { // Construtor sem argumentos / vazio
    }

    @Override
    public double calculoXP() {
        return 0;
    }

    public int getTimeTableBootcamp() {
        return timeTableBootcamp;
    }

    public void setTimeTableBootcamp(int timeTableBootcamp) {
        this.timeTableBootcamp = timeTableBootcamp;
    }

    @Override
    public String toString() {
        return "Cursos DIO { " +
                " titleBootcamp=' " + getTitleContent() + '\'' +
                ", descriptBootcamp=' " + getDescriptContent() + '\'' +
                ", timeTableBootcamp= " + timeTableBootcamp +
                '}';
    }


}