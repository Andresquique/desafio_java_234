package Collection.custom;

public abstract class Capacity {
	
	
	public static  Object[] ensureCapacity(Object[] elementos,int size) {
        if (size == elementos.length) {
            int newCapacity = elementos.length * 2;
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(elementos, 0, newArray, 0, size);
            elementos = newArray;            
        }
		return elementos;
    }
}



