package br.com.thnocard.dio_bootcamp;

public class CursosDIO {

    private String titleBootcamp;
    private String descriptBootcamp;
    private int timeTableBootcamp;

    public CursosDIO() { // Construtor sem argumentos / vazio
    }

    public String getTitleBootcamp() {
        return titleBootcamp;
    }

    public void setTitleBootcamp(String titleBootcamp) {
        this.titleBootcamp = titleBootcamp;
    }

    public String getDescriptBootcamp() {
        return descriptBootcamp;
    }

    public void setDescriptBootcamp(String descriptBootcamp) {
        this.descriptBootcamp = descriptBootcamp;
    }

    public int getTimeTableBootcamp() {
        return timeTableBootcamp;
    }

    public void setTimeTableBootcamp(int timeTableBootcamp) {
        this.timeTableBootcamp = timeTableBootcamp;
    }

    @Override
    public String toString() {
        return "CursosDIO{" +
                "titleBootcamp='" + titleBootcamp + '\'' +
                ", descriptBootcamp='" + descriptBootcamp + '\'' +
                ", timeTableBootcamp=" + timeTableBootcamp +
                '}';
    }
}