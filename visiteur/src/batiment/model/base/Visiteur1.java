package batiment.model.base;

import sun.reflect.generics.visitor.Visitor;

public class Visiteur1 implements Visiteur {

    @Override
    public void visit(Univers u) {
        System.out.println("Je suis un univers");
    }

   @Override
    public void visit(Piece p){
        System.out.println("Je suis une piece");
        for(Truc t : p.trucs){
            t.accept(this);
        }
    }

    @Override
    public void visit(Vetement v) {
        System.out.println("Je suis un  vetement");

    }

    @Override
    public void visit(Lit l) {
        System.out.println("Je suis un lit");
    }

    @Override
    public void visit(Bureau b) {
        System.out.printf("Je suis un bureau");
        for(Truc t : b.trucs){
            t.accept(this);
        }
    }

    @Override
    public void visit(GardeRobe g) {
        System.out.println("Je suis un vetement");
        for(Vetement v : g.vetements){
            v.accept(this);
        }
    }

    @Override
    public void visit(CollectionDeLivres c) {
        System.out.println("Je suis une collection de " + c.getNbLivres()+" livres");
    }

    @Override
    public void visit(Lamp l) {
        System.out.println("Je suis un lamp");
    }


}
