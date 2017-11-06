package OOP_Shape;

/** 
 * @ClassName: ShapeInterface
 * @Description: Interface for shapes 
 * @author makebono
 * @date 2017年10月30日 下午3:06:18 
 *  
 */
public interface ShapeInterface {
    double getX();

    double getY();

    double area();

    double diameter();

    void moveX(double x);

    void moveY(double y);

    void move(double x, double y);
}
