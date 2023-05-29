package xmlxml;
 
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import xmlxml.sad;
import java.io.*;
import java.nio.file.Path;
 
public class cr {
	
	public boolean check(String xmlfile) {
		
		File input = new File("alluser");
		if (input.exists()) {
			System.out.println("LOL");
			return true;
		}
		else {
			return false ;
		}
	}
	public void xoa() {
		try {
			File input = new File("alluser");
			DocumentBuilderFactory dbfac = DocumentBuilderFactory.newInstance();
			DocumentBuilder dbuilder = dbfac.newDocumentBuilder();
			Document doc = dbuilder.parse(input);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void change(String id,String name,int age ) {
		try {
			File input = new File("alluser");
			int idx = Integer.parseInt(id);
			DocumentBuilderFactory dbfac = DocumentBuilderFactory.newInstance();
			DocumentBuilder dbuilder = dbfac.newDocumentBuilder();
			Document doc = dbuilder.parse(input);
			Node root = doc.getFirstChild();
			Node new_name = doc.getElementsByTagName("name").item(idx - 1);
			Element enew_name = (Element)new_name;
			enew_name.setTextContent(name);
			
			Node new_age = doc.getElementsByTagName("age").item(idx - 1);
			Element enew_age = (Element)new_age;
			enew_age.setTextContent(Integer.toString(age));
			TransformerFactory transfac = TransformerFactory.newInstance();
	    	Transformer trans = transfac.newTransformer();
	    	DOMSource source = new DOMSource(doc);
	    	StreamResult result = new StreamResult(input);
	    	trans.transform(source, result);
	    	StreamResult consoleResult = new StreamResult(System.out);
	    	trans.transform(source, consoleResult);
		} catch (Exception e) {
			// TODO: handle exception
		}
			
	}
	public void add(String Name,int Age) {
		try {
			File input = new File("alluser");
			DocumentBuilderFactory dbfac = DocumentBuilderFactory.newInstance();
			DocumentBuilder dbuilder = dbfac.newDocumentBuilder();
			Document doc = dbuilder.parse(input);
			Node root = doc.getDocumentElement();
			
			
			Element id = doc.createElement("id");
			String userid = Integer.toString(11);
			
	    	root.appendChild(id);
	    	
	    	Attr attr = doc.createAttribute("id");
	    	attr.setValue(userid);
	    	id.setAttributeNode(attr);

	    	Element name = doc.createElement("name");
	    	name.appendChild(doc.createTextNode(Name));
	    	id.appendChild(name);
	    	
	    	Element age = doc.createElement("age");
	    	age.appendChild(doc.createTextNode(Integer.toString(Age)));
	    	id.appendChild(age);
	    	
	    	TransformerFactory transfac = TransformerFactory.newInstance();
	    	Transformer trans = transfac.newTransformer();
	    	DOMSource source = new DOMSource(doc);
	    	StreamResult result = new StreamResult(input);
	    	trans.transform(source, result);
	    	StreamResult consoleResult = new StreamResult(System.out);
	    	trans.transform(source, consoleResult);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
    public void create(String userid,String Username,String Password,String Name,int Age) {
    	try {
			
		
    	
    	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder builder = factory.newDocumentBuilder();
    	Document doc = builder.newDocument();
    	
    	Element root = doc.createElement("user");
    	doc.appendChild(root);
    	Attr totaluser = doc.createAttribute("totaluser");
    	totaluser.setValue("1");
    	root.setAttributeNode(totaluser);
    	
    	Element id = doc.createElement("id");
    	root.appendChild(id);
    	
    	Attr attr = doc.createAttribute("id");
    	attr.setValue(userid);
    	id.setAttributeNode(attr);
    	
    	Element username = doc.createElement("username");
    	username.appendChild(doc.createTextNode(Username));
    	id.appendChild(username);
    	
    	Element password = doc.createElement("password");
    	password.appendChild(doc.createTextNode(Password));
    	id.appendChild(password);
    	
    	Element name = doc.createElement("name");
    	name.appendChild(doc.createTextNode(Name));
    	id.appendChild(name);
    	
    	Element age = doc.createElement("age");
    	age.appendChild(doc.createTextNode(Integer.toString(Age)));
    	id.appendChild(age);
    	
    	TransformerFactory transfac = TransformerFactory.newInstance();
    	Transformer trans = transfac.newTransformer();
    	DOMSource source = new DOMSource(doc);
    	StreamResult result = new StreamResult(new File(userid));
    	trans.transform(source, result);
    	StreamResult consoleResult = new StreamResult(System.out);
    	trans.transform(source, consoleResult);
    	
    	} catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
		}
    	
    }
    public xml_MODEL read(String filee) {
    	xml_MODEL model = new xml_MODEL();
    	try {
			File input = new File(filee);
			
			DocumentBuilderFactory dbfac = DocumentBuilderFactory.newInstance();
			DocumentBuilder dbuilder = dbfac.newDocumentBuilder();
			Document doc = dbuilder.parse(input);
			
			doc.getDocumentElement().normalize();
			System.out.println("\nRoot element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("id");
			System.out.println("----------------------------");
			Node node = nList.item(0);
			System.out.println("\nCurrent element :" + node.getNodeName() );
			if(node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				System.out.println("id : " + element.getAttribute("id"));
				System.out.println("\nusername : "+element.getElementsByTagName("username").item(0).getTextContent());
				System.out.println("\npassword : "+element.getElementsByTagName("password").item(0).getTextContent());
				System.out.println("\nname : "+element.getElementsByTagName("name").item(0).getTextContent());
				System.out.println("\nage : "+element.getElementsByTagName("age").item(0).getTextContent());
				
				model.id = element.getAttribute("id");
				model.username = element.getElementsByTagName("username").item(0).getTextContent();
				model.pass = element.getElementsByTagName("password").item(0).getTextContent();
				model.name = element.getElementsByTagName("name").item(0).getTextContent();
				model.age =  Integer.parseInt(element.getElementsByTagName("age").item(0).getTextContent()) ;
			}
			
			TransformerFactory transfac = TransformerFactory.newInstance();
	    	Transformer trans = transfac.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult consoleResult = new StreamResult(System.out);
			trans.transform(source, consoleResult);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return model;
	}
    
    public void writenode (String filee) {
    	
    }

	
}