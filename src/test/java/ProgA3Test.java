import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.*;
/**
 * @version (20220609)
 **/
public class ProgA3Test {

    @Test
    public void testMain()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        StandardInputStream in = new StandardInputStream();
        System.setIn(in);

        // action
        // in.inputln("2"); // 標準入力をテストする場合
        // Hello.main(new String[]{"1", "2", "3"}); // 実行時引数をテストする場合
        ProgA3.main(new String[]{"12"});
        // undo the binding in System
        System.setOut(originalOut);
        // assertion
        String[] prints = bos.toString().split("\r\n|\n", -1);
        assertEquals(2*12, prints.length-1);
        assertEquals("工太はスライムAに攻撃した！", prints[0]);
        assertEquals("工太はスライムLに攻撃した！", prints[prints.length - 3]);
    }
}
