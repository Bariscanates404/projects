package SeleniumJunit.RadioButtonCheckBoxesAssertions;

import org.junit.Assert;
import org.junit.Test;

public class Assertions {

    @Test
    public void method01(){

        Assert.assertTrue(3 < 5);
        Assert.assertFalse(3 > 5);
        Assert.assertEquals("baris","baris");
        //expected argumanı beklenen sonuctur.
        //Actual argumanı olarak verdigimiz sonuc ise test edeceğimiz objedir.
    }


}
