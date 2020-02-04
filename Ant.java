/**
 * Ant is a creature.
 */
public class Ant extends Creature {

    /**
     * Create an Ant with a name.
     * @param name -- the given name of this Ant
     */
    public Ant(String name) {
	super(name);
    }

    /**
     * When asked to move, an Ant prints '{name} {class} is crawling around.' (the single quotes are NOT part of the output.)
     */
    public void move() {
	System.out.print(this.toString() + " is crawling around.");
    }
    
}
