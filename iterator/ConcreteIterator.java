package iterator;

import aggregate.Aggregate;
import aggregate.Item;

public class ConcreteIterator implements Iterator<Item> {

    private Aggregate<Item> aggregate;
    private int index;

    
    public ConcreteIterator(Aggregate<Item> aggregate) {
        this.aggregate = aggregate;
        this.index = 0;
    }

    public Aggregate<Item> getAggregate() {
        return aggregate;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public boolean hasNext() {
        return index < getAggregate().getSize();
    }

    @Override
    public Item next() {
        Item item = getAggregate().getItemAt(index);
        index++;
        return item;
    }
}
