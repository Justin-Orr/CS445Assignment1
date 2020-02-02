public class Thing {

    private String name;

    public Thing(String name) {
	this.name = name;
    }

    @Override
    public String toString() {
	String classname = getClass().getSimpleName();
	if(this.getClass() == Thing.class)
	    return name;
	else
	    return name + " " + classname;
    }
    
}
