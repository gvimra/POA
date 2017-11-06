package td3.DesignPatternsFactory;

class ProductB extends Products {


    static{
        ProductFactory.registerProduct("ProductB",new ProductB());
    }

    public void doIt(){
            System .out. println ("I’m a ProductB, doing it");
    }

    public Products createProduct(){
        return new ProductB();
    }
}
