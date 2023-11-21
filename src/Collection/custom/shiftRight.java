package Collection.custom;

public abstract class shiftRight {
	public static  Object[] ShiftRight(Object[] elementos,int size) {
		System.arraycopy(elementos, 0, elementos, 1, size);
		return elementos;
    }
}
