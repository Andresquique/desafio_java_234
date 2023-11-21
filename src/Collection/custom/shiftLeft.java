package Collection.custom;

public abstract class shiftLeft {
	public static  Object[] ShiftLeft(Object[] elementos,int size,int index) {
		System.arraycopy(elementos, index + 1, elementos, index, size - index - 1);
		return elementos;
    }
}
