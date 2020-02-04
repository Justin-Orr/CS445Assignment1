public class Tiger extends Creature{

    public Tiger(String name) {
	super(name);
    }

    public void move() {
	System.out.print(this.toString()  + " has just pounced.");
    }
    
}
