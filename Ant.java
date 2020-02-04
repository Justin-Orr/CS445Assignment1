public class Ant extends Creature {

    public Ant(String name) {
	super(name);
    }

    public void move() {
	System.out.print(this.toString() + " is crawling around.");
    }
    
}
