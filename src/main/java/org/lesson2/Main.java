package org.lesson2;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Candy> candies = new ArrayList<>();
        Candy candy = null;
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLEventReader reader = factory.createXMLEventReader(new FileInputStream(
                    new File("src/main/java/org/lesson2/candies.xml")
            ));
            while (reader.hasNext()){
                XMLEvent nextEvent = reader.nextEvent();
                if (nextEvent.isStartElement()){
                    StartElement startElement = nextEvent.asStartElement();
                    String localPart = startElement.getName().getLocalPart();
                    if (localPart.equals("candie")) {
                        candy = new Candy();
                        candy.setName(startElement.getAttributeByName(new QName("name")).getValue());
                    } else if (localPart.equals("swetnes")) {
                        nextEvent = reader.nextEvent();
                        candy.setSwetnes(nextEvent.asCharacters().getData());
                    } else if (localPart.equals("type")) {
                        nextEvent = reader.nextEvent();
                        candy.setType(nextEvent.asCharacters().getData());
                    } else if (localPart.equals("taste")) {
                        nextEvent = reader.nextEvent();
                        candy.setTeste(nextEvent.asCharacters().getData());
                    }
                }
                if (nextEvent.isEndElement()){
                    EndElement endElement = nextEvent.asEndElement();
                    if (endElement.getName().getLocalPart().equalsIgnoreCase("candie")){
                        candies.add(candy);
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        for (Candy c :candies) {
            System.out.println(c);
        }

    }
}
