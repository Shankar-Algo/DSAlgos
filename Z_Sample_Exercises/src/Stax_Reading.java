import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;


public class Stax_Reading 
{

	
	public void methods_list() throws FileNotFoundException, XMLStreamException
	{
		XMLInputFactory xif = XMLInputFactory.newInstance();
		FileInputStream fis = new FileInputStream("Test.xml");
		XMLEventReader xer = xif.createXMLEventReader(fis);
		int i=0;
		
	
		while(xer.hasNext()  )
		{
			/*System.out.println(xer.getElementText());
			System.out.println(xer.nextEvent());
			System.out.println(xer.nextTag());*/
			
			
			XMLEvent xe = xer.nextEvent();
		
			
			System.out.println(++i + "   " + xe.getEventType());
			if(xe.getEventType()==4)
				System.out.println(xe.asCharacters());
			/*if(!xe.isEndDocument())
			System.out.println("Next tag:"+"  "+xer.nextTag());
			System.out.println(xe.getLocation());
			System.out.println(xe.getSchemaType());
			if(xe.isCharacters())
			System.out.println("IScHARACTERS");
			System.out.println(xe.isEndElement());
			
			
			System.out.println("final " +xe.END_DOCUMENT);*/
			
			//System.out.println(xe.);
			
		
			
		}
		
		
	}
	
	public static void main(String args[]) throws FileNotFoundException, XMLStreamException
	{
		Stax_Reading sr = new Stax_Reading();
		sr.methods_list();
	}
	
}
