package testing;

import eu.ase.poli.auto;
import org.junit.Assert;
import org.junit.Test;

public class JUnitEvaluation {
    @Test
    public void testAutoSetDoorsNoLt0() throws Exception {
        auto a = new auto();
        try {
            a.setDoorsNo(-5);
            Assert.fail("setDoorsNo accepts negative values ");

        } catch (Exception e) {
            System.out.println("OK");
        }
    }
    @Test
    public void testSetDoorsNo(){
        auto a=new auto();
        try{
            a.setDoorsNo(4);
            Assert.assertEquals(4, a.getDoorsNo());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}