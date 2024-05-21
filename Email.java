import java.util.List;

public class Email {

    private boolean isVaild;
    private Order theOrder;
    private Address deliveryAddress;
    private boolean orderCompleted;
    private  Customer customerDetails;
    private Payment payment;
    private Address billingAddress;




    private Item itemsInOrder;



    public Email(boolean isValid, Order theOrder, Address deliveryAddress, Customer customerDetails, Payment payment, Address billingAddress){

        this.isVaild = isValid;
        this.theOrder = theOrder;
        this.deliveryAddress = deliveryAddress;
        this.customerDetails = customerDetails;
        this.payment = payment;
        this.billingAddress = billingAddress;

    }

    public String consumersEmail() {
       return customerDetails.getEmailAddress();
    }

    public String consumersFirstName(){
        return customerDetails.getFirstName();
  }

    public String consumersSurtName(){
        return customerDetails.getSurName();
    }

    public Long consumersdeds(){
        return customerDetails.getCustomerId();

    }

    public String consumersStreet() {
        return deliveryAddress.getStreet();
    }

    public String consumersCity() {
        return deliveryAddress.getCity();
    }

    public String consumersEircode() {
        return deliveryAddress.getEircode();
    }

    public String consumersCountry() {
        return deliveryAddress.getCountry();
    }

    public String billingStreet() {
        return billingAddress.getStreet();
    }

    public String billingCity() {
        return billingAddress.getCity();
    }

    public String billingEircode() {
        return billingAddress.getEircode();
    }

    public String biiingCountry() {
        return billingAddress.getCountry();
    }

    public List<Item> fullOrder(){
        return theOrder.getItemsInCart();
    }

    public int orderPrice(){
        return theOrder.totalPrice();
    }

    public long customerID() {
        return customerDetails.getCustomerId();
    }

    public void emailPartOne() {
        if (isVaild == true) {
            System.out.println("Email : " + consumersEmail());
            System.out.println("To " + consumersFirstName() + " " + consumersSurtName());
            System.out.println("Customer ID: " + customerID());
            System.out.println("Your order was : " + fullOrder());
            System.out.println("The total order price is : " + "€" + orderPrice());
            System.out.println("These items will be delivered to your address : " + deliveryAddress.getStreet() + ", " + deliveryAddress.getCity() + ", " + deliveryAddress.getEircode() + ", " + deliveryAddress.getCountry());
            System.out.println("The billing address is : " + billingAddress.getStreet() + ", " + billingAddress.getCity() + ", " + billingAddress.getEircode() + ", " + billingAddress.getCountry());
        } else {
            System.out.println("Email : " + consumersEmail());
            System.out.println("Dear " + consumersFirstName() + " " + consumersSurtName());
            System.out.println("Customer ID: " + customerID());
            System.out.println("Payment did not go through, please try again");
        }
    }
}
