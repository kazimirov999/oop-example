package company;

public class Pen {
    private String color;
    private float lineThickness;

    public Pen(String color, float lineThickness) {
        this.color = color;
        this.lineThickness = lineThickness;
    }

    public String getColor() {
        return color;
    }

    public float getLineThickness() {
        return lineThickness;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", lineThickness=" + lineThickness +
                '}';
    }
}