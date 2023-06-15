package live.harshjain;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public String checkout(String itemName)
    {
        //Logging
        //Authentication
        //Data sanitization
        System.out.println("Checkout method from shopping cart called ");
        return itemName;
    }

}
