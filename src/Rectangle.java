public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be between 0.0 and 20.0");
        }
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width must be between 0.0 and 20.0");
        }
    }

    public double getWidth() {
        return width;
    }

    public double perimeter() {
        return 2 * (this.length + this.width);
    }

    public double area() {
        return this.length * this.width;
    }

    public void display() {
        System.out.printf("Rectangle Length: %.2f\nRectangle Width: %.2f" +
                        "\nRectangle Area: %.2f\nRectangle Perimeter: %.2f\n",
                this.length, this.width, area(), perimeter());
    }
}
