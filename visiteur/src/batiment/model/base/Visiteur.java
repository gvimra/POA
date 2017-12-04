package batiment.model.base;

public interface Visiteur {

    void visit(Univers u);
    void visit(Piece c);
    void visit(Vetement v);
    void visit(Lit l);
    void visit(Bureau b);
    void visit(GardeRobe g);
    void visit(CollectionDeLivres c);
    void visit(Lamp l);

    // ....pour tous les objets on met fonction visit


}
