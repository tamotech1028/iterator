import aggregate.Cart;
import aggregate.Item;
import aggregate.Shelf;
import iterator.Iterator;

public class IteratorSample {
    public static void main(String[] args) {
        // カート作成
        Cart cart = new Cart();
        cart.addItem(new Item("オレンジ", 150));
        cart.addItem(new Item("りんご", 100));
        cart.addItem(new Item("バナナ", 120));
        cart.addItem(new Item("いちご", 500));
        Iterator<Item> cartIterator = cart.iterator();

        // カート内の商品を順に表示
        System.out.println("カートの中身：");
        while (cartIterator.hasNext()) {
            Item item = cartIterator.next();
            System.out.println("- " + item.getName() + " (" + item.getPrice() + "円)");
        }

        // 商品棚に商品を追加
        Shelf shelf = new Shelf();
        shelf.addItem(new Item("ぶどう", 500));
        shelf.addItem(new Item("メロン", 1000));
        shelf.addItem(new Item("スイカ", 300));
        shelf.addItem(new Item("キウイ", 100));

        // 商品棚のIteratorを取得
        Iterator<Item> shelfIterator = shelf.iterator();

        // 商品棚内の商品を順に表示
        System.out.println("商品棚の中身：");
        while (shelfIterator.hasNext()) {
            Item item = shelfIterator.next();
            System.out.println("- " + item.getName() + " (" + item.getPrice() + "円)");
        }
    }
}