import java.util.*;

public class Order {
    private List<Item> itemsInCart;
    private Customer customer;
    private int totalCartPrice;


    public Order(Customer customer, Address billingAddress) {
        itemsInCart = new ArrayList<>();
        this.customer = customer;
    }


    public void transferItemsFromCart(ShoppingCart shoppingCart) {
        List<Item> cartItems = shoppingCart.getShoppingCart();
        for (Item item : cartItems) {
            itemsInCart.add(item);
        }
        cartItems.clear();
    }

    public int totalPrice() {

        for (Item cartPrice : itemsInCart) {

            totalCartPrice += cartPrice.getPrice();
        }
        return totalCartPrice;
    }

    public List<Item> getItemsInCart() {
        return itemsInCart;
    }

    public Customer getCustomer() {
        return customer;
    }


}