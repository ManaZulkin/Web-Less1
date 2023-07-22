package org.entety.Sax;

import org.entety.SinglePaper;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class MyHendler extends DefaultHandler {
    private final String PAPER = "paper";
    private final String TITLE = "title";
    private final String MONTHLY = "monthly";
    private final String TIPE = "type";
    private final String COLOR = "color";
    private final String GLOSS = "gloss";
    private final String INDEX = "index";
    private final String PAGES = "pages";

    private StringBuilder stringBuilder;
    private Paper paper;

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (stringBuilder == null){
            stringBuilder = new StringBuilder();
        }else {
            stringBuilder.append(ch, start, length);
        }
    }

    @Override
    public void startDocument() throws SAXException {
        paper = new Paper();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
       switch (qName){
           case PAPER :
               paper.singlePapers = new ArrayList<>();
               paper.singlePapers.add(new SinglePaper());
               break;
           case TITLE :
               stringBuilder = new StringBuilder();
               break;
           case MONTHLY :
                stringBuilder = new StringBuilder();
                break;
           case TIPE:
               stringBuilder = new StringBuilder();
               break;
           case COLOR:
               stringBuilder = new StringBuilder();
               break;
           case GLOSS:
               stringBuilder = new StringBuilder();
               break;
           case INDEX:
               stringBuilder = new StringBuilder();
               break;
           case PAGES:
               stringBuilder = new StringBuilder();
               break;
       }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName){
            case TITLE :
                latestPaper().setTitle(stringBuilder.toString());
                break;
            case MONTHLY :
                latestPaper().setMonthly(stringBuilder.toString());
                break;
            case TIPE:
                latestPaper().setTipe(stringBuilder.toString());
                break;
            case COLOR:
                latestPaper().setColor(stringBuilder.toString());
                break;
            case GLOSS:
                latestPaper().setGloss(stringBuilder.toString());
                break;
            case INDEX:
                latestPaper().setIndex(stringBuilder.toString());
                break;
            case PAGES:
                latestPaper().setPages(Integer.parseInt(stringBuilder.toString()));
                break;
        }
    }
    private SinglePaper latestPaper(){
        List<SinglePaper> papers = paper.getSinglePapers();
        int latestPaperIndex = papers.size() - 1;
        return papers.get(latestPaperIndex);
    }

    public Paper getPaper(){
        return paper;
    }
}
