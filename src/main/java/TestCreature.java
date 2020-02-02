public class TestCreature {

    public static final int CREATURE_COUNT = 1;
    public static final int THING_COUNT = 3;
    
    public static void main(String[] args) {
	Thing[] things = new Thing[THING_COUNT];

	Thing t0 = new Thing("machine");
	Thing t1 = new Thing("animal");
	Thing t2 = new Thing("human");

	things[0] = t0;
	things[1] = t1;
	things[2] = t2;
	for(Thing t: things) {
	    System.out.println(t);
	}
    } 
    
}
