package OOP_Shape;

/** 
 * @ClassName: Rectangle 
 * @Description: Rectangle
 * @author makebono
 * @date 2017年10月30日 下午4:10:16 
 *  
 */
public class Rectangle extends Shape {
    private double longSide;
    private double shortSide;

    public Rectangle() {
        super();
        this.longSide = 0;
        this.shortSide = 0;
    }

    public Rectangle(final double x, final double y) {
        super(x, y);
        this.longSide = 0;
        this.shortSide = 0;
    }

    public Rectangle(final double x, final double y, final double longSide, final double shortSide) {
        super(x, y);
        if (longSide >= shortSide) {
            this.longSide = longSide;
            this.shortSide = shortSide;
        } else {
            this.longSide = shortSide;
            this.shortSide = longSide;
        }
    }

    public void setLongSide(final double longSide) {
        if (longSide >= this.shortSide) {
            this.longSide = longSide;
        } else {
            this.longSide = longSide;
            final double temp = this.longSide;
            this.longSide = this.shortSide;
            this.shortSide = temp;
        }
    }

    public void setShortSide(final double shortSide) {
        if (shortSide <= this.longSide) {
            this.shortSide = shortSide;
        } else {
            this.shortSide = shortSide;
            final double temp = this.longSide;
            this.longSide = this.shortSide;
            this.shortSide = temp;
        }
    }

    public double getLongSide() {
        return this.longSide;
    }

    public double getShortSide() {
        return this.shortSide;
    }

    @Override
    public double area() {
        final double areaOfRectangle = this.getLongSide() * this.getShortSide();
        return areaOfRectangle;
    }

    @Override
    public double diameter() {
        double diameterOfRectangle = this.getLongSide() + this.getShortSide();
        diameterOfRectangle *= 2;
        return diameterOfRectangle;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Information about this rectangle is\n");
        sb.append("    x: ");
        sb.append(this.getX());
        sb.append("\n");
        sb.append("    y: ");
        sb.append(this.getY());
        sb.append("\n");
        sb.append("    Long Side: ");
        sb.append(this.getLongSide());
        sb.append("\n");
        sb.append("    Short Side: ");
        sb.append(this.getShortSide());
        sb.append("\n");
        sb.append("Diameter of this rectangle is\n");
        sb.append("    ");
        sb.append(this.diameter());
        sb.append("\n");
        sb.append("Area of this rectangle is\n");
        sb.append("    ");
        sb.append(this.area());
        sb.append("\n");
        return sb.toString();
    }
}
