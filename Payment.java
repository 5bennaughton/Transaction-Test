public class Payment {

    private Customer customer;
    private String cardType;
    private String cardNumber;
    private String cardExpiryDate;
    private String cardBankName;
    private Address billingAddress;

    private boolean vaild;


    public Payment(Customer customer,Address billingAddress, String cardType, String cardNumber, String cardExpiryDate, String cardBankName){

        this.customer = customer;
        this.billingAddress = billingAddress;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cardExpiryDate = cardExpiryDate;
        this.cardBankName = cardBankName;

    }

    public boolean isValid() {
       if(!cardType.equals("MasterCard") && !cardType.equals("Visa")) {
             vaild = false;
       } else vaild = true;
       cardNumber = cardNumber.replaceAll("\\s", "");
       if( cardNumber.length() != 16 ) {
           vaild = false;
       } else vaild = true;

         return vaild;
    }
    
}
