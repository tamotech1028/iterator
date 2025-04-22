package aggregate;

import java.util.ArrayList;
import java.util.List;

import iterator.ConcreteIterator;
import iterator.Iterator;

public class Cart implements Aggregate<Item> {

    private List<Item> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    @Override
    public Item getItemAt(int index) {
        return getItems().get(index);
    }

    @Override
    public int getSize() {
        return getItems().size();
    }

    @Override
    public Iterator<Item> iterator() {
        return new ConcreteIterator(this);
    }
}