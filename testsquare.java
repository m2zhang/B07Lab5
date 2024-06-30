import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testsquare{
    Point p1 = new Point(0,0);
    Point p2 = new Point(0,1);
    Point p3 = new Point(1,1);
    Point p4 = new Point(1,0);
    Square s1 = new Square(p1,p2,p3,p4);

    //test methods 
    @Test
    void testperimeter(){
        assertEquals(s1.perimeter(),4);
    }

    @Test
    void testisValidSquare(){
        Point p5 = new Point(6,4);
        Square s2 = new Square(p2,p1,p5,p4);
        assertEquals(s1.isValidSqaure(),true);
        assertEquals(s2.isValidSqaure(),false);
    }

} test