package DockerPlay;

class Spotify{
	int i=23;
	int j=26;
	int k=45;
	int m=34;
	int sum;
	int mul;
	public void printer() {
		System.out.println("Hello printer!!");
		}
	
}
class JioSaavn extends Spotify{
	public void printer() {
		int sum=i+j+k+m;
		int mul=i*j*k*m;
		System.out.println("sum is:"+sum);
		System.out.println("product is:"+mul);
		}
}
public class AmbitionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JioSaavn jio=new JioSaavn();
jio.printer();
	}

}
