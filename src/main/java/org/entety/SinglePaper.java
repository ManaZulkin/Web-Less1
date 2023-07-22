package org.entety;

import java.util.Enumeration;

public class SinglePaper {
    String title, monthly, tipe, color, gloss, index;
    int pages = 25;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMonthly() {
        return monthly;
    }

    public void setMonthly(String monthly) {
        this.monthly = monthly;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGloss() {
        return gloss;
    }

    public void setGloss(String gloss) {
        this.gloss = gloss;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "title: " + getTitle() + "\nmonthly: " + getMonthly() +
                "\ntipe: " + getTipe() +  "\ncolor: " + getColor() +
                "\ngloss: "+ getGloss() + "\nindex: " + getIndex() +
                "\npages: " + getPages();
    }
}
