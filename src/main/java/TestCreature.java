public class TestCreature {

    public static final int CREATURE_COUNT = 3;
    public static final int THING_COUNT = 6;
    
    public static void main(String[] args) {
	Thing[] things = new Thing[THING_COUNT];

	Thing t0 = new Thing("machine");
	Thing t1 = new Thing("animal");
	Thing t2 = new Thing("human");
	Tiger t3 = new Tiger("Tony");
	Tiger t4 = new Tiger("Felix");
	Tiger t5 = new Tiger("Leo");
	
	things[0] = t0;
	things[1] = t1;
	things[2] = t2;
	things[3] = t3;
	things[4] = t4;
	things[5] = t5;
	
	for(Thing t: things) {
	    System.out.println(t);
	}
    } 
    
}
