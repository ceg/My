public class Box {

    private Object object;

    //Obly Integer Objects in this Box
    public void add(Object object){
	this.object = object;
    }

    public Object get(){
	return this.object;
    }
}

