import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.*;

public class HeroTest {
    @Test
    public void testAttackAll()
    {
        // action
        Hero h = new Hero();
        Slime[] slimes = new Slime[19];
        char suffix = 'A';
        for (int i = 0; i < 19; i ++) {
            slimes[i] = new Slime(suffix);
            suffix++;
        }

        h.attackAll(slimes);

        // assertion
        for (Slime s: slimes)
        {
            assertEquals(13, s.hp);
        }

    }
}
