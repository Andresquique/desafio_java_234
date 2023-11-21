package Collection.custom;

import java.util.Arrays;

public class CollectionCustom<T> {

	 private static final int startSize = 10;
	    private Object[] elementos;
	    private int size;

	    public CollectionCustom() {
	        this.elementos = new Object[startSize];
	        this.size = 0;
	}
	
	// size
	public int getSize() {
		return size;
	}
	//add first
	public void addFirst(T element) {
        Capacity.ensureCapacity(elementos,size);
        shiftRight.ShiftRight(elementos,size);
        elementos[0] = element;
        size++;
    }
	//add last
    public void addLast(T element) {
    	Capacity.ensureCapacity(elementos,size);
        elementos[size] = element;
        size++;
    }
	//add
	public void add(T element) {      
        elementos[size] = element;
        size++;   
    }
	public T remove(T element) {
        for (int i = 0; i < size; i++) {
            if (elementos[i].equals(element)) {              
                shiftLeft.ShiftLeft(elementos,size, i);
                size--;             
            }
        }
        return null;
    }
	public void removeAll(T element) {
        for (int i = 0; i < size; i++) {
            if (elementos[i].equals(element)) {
                shiftLeft.ShiftLeft(elementos, size, i);
                size--;
                i--; 
            }
        }
    }
	
	@Override
	public String toString() {
		return "CollectionCustom [elementos=" + Arrays.toString(elementos) + ", size=" + size + "]";
	}
	
	
	

    
}
