package MyAgartalaPack;

public class IndianOcean {
	String location;
	int experience;
	String domain;
	
	IndianOcean(String location,int experience,String domain){
		this.location=location;
		this.experience=experience;
		this.domain=domain;
		}
	public void details() {
		System.out.println("the city & experience is:"+location+" & "+experience+" years");
		System.out.println("the domain of expertise is:"+domain);
		
	}

}
