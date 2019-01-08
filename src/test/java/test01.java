import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mawandong
 * @date 2019/1/8 21:31
 */
public class test01 {


    @Test
    public void test01(){
        List<String> list = new ArrayList<>();

        list.add("xxx");
        var list2 = List.copyOf(list);

        Console.log(list2.toString());
    }

}
