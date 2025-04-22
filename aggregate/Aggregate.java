package aggregate;

import iterator.Iterator;

public interface Aggregate<T> {
    Item getItemAt(int index);
    int getSize();
    public Iterator<T> iterator();
}
