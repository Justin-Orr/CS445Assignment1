public abstract class Creature extends Thing{

    protected String lastMeal;
    
    public Creature(String name){
	super(name);
    }
    
    public void eat(Thing aThing) {
	lastMeal = aThing.toString();
	System.out.println(this.toString() + " has just eaten " + aThing);
    }

    public abstract void move();

    public void whatDidYouEat() {
	if(lastMeal == null) {
	    System.out.println(this.toString() + " has had nothing to eat!");
	}
	else {
	    System.out.println(this.toString() + " has eaten a " + lastMeal + "!");
	}
    }
    
}
