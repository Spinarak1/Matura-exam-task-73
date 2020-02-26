import org.junit.Assert;
import org.junit.Test;

public class ileLiterWTekscieTest {
    @Test
    public void test(){
        Assert.assertEquals(0, Main.ileWTekscieSlow(""));
        Assert.assertEquals(0, Main.ileWTekscieSlow("  "));
        Assert.assertEquals(2, Main.ileWTekscieSlow(" hh aaaas hywq"));
        Assert.assertEquals(3, Main.ileWTekscieSlow(" hh aaaas hywqq"));
        Assert.assertEquals(0, Main.ileWTekscieSlow(" hqh sasas hywqxq gagaga "));
    }
    @Test
    public void test3(){
        Assert.assertEquals(0, Main.najdluzszyCiagSpolglosekWSlowie(""));
        Assert.assertEquals(0, Main.najdluzszyCiagSpolglosekWSlowie("  "));
        Assert.assertEquals(6, Main.najdluzszyCiagSpolglosekWSlowie("BBBBBB"));
        Assert.assertEquals(0, Main.najdluzszyCiagSpolglosekWSlowie("AAAAAA"));
        Assert.assertEquals(9, Main.najdluzszyCiagSpolglosekWSlowie("AAAEBGBGBGPPP"));
        Assert.assertEquals(3, Main.najdluzszyCiagSpolglosekWSlowie("AAABBYYEBGBIIGBGAAPPP"));
    }
    @Test
    public void test4(){
        Assert.assertEquals(new Main.Wynik733(2, 1, "AAABB"), Main.zadanie733("AAABB ABAB"));
        Assert.assertEquals(new Main.Wynik733(0, 0, ""), Main.zadanie733(""));
        Assert.assertEquals(new Main.Wynik733(6, 3, "BABABABBBBBB"), Main.zadanie733("ABABAB BABABABBBBBB BABABA AAAAAABBBBBB BABABABBBBBB"));
    }
}
