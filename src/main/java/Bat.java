public class Bat extends Creature implements Flyer {

    public Bat(String name) {
	super(name);
    }

    @Override public void eat(Thing aThing) {
	String classname = aThing.getClass().getSimpleName();
	if(classname.equals("Creature")) {
	    lastMeal = aThing.toString();
	    System.out.println(this.toString() + " has just eaten " + aThing);
	}
	else if(classname.equals("Thing")){
	    System.out.println(this.toString() + " won't eat a " + aThing + ".");
	}
    }

    public void move() {
	fly();
    }

    public void fly() {
	System.out.println(this.toString() + " is swooping through the dark.");
    }
    
}
