public class TransactionTest {


    public static void main(String[] args) {

       TransactionTest test = new TransactionTest();
       test.transaction1();
       test.transaction2();


    }

    public void transaction1() {
        Address address = new Address("Furymeila East", "Dublin", "H91 2F8", "Ireland");
        Address billingAddress = new Address("Furymeila East", "Galway", "H91 F8", "Ireland");
        Customer customer1 = new Customer("Ben", "Naughton", "5bennaughton@gmail.com");
        ShoppingCart cart = new ShoppingCart();

        
        Item cheese = new Item("Cheddar Cheese", 123456789);
        cheese.setPrice(3);

        Item ham = new Item("Ham", 123456798);
        ham.setPrice(4);

        Item bread = new Item("Bread", 123457689);
        bread.setPrice(2);

        cart.addToCart(cheese);
        cart.addToCart(ham);
        cart.addToCart(bread);

        Order order = new Order(customer1, billingAddress);
        order.transferItemsFromCart(cart);

        Payment payment = new Payment(customer1, billingAddress, "Visa", "2423 2324 2664 2424", "10/28", "Bank Of Ireland");

        boolean vaild;

        if (payment.isValid()) {
            vaild = true;

        } else vaild = false;

        Email email = new Email(vaild, order, address, customer1, payment, billingAddress);
        email.emailPartOne();

    }


    public void transaction2() {
            Address address = new Address("Furymeila East", "Dublin", "H91 2F8", "Ireland");
            Address billingAddress = new Address("Furymeila East", "Galway", "H91 F8", "Ireland");
            Customer customer1 = new Customer("Ben", "Naughton", "5bennaughton@gmail.com");
            ShoppingCart cart = new ShoppingCart();

            
            Item cheese = new Item("Cheddar Cheese", 123456789);
            cheese.setPrice(3);

            Item ham = new Item("Ham", 123456798);
            ham.setPrice(4);

            Item bread = new Item("Bread", 123457689);
            bread.setPrice(2);

            cart.addToCart(cheese);
            cart.addToCart(ham);
            cart.addToCart(bread);

            Order order = new Order(customer1, billingAddress);
            order.transferItemsFromCart(cart);

            Payment payment = new Payment(customer1, billingAddress, "Visa", "2423 2326 6424 24", "10/28", "Bank Of Ireland");

            boolean vaild;

            if (payment.isValid()) {
                vaild = true;

            } else vaild = false;

            Email email = new Email(vaild, order, address, customer1, payment, billingAddress);
            email.emailPartOne();

        }
    }
