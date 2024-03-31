package Lab5.Immutable;

public final class ImmutableTree {
    private final Leaf leaf;
    public ImmutableTree(Leaf leaf){
        this.leaf = new Leaf(leaf);
    }

    public Leaf getLeaf() {
        return new  Leaf(leaf);
    }
}
