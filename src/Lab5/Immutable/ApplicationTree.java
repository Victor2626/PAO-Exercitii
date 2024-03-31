package Lab5.Immutable;

public class ApplicationTree {
    public static void main(String[] args){
        Leaf leaf = new Leaf("green", "star");
        Tree tree = new Tree(leaf);
        System.out.println("mutabil Copac: " + tree.getLeaf());
        ImmutableTree Immutabletree = new ImmutableTree(leaf);
        leaf.setShape("round");
        System.out.println("Tree mutable: " + tree.getLeaf());
        Leaf leaf2 = Immutabletree.getLeaf();
        Leaf leaf3 = Immutabletree.getLeaf();
        System.out.println("Tree imutable: " + leaf2);
        System.out.println("Tree imutable: " + leaf3);
    }
}
