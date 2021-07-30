
public class Email {
	String to;
	String from;
	String body;
	String greetings;
		
public Email(String to, String from, String body, String greetings) {
		
		this.to = to;
		this.from = from;
		this.body = body;
		this.greetings = greetings;
	}

public String getTo() {
	return to;
}

public void setTo(String to) {
	this.to = to;
}

public String getFrom() {
	return from;
}

public void setFrom(String from) {
	this.from = from;
}

public String getBody() {
	return body;
}

public void setBody(String body) {
	this.body = body;
}

public String getGreetings() {
	return greetings;
}

public void setGreetings(String greetings) {
	this.greetings = greetings;
}	
		
	
} 
class Header extends Email{
public Header(String to, String from, String body, String greetings) {
		super(to, from, body, greetings);
		// TODO Auto-generated constructor stub
	}
// Implement the Header Class according to the specifiaction.
	

	
	

}


class EmailOperations{
// Implement the Three methods specified in the specified.	
	public Integer emailVerify(Email e) {
	
		return null;
	
	}

}



