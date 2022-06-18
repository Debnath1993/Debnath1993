package DockerPlay;

class Donald{
	static String team="CSK";
	public void playTeam(){
		System.out.println("Sample class with static variable");
	}
	public static void  polish() {
		int a=34;
		int b=45;
		int c=56;
		int cal=a*b*c;
		System.out.println("the calculated value is:"+cal);
		
		}
}
public class Doghouse {

	public static void main(String[] args){
		String city="Pune";
		int id=3100;

    System.out.println("Execution area");
    System.out.println(city); 
    System.out.println("the state identity number is:"+id);
    System.out.println(Donald.team);
    Donald dn=new Donald();
    dn.playTeam();
    Donald.polish();
    
	}

}
