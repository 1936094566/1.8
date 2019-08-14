package future;

import applelv3.Common;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * @author machao
 * @date 2019/8/14
 * @time 16:40
 * @description
 **/
public class Shop {
    public Random random = new Random();
    private String name;

    public Shop() {
    }

    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(String product){
       return calculatePrice(product);
    }
    public  double calculatePrice(String product){
        Common.delay();
        return random.nextDouble()*product.charAt(0)+product.charAt(1);
    }

    public Future<Double> getPriceAsync(String product){
        CompletableFuture<Double> futurePrice = new CompletableFuture<>();
        new Thread( () -> {
            double price = calculatePrice(product);
            futurePrice.complete(price);
        }).start();
        return futurePrice;
    }
}
