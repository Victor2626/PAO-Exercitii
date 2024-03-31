package Lab5.Immutable;

public class Leaf {
    private String color;
    private String shape;

    public Leaf(String color, String shape){
        this.color = color;
        this.shape = shape;
    }
    public Leaf (Leaf leaf){
        this.color = leaf.getColor();
        this.shape = leaf.getShape();
    }

    public String getColor() {
        return color;
    }

    public String getShape() {
        return shape;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
    @Override
    public String toString() {
        return "Leaf{" +
                "color='" + color + '\'' +
                ",shape='" + shape + '\'' +
                '}';
    }
}
