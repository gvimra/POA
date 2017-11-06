package make.some.burgers;

import java.util.ArrayList;
import java.util.List;

public abstract class Burger implements FoodProduct{

    String name;
    List<FoodProduct> items;

    public interface BurgerBuilder{
        String name();

    }
}
