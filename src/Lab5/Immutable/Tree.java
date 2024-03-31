package Lab5.Immutable;

public class Tree {
    private Leaf leaf;
    public Tree(Leaf leaf){
        this.leaf = leaf;
    }

    public Leaf getLeaf() {
        return leaf;
    }

    public void setLeaf(Leaf leaf) {
        this.leaf = leaf;
    }
}
