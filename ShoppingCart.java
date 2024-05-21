import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> shoppingCart;
    private boolean isClosed;


    public ShoppingCart() {

        shoppingCart = new ArrayList<>();
        isClosed = false;
    }

    public void addToCart(Item item){
        if (!isClosed) {
            shoppingCart.add(item);
        } else {
            System.out.println("Sorry, the shopping cart is closed");
        }

    }

    public void removeFromCart(Item item) {
        if (!isClosed) {
            shoppingCart.remove(item);
        } else {
            System.out.println("Sorry, the shopping cart is closed. Some of the items are not added");
        }
    }


    public List<Item> getShoppingCart() {

        return shoppingCart;
    }


    public void close() {
        isClosed = true;
    }

    public void open() {
        isClosed = false;
    }


}