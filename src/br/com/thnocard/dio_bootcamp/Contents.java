package br.com.thnocard.dio_bootcamp;

public abstract class Contents {

    protected static final double PontosXP_Padrao = 10d;

    private String titleContent;
    private String descriptContent;

    public abstract double calculoXP();

    public String getTitleContent() {
        return titleContent;
    }

    public void setTitleContent(String titleContent) {
        this.titleContent = titleContent;
    }

    public String getDescriptContent() {
        return descriptContent;
    }

    public void setDescriptContent(String descriptContent) {
        this.descriptContent = descriptContent;
    }
}