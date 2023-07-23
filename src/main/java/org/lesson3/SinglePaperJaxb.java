package org.lesson3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

@XmlRootElement(name = "paper")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class SinglePaperJaxb {

    String title;
    String monthly;
    String tipe;
    Chars chars = new Chars();

    public Chars getChars() {
        return chars;
    }

    public void setChars(Chars chars) {
        this.chars = chars;
    }

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


    @Override
    public String toString() {
        return "title: " + getTitle() + "\nmonthly: " + getMonthly() +
                "\ntipe: " + getTipe() + chars.toString();
    }

    @XmlRootElement(name = "chars")
    public static class Chars implements Serializable {

        String color, gloss, index;
        int pages = 25;

        @Override
        public String toString() {
            return "\ncolor: " + getColor() +
                    "\ngloss: " + getGloss() + "\nindex: " + getIndex() +
                    "\npages: " + getPages();
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

        public String getIndex() {
            return index;
        }

        public void setIndex(String index) {
            this.index = index;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }
    }
}
