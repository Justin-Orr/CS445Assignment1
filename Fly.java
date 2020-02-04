public class Fly extends Creature implements Flyer {

    public Fly(String name) {
	super(name);
    }

    @Override public void eat(Thing aThing) {
	lastMeal = aThing.toString();
	System.out.print(this.toString() + " won't eat a " + aThing + ".");
    }

    public void move() {
	fly();
    }

    public void fly() {

	System.out.print(this.toString() + " is buzzing around in flight.");
	
    }
    
}
