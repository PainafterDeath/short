import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getName() {
        Person p = new Person("name", null);
        assertEquals("name", p.getName());
        Person p1 = new Person("name1", p);
        assertEquals("name1", p1.getName());
        assertEquals("name", p1.getFiend().getName());
    }

    @Test
    public void getFriend(){
        Person p = new Person("name", null);
        assertNull(p.getFiend());
        Person p1 = new Person("name1", p);
        assertEquals(p, p1.getFiend());
    }
}