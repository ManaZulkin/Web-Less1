package org.lesson3;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.FileInputStream;

public class XpathParsing {
    public static void main(String[] args) {
        File xml = new File("src/main/java/org/PeriodicPublish.xml");
        try {
            FileInputStream xmlStream = new FileInputStream(xml);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(xmlStream);
            XPath xPath = XPathFactory.newInstance().newXPath();
            String st = "/paper/*/text()";
            NodeList nodeList = (NodeList) xPath.compile(st).evaluate(document, XPathConstants.NODESET);
            int i = 0;
            Node n = nodeList.item(i);
            while (n != null) {
                n = nodeList.item(i);
                if(n.getParentNode().getNodeName().equalsIgnoreCase("chars")){
                    break;
                }else {
                System.out.println(n.getParentNode().getNodeName()+ " " + n.getNodeValue());}
                i++;
            }

            st = "/paper/chars/*/text()";
            nodeList = (NodeList) xPath.compile(st).evaluate(document, XPathConstants.NODESET);
            i = 0;
            do {
                n = nodeList.item(i);
                System.out.println(n.getParentNode().getNodeName()+ " " + n.getNodeValue());
                i++;
            }while (nodeList.item(i) != null );


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
