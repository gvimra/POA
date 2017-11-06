package td3.DesignPatternsFactory;

import java.util.HashMap;
import java.util.Map;

public final class ProductFactory  {

    private static Map<String, Products> registry = new HashMap<String, Products>();

    public static void registerProduct(String name, Products p){
        registry.put(name,p);
    }

    public Products createProduct(String name){
        return registry.get(name).createProduct();
    }
}
