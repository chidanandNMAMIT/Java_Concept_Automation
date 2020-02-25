package aggregation;
//java oprations cab be performed on methods,constructors and initializtion blocks
//Instant initializtion blocks are used for initializing instant varibales
//Instant initializtion blocks are executed before constuctors
//Instance Initialization Blocks are executed each time object is created


public class InstanceInitializationBlock {

	{
		System.out.println("initializer block-1");
	}

	InstanceInitializationBlock() {
		System.out.println("constructor Block");
	}

	{
		System.out.println("initializer block-2");
	}

	public static void main(String[] args) {
		InstanceInitializationBlock obj = new InstanceInitializationBlock();
		InstanceInitializationBlock obj1 = new InstanceInitializationBlock();
	}

}
