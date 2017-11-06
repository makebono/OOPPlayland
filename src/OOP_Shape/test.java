package OOP_Shape;

/** 
 * @ClassName: test 
 * @Description: Test ground to play around. 
 * @author makebono
 * @date 2017年10月30日 下午3:19:38 
 *  
 */
public class test {
    static {
        // System.out.println("Will I be executed after compiling?");
    }

    public static void main(final String[] arge) {
        try {
            final Square s = new Square(3, 3, 5, 4);
            Shape.printInformation(s);
            s.setSide(5);
            Shape.printInformation(s);
        }
        catch (final Exception e) {
            System.out.println("Error(s) occured, the problem is: " + e.getMessage() + "\n");
        }

        final Square s = new Square(3, 3, 3, 3);
        Shape.printInformation(s);
    }
}
