package ca.effenti.tutorial.lambdastream;

import java.util.List;
import java.util.function.Consumer;

public class FonctionalProgrammingExample {

    void processOrder(List<Order> orders, Consumer<Order> shippingMethod){
        for (Order order :
                orders) {
            createOrder(order);
            billCustomer(order);
            shippingMethod.accept(order);
        }
    }

    void processOrder(List<Order> orders, ShippingType type){
        for (Order order :
                orders) {
            createOrder(order);
            billCustomer(order);
            if(ShippingType.FAST.equals(type)){
                shipFast(order);
            }else{
                shipSlow(order);
            }
        }
    }


    private void shipSlow(Order order) {

    }

    private void shipFast(Order order) {

    }

    private void billCustomer(Order order) {

    }

    private void createOrder(Order order) {

    }


    public class Order{}

    public enum ShippingType {
        FAST, SLOW;
    }

}


