package OOP_Shape;

/** 
 * @ClassName: Square 
 * @Description: Square
 * @author makebono
 * @date 2017年10月30日 下午4:30:57 
 *  
 */
public class Square extends Rectangle {
    private double side;

    public Square() {
        super();
        this.side = 0;
        this.setLongSide(0);
        this.setShortSide(0);
    }

    public Square(final double x, final double y) {
        super(x, y);
        this.side = 0;
        this.setLongSide(0);
        this.setShortSide(0);
    }

    public Square(final double x, final double y, final double side) {
        super(x, y);
        this.side = side;
        this.setLongSide(side);
        this.setShortSide(side);
    }

    public Square(final double x, final double y, final double longSide, final double shortSide)
            throws IllegalArgumentException {
        super(x, y);
        if (longSide != shortSide) {
            throw new IllegalArgumentException("Square should have each side equals.");
        } else {
            this.side = longSide;
            this.setLongSide(longSide);
            this.setShortSide(longSide);
        }
    }

    public void setSide(final double side) {
        this.side = side;
        this.setLongSide(side);
        this.setShortSide(side);
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Information about this square is\n");
        sb.append("    x: ");
        sb.append(this.getX());
        sb.append("\n");
        sb.append("    y: ");
        sb.append(this.getY());
        sb.append("\n");
        sb.append("    Side: ");
        sb.append(this.getSide());
        sb.append("\n");
        sb.append("Diameter of this square is\n");
        sb.append("    ");
        sb.append(this.diameter());
        sb.append("\n");
        sb.append("Area of this square is\n");
        sb.append("    ");
        sb.append(this.area());
        sb.append("\n");
        return sb.toString();
    }
}
