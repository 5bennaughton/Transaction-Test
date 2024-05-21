import java.util.Random;

public class Customer {

    private String firstName;
    private String surName;
    private String emailAddress;
   private final long  customerId;

    public Customer(String firstName, String surName, String emailAddress){
        this.firstName = firstName;
        this.surName = surName;
        this.emailAddress = emailAddress;
        customerId = newCustomerId();
    }

      private long newCustomerId(){
        Random random = new Random();
          long lowerBound = 1000000L;
          long upperBound = 100000000000L;
          long randomNumber = lowerBound + (long) (random.nextDouble() * (upperBound - lowerBound));

          return randomNumber;
 }

    public long getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

}
