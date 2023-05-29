package xmlxml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class radxml {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		Document document = builder.parse(new File("D:\\JAVA\\xml\\LOL.xml"));
		//lay node root
		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());
		//lay node theo ten
		NodeList paramList = document.getElementsByTagName("namsinh");
		for(int i = 0 ; i < paramList.getLength();i++ ) {
			Node param = paramList.item(i);
			System.out.println(param.getTextContent());
		};
		
	}
}
