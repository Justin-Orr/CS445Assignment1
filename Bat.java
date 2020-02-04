public class Bat extends Creature implements Flyer {

    public Bat(String name) {
	super(name);
    }

    @Override
    public void eat(Thing aThing) {
	String classname = aThing.getClass().getSimpleName();
	if(aThing instanceof Creature) {
	    lastMeal = aThing.toString();
	    System.out.print(this.toString() + " has just eaten " + aThing);
	}
	else if(classname.equals("Thing")){
	    System.out.print(this.toString() + " won't eat a " + aThing + ".");
	}
    }

    public void move() {
	fly();
    }

    public void fly() {
	System.out.print(this.toString() + " is swooping through the dark.");
    }
    
}