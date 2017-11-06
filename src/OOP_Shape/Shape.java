package OOP_Shape;

/** 
 * @ClassName: Shape 
 * @Description: Abstract implementation of generic shape objects. 
 * @author makebono 
 * @date 2017年10月30日 下午3:09:58 
 *  
 */
public abstract class Shape extends Object implements ShapeInterface {
    private double x;
    private double y;

    public Shape() {
        this.x = 0;
        this.y = 0;
    }

    public Shape(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveX(final double x) {
        this.x = x;
    }

    @Override
    public void moveY(final double y) {
        this.y = y;
    }

    @Override
    public void move(final double x, final double y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public abstract double area();

    @Override
    public abstract double diameter();

    public static <T> void printInformation(final T shape) throws IllegalArgumentException {
        if (shape instanceof Shape) {
            System.out.println(shape.toString());
        } else {
            throw new IllegalArgumentException("Input should be a shape object.");
        }
    }

    @Override
    public abstract String toString();
}
