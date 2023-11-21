package Collection.custom;

public class MainCollection {

	public static void main(String[] args) {
	
		CollectionCustom<Integer> customCollection = new CollectionCustom<>();
		
		//size
		System.out.println("Size: " + customCollection.getSize());
		
		customCollection.add(1);
		customCollection.add(2);
		customCollection.add(3);
		customCollection.add(2);
		customCollection.add(2);
		customCollection.add(2);
		
		
		System.out.println(customCollection.toString());
		
		customCollection.addFirst(0);
        customCollection.addLast(4);
        customCollection.add(5);
        
        System.out.println(customCollection.toString());
        System.out.println("Size: " + customCollection.getSize());
        
        customCollection.remove(3);
        System.out.println("Size: " + customCollection.getSize());
        
        customCollection.removeAll(2);
        System.out.println("Size after removing all 2: " + customCollection.getSize());
	}

}
