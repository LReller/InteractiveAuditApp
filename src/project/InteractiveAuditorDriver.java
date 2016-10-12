package project;

@SuppressWarnings("serial")
public class InteractiveAuditorDriver  {
	
	Requestor request;
	TextParser parse;
	
	private String verifyUrl(String url) {
	
		
		
		return null;
	}
	
	
	public void setRequest(String url) {
		this.request = new Requestor(verifyUrl(url));
	}
	
	public void setParse(TextParser parse) {
		this.parse = parse;
	}
    
 public Requestor getRequest() {
		return request;
	}
	
	public TextParser getParse() {
		return parse;
	}
	
}
