/**
 * Bat is a creature that knows how to fly.
 */
public class Bat extends Creature implements Flyer {

    /**
     * Create a Bat with a name.
     * @param name - -- the given name of this Bat
     */
    public Bat(String name) {
	super(name);
    }

    /**
     * A Bat eats only Creatures in the same way that any Creature eats.
     * However, Bats will not eat simple things. If a bat eats something 
     * that is NOT an instance of Creature (i.e. a bat eats an instance 
     * of Thing), then it reports '{name} {class} won't eat a {aThing}.'
     * (the single quotes are not part of the message, {name} {class} is 
     * the bat's string representation, and aThing is the string 
     * representation of aThing.) Finally, if aThing is an instance neither 
     * of Creature nor Thing. the bat is lent and does not eat the instance.
     * @param aThing - -- what this is told to eat
     */
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

    /**
     * When asked to move, a Bat flies. That is, the instance calls its own fly() method.
     */
    public void move() {
	fly();
    }

    /**
     * When asked to fly, a Bat prints the message '{name} {class} is swooping through the dark.' 
     * (the single quotes are not part of the message.)
     */
    public void fly() {
	System.out.print(this.toString() + " is swooping through the dark.");
    }
    
}
