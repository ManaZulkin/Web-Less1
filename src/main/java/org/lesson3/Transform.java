package org.lesson3;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.FileOutputStream;

public class Transform {
    private static final String HTML = "src/main/java/org/XSLTransformHTML.xml";
    private static final String HTML_RESULT = "src/main/java/org/XSLTransformHTML.html";
    private static final String SORCE = "src/main/java/org/PeriodicPublish.xml";
    public static void main(String[] args) {
        try{
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer(new StreamSource(HTML));
            transformer.transform(new StreamSource(SORCE), new StreamResult(new FileOutputStream(HTML_RESULT)));

            System.out.println("Text file:\n" + HTML);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
