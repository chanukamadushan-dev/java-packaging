import behaves.Walking;
import behaves.Eating;

class Fish{
	public static void main(String args[]){
		//Animal animal = new Animal();
		//animal.category("physcase");
		
		Walking walk = new Walking();
		walk.foot(null);

		Eating eat = new Eating();
		eat.eatingType("small pices");
	}
}