
public class Smurfrunner {
public static void main(String[] args) {
	Smurf handy = new Smurf("handy");
	System.out.println(handy.getName());
	handy.eat();
	Smurf papa = new Smurf("Papa");
	System.out.println(papa.getHatColor());
	System.out.println(papa.isGirlOrBoy());
	Smurf Smurfette = new Smurf("Smurfette");
	System.out.println(Smurfette.getHatColor());
	System.out.println(Smurfette.isGirlOrBoy());
	
}
}
