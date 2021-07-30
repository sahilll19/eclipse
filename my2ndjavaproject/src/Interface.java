abstract class Item{
	private int id;
	private String title;
	private double numberofcopies;
	Item(){
		id=1001;
		title= "My name is adam";
		numberofcopies= 100;
	}
	void getid() {
		System.out.println(this.id);
		
	}
	void gettitle() {
		System.out.println(this.title);
		
	}
	void getnumberofcopies() {
		System.out.println(this.numberofcopies);
		
	}
}


abstract class WrittenItem extends Item {
  
	String name;
	WrittenItem(){
		name= "Adam";
		
	}
	void getname() {
		System.out.println(this.name);
	}
	
	
	
	@Override
	void getid() {
		// TODO Auto-generated method stub
		super.getid();
		
	}

	@Override
	void gettitle() {
		// TODO Auto-generated method stub
		super.gettitle();
		
	}

	@Override
	void getnumberofcopies() {
		// TODO Auto-generated method stub
		super.getnumberofcopies();
		
	}

		

	
	
}
class Book extends WrittenItem {

	@Override
	void getname() {
		// TODO Auto-generated method stub
		super.getname();
	}

	@Override
	void getid() {
		// TODO Auto-generated method stub
		super.getid();
	}

	@Override
	void gettitle() {
		// TODO Auto-generated method stub
		super.gettitle();
	}

	@Override
	void getnumberofcopies() {
		// TODO Auto-generated method stub
		super.getnumberofcopies();
	}
	
	
}
class Journalpaper extends WrittenItem {
	private String yearpublished;
	Journalpaper(){
		yearpublished= "2005";
	}
	
	void getyearpub() {
		System.out.println(this.yearpublished);
	}

	@Override
	void getname() {
		// TODO Auto-generated method stub
		super.getname();
	}
	
}
class Mediaitem extends Item {
	int runtime;
	Mediaitem(){
		runtime= 102;
	}
	void getruntime() {
		System.out.println(this.runtime);
		
	}
	@Override
	void getid() {
		// TODO Auto-generated method stub
		super.getid();
	}
	@Override
	void gettitle() {
		// TODO Auto-generated method stub
		super.gettitle();
	}
	@Override
	void getnumberofcopies() {
		// TODO Auto-generated method stub
		super.getnumberofcopies();
	}
	 
}

class Video extends Mediaitem {
	String director;
	String genre;
	int yearreleased;
	
	Video(){
		this.director= "Quentin Tarantino";
		this.genre= "Crime";
		this.yearreleased= 2005;
	}
	@Override
	public String toString() {
		return "Video [director=" + this.director + ", genre=" + this.genre + ", yearreleased=" + this.yearreleased + "]";
	}
	@Override
	void getruntime() {
		// TODO Auto-generated method stub
		super.getruntime();
	}
	@Override
	void getid() {
		// TODO Auto-generated method stub
		super.getid();
	}
	@Override
	void gettitle() {
		// TODO Auto-generated method stub
		super.gettitle();
	}
	@Override
	void getnumberofcopies() {
		// TODO Auto-generated method stub
		super.getnumberofcopies();
	}
	
}

class CD extends Mediaitem {
	String artist;
	
	void getartist() {
		artist= "John";
	}
	

	@Override
	public String toString() {
		return "CD [artist=" + artist + "]";
	}


	@Override
	void getruntime() {
		// TODO Auto-generated method stub
		super.getruntime();
	}


	@Override
	void getid() {
		// TODO Auto-generated method stub
		super.getid();
	}


	@Override
	void gettitle() {
		// TODO Auto-generated method stub
		super.gettitle();
	}


	@Override
	void getnumberofcopies() {
		// TODO Auto-generated method stub
		super.getnumberofcopies();
	}

	
}

public class Interface {


		public static void main(String[] args) {
			
			
		Mediaitem m= new Mediaitem();
		m.getruntime();
		m.getnumberofcopies();
		}

		
		
		}
