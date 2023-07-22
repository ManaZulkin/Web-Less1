package org.entety;

import org.entety.Sax.MyHendler;
import org.entety.Sax.Paper;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import javax.xml.parsers.*;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        File f = new File("src\\main\\java\\org\\PeriodicPublish.xml");
        String st;
        try(BufferedReader br = new BufferedReader(new FileReader(f))){
            while ((st = br.readLine()) != null){
                System.out.println(st);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("It was file basic form");

        System.out.println("---------------------------------------------------------" +
                "Sax parser version\n");
        saxParsering(f);

        System.out.println("---------------------------------------------------------" +
                "\nDOM parser version\n");
        domParsering(f);

        System.out.println("---------------------------------------------------------" +
                "\nStAX parser version\n");
        staxParsering(f);

        XSLTransform();
    }

    public static void saxParsering(File file)  {
        try {
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();
            MyHendler myHendler = new MyHendler();

            saxParser.parse(file, myHendler);
            Paper paper = myHendler.getPaper();
            System.out.println(paper.singlePapers.get(0));
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void domParsering(File f){
        try {
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
            Document doc = documentBuilder.parse(f);
            doc.getDocumentElement().normalize();
            System.out.println("Root node name - " + doc.getDocumentElement().getNodeName());
            System.out.println("Title: " + doc.getElementsByTagName("title").item(0).getTextContent());
            System.out.println("Monthly: " + doc.getElementsByTagName("monthly").item(0).getTextContent());
            System.out.println("Type: " + doc.getElementsByTagName("type").item(0).getTextContent());
            System.out.println("Color: " + doc.getElementsByTagName("color").item(0).getTextContent());
            System.out.println("Gloss: " + doc.getElementsByTagName("gloss").item(0).getTextContent());
            System.out.println("Pages: " + doc.getElementsByTagName("pages").item(0).getTextContent());
            System.out.println("Index: " + doc.getElementsByTagName("index").item(0).getTextContent());

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void staxParsering(File f){
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(f));
            Paper paper = new Paper();
            paper.singlePapers = new ArrayList<>();
            SinglePaper singlePaper = null;
            while (xmlEventReader.hasNext()){
                XMLEvent nextEvent = xmlEventReader.nextEvent();
                if (nextEvent.isStartElement()){
                    StartElement startElement = nextEvent.asStartElement();
                    switch (startElement.getName().getLocalPart()){
                        case "title":
                            nextEvent = xmlEventReader.nextEvent();
                            singlePaper = new SinglePaper();
                            singlePaper.setTitle(nextEvent.asCharacters().getData());
                            break;
                        case "monthly":
                            nextEvent = xmlEventReader.nextEvent();
                            singlePaper.setMonthly(nextEvent.asCharacters().getData());
                            break;
                        case "type":
                            nextEvent = xmlEventReader.nextEvent();
                            singlePaper.setTipe(nextEvent.asCharacters().getData());
                            break;
                        case "pages":
                            nextEvent = xmlEventReader.nextEvent();
                            singlePaper.setPages(Integer.parseInt(nextEvent.asCharacters().getData()));
                            break;
                        case "gloss":
                            nextEvent = xmlEventReader.nextEvent();
                            singlePaper.setGloss(nextEvent.asCharacters().getData());
                            break;
                        case "color":
                            nextEvent = xmlEventReader.nextEvent();
                            singlePaper.setColor(nextEvent.asCharacters().getData());
                            break;
                        case "index":
                            nextEvent = xmlEventReader.nextEvent();
                            singlePaper.setIndex(nextEvent.asCharacters().getData());
                            break;

                    }
                }
                if (nextEvent.isEndElement()){
                    EndElement endElement = nextEvent.asEndElement();
                    if(endElement.getName().getLocalPart().equalsIgnoreCase("paper")){
                        paper.singlePapers.add(singlePaper);
                    }
                }
            }
            System.out.println(paper.singlePapers.get(0));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void XSLTransform(){
        final String xml = "src\\main\\java\\org\\PeriodicPublish.xml";
        final String xsl = "src\\main\\java\\org\\XSLTransform.xml";
        final String text = "src\\main\\java\\org\\PeriodicPublish.txt";

        try{
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer(new StreamSource(xsl));
            transformer.transform(new StreamSource(xml), new StreamResult(new FileOutputStream(text)));

            System.out.println("Text file:\n" + text);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
