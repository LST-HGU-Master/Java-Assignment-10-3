import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @version (20220620)
 **/
public class SlimeTest
{
    @Test
    public void testPrivate() {
        try{
            // action
            Slime slm = new Slime('0');
            Field sfx = slm.getClass().getDeclaredField("suffix");

            assertNotEquals(Modifier.STATIC, sfx.getModifiers(),"Slimeクラスのフィールドsuffixをstaticに変更してはいけません!");

        } catch (NoSuchFieldException e) {
            fail("Slimeクラスのフィールドとして suffix が定義されていません!");
        }
    }

}
