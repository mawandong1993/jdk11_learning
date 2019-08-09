import cn.hutool.core.lang.Console;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mawandong
 * @date 2019/1/8 21:31
 */
@Slf4j
public class test01 {


    @Test
    public void test01(){
        List<String> list = new ArrayList<>();

        list.add("xxx");
        var list2 = List.copyOf(list);

        Console.log(list2.toString());
        log.info(list2.toString());
    }

}
