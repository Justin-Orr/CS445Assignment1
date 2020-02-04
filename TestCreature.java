public class TestCreature {

    public static final int CREATURE_COUNT = 4;
    public static final int THING_COUNT = 4;
    
    public static void main(String[] args) {
	Thing[] things = new Thing[THING_COUNT];

	Thing t0 = new Thing("machine");
	Thing t1 = new Thing("animal");
	Tiger t2 = new Tiger("Tony");
	Tiger t3 = new Tiger("Felix");
	
	things[0] = t0;
	things[1] = t1;
	things[2] = t2;
	things[3] = t3;

	System.out.println("Things:\n");
	
	for(Thing t: things) {
	    System.out.println(t);
	}

	Creature[] creatures = new Creature[CREATURE_COUNT];

        Bat b0 = new Bat("Batman");
        Ant a0 = new Ant("Fire");
        Fly f0 = new Fly("Horse");

        creatures[0] = t2;
        creatures[1] = b0;
        creatures[2] = a0;
        creatures[3] = f0;

	System.out.println("\nCreatures:\n");

	for(Creature c: creatures) {
	    System.out.println(c);
	}
    } 
    
}
