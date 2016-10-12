package project;
import org.jsoup.nodes.Document;
//This class is set to run in a thread because of the computational power needed to 
//manipulate all the potential data.
public class TextParser extends Thread {
	
	Document doc;
	

	String url; 
	

	public TextParser(Document parsable) {
		// TODO Auto-generated constructor stub
		doc = parsable;
	
	}

	public void run(){
		
		System.out.println("entering text parse thread");
		System.out.println();
		
		System.out.println("exiting  text parse thread");
	}
	public Document getDoc() {
		return doc;
	}
	
}
