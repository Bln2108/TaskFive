import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.hetology.sgl.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "5,100,1",
            "1,10,0",
            "500,1000,9"
    })
    public void sguareBordersTest(int border1, int border2, int expected) {
        SQRService service = new SQRService();
        int actual = service.sguareBorders(border1, border2);
        Assertions.assertEquals(actual, expected);
    }

    // @Test
    // public void sguareBorders1() {
    //    SQRService service = new SQRService ();
    //    int actual = service.sguareBorders(5, 100);
    //   int expected = 1;
    //     Assertions.assertEquals( actual, expected );
    //   }
   }
