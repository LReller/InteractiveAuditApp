package project;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Requestor {
	private String url ; //
	private Document doc ;
	
	public  Requestor(String url) {		
		this.url  = url;
		try {
			this.doc = Jsoup.connect(this.url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		System.out.println(doc);
	}//constructor
	
	public Document getDoc(){
		return doc;
		
		
		
	}
	
	
}
