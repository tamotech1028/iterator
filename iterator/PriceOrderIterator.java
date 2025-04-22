package iterator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import aggregate.Cart;
import aggregate.Item;


// カートの中身を価格順にソートするイテレータ
public class PriceOrderIterator implements Iterator<Item> {

    private List<Item> sortItems;
    private int index;

    

    public List<Item> getSortItems() {
        return sortItems;
    }

    public int getIndex() {
        return index;
    }

    public PriceOrderIterator(Cart cart) {
        this.sortItems = new ArrayList<>(cart.getItems());
        this.sortItems.sort(Comparator.comparingInt(Item::getPrice));
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < getSortItems().size();
    }

    @Override
    public Item next() {
        Item item = getSortItems().get(index);
        index ++;
        return item;
    }
    
}
