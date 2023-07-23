package org.lesson3;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class JaxbParsing {
    public static void main(String[] args) {
        File file = new File("src/main/java/org/PeriodicPublish.xml");
        jakarta.xml.bind.JAXBContext jaxbContext;
        try{
            jaxbContext = JAXBContext.newInstance(SinglePaperJaxb.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            SinglePaperJaxb singlePaper = (SinglePaperJaxb) unmarshaller.unmarshal(file);


            System.out.println(singlePaper);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
