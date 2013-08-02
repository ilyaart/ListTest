import static org.junit.Assert.*;

import org.junit.Test;


public class ListTests {

    @Test
    public void testMyList() {
        List list = new List();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        
        System.out.println(list.head.value);
//        assertTrue(4 == list.get(4));
//        assertTrue(2 == list.get(1));
//        assertTrue(3 == list.get(2));
        
//        list.get(6);
      }
    }

}
