package td3.DesignPatternsFactory;

class ProductC extends Products {

    static{
        ProductFactory.registerProduct("ProductC",new ProductC());
    }

    public void perform()
    {

        System .out. println ("I’m a ProductC, performing");
    }

    public Products createProduct(){
        return new ProductC();
    }
}
