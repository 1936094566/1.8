package future;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 * @author machao
 * @date 2019/8/14
 * @time 17:31
 * @description
 **/
public class ShopDemo3 {
    public static List<Shop> shops;

    static{
        shops = Arrays.asList(new Shop("BestPrice"),
                new Shop("LetsSaveBig"),
                new Shop("MyFavoriteShop"),
                new Shop("BuyItAll"),
                new Shop("TaoBao"));
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(findPrices("myPhone27S"));
        long duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println("Done in " + duration + " msecs");
    }

    public static List<String> findPrices(String product){
        /**
         * 方法一:并行流
         *return shops.parallelStream()
         *                 .map(shop -> String.format("%s price is %.2f",
         *                         shop.getName(), shop.getPrice(product)))
         *                 .collect(Collectors.toList());
         */
        /**
         * 方法操作
         * */
          List<CompletableFuture<String>> collect = shops.stream()
                          .map(shop -> CompletableFuture.supplyAsync(() -> shop.getName() + " Price " + shop.getPrice(product)))
                          .collect(Collectors.toList());
                  return collect.stream().map(CompletableFuture::join).collect(Collectors.toList());

//         return shops.stream().map(shop -> String.format("%s price is %.2f",
//                                         shop.getName(), shop.getPrice(product)))
//                          .collect(Collectors.toList());

    }

}
