package td3.DesignPatterns;

class Client {
    public Client (){

        prodA = new ProductA ();

         }

    public void foo (){
         prodA.doYourStuff();
         ProductB myProdB = new ProductB();
         myProdB.doIt();
         ProductC myProdC = new ProductC();
     myProdC.perform();
    }
    ProductA prodA ;
//    ProductB prodB ;
}