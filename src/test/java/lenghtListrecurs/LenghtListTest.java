package lenghtListrecurs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LenghtListTest {

    private static List<String> list = new ArrayList<>();

    @Before
    public void initList() {
        list.add("abc");
        list.add("asdf");
        list.add("sdafdsf");
        list.add("azxc");
        list.add("azsadf");
        list.add("jhgjhgj");
        list.add("jhgjhgj");
        list.add("jhgjhgj");
    }

    @Test
    public void shouldCalcLenghtList(){
        LenghtList lenghtList = new LenghtList();
        Assert.assertEquals(8, lenghtList.lenghtList(list));
    }

}
