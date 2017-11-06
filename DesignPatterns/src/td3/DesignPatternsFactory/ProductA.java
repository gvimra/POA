package td3.DesignPatternsFactory;

class ProductA extends Products {


    static{
        ProductFactory.registerProduct("ProductA",new ProductA());
    }

    public void doYourStuff(){

        System.out.println("I’m a ProductA, doing my stuff");
    }

    public Products createProduct(){
        return new ProductA();
    }
}
