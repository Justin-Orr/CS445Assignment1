/**
 * A Creature is a Thing that has specific, 'lively' behaviors.
 */
public abstract class Creature extends Thing{

    protected String lastMeal;

    /**
     * Create a Creature with a name.
     * @param name - -- the given name of this Creature
     */
    public Creature(String name){
	super(name);
    }

    /**
     * Creatures may be asked to eat various Things. By default, 
     * creatures eat whatever they are told AND print a message 
     * stating '{this object} has just eaten a {a Thing}.' substituting 
     * the concrete details for the part enclosed inside of {}. 
     * (the single quotes are not part of the message.) 
     * A creature only remembers the last thing it ate.
     * @param aThing - -- what this is told to eat
     */
    public void eat(Thing aThing) {
	lastMeal = aThing.toString();
	System.out.print(this.toString() + " has just eaten a " + aThing);
    }

    /**
     * Tell the Creature to move. Each creature will print a message stating the way it most commonly moves.
     */
    public abstract void move();

    /**
     * Make the Creature tell what is in its stomach. If there is nothing in its stomach, 
     * whatDidYouEat() prints '{name} {class} has had nothing to eat!' If it has something 
     * in its stomach, whatDidYouEat() prints '{creature name} {class name} has eaten a {content of stomach}!'
     * NOTE: The pattern {word} in the text above indicates what attribute value belongs in the output text.
     */
    public void whatDidYouEat() {
	if(lastMeal == null) {
	    System.out.print(this.toString() + " has had nothing to eat!");
	}
	else {
	    System.out.print(this.toString() + " has eaten a " + lastMeal + "!");
	}
    }
    
}
