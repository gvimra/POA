package make.some.burgers;

public class BigBurgerBuilder {

    private String name;
    private Size size;

    public BigBurgerBuilder(String name, Size size /* Meat.MeatType */){
        this.name=name;
        this.size=size;

    }

        public BigBurgerBuilder with_onions(){
  //      this.products.add(new DeepFriedOnions());
        return this;
        }

        public BigBurgerBuilder with_Tomato(){
        this.products.add(new Tomate());
        return this;
        }

        public Burger cook(){
            return new BigBurgerBurger(this);
        }

}
