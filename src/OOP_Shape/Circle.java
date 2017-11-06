package OOP_Shape;

/** 
 * @ClassName: Circle 
 * @Description: Circle
 * @author makebono
 * @date 2017年10月30日 下午3:24:12 
 *  
 */
public class Circle extends Shape {
    private double r;

    public Circle() {
        super();
        this.r = 0;
    }

    public Circle(final double x, final double y) {
        super(x, y);
        this.r = 0;
    }

    public Circle(final double x, final double y, final double r) {
        super(x, y);
        this.r = r;
    }

    public void setR(final double r) {
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    @Override
    public double area() {
        double areaOfCircle = Math.pow(this.getR(), 2);
        areaOfCircle *= Math.PI;
        return areaOfCircle;
    }

    @Override
    public double diameter() {
        double diameterOfCircle = this.getR() * 2;
        diameterOfCircle *= Math.PI;
        return diameterOfCircle;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Information about this circle is\n");
        sb.append("    x: ");
        sb.append(this.getX());
        sb.append("\n");
        sb.append("    y: ");
        sb.append(this.getY());
        sb.append("\n");
        sb.append("    Radius: ");
        sb.append(this.getR());
        sb.append("\n");
        sb.append("Diameter of this circle is\n");
        sb.append("    ");
        sb.append(this.diameter());
        sb.append("\n");
        sb.append("Area of this circle is\n");
        sb.append("    ");
        sb.append(this.area());
        sb.append("\n");
        return sb.toString();
    }
}
