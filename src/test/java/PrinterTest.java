import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void beforeEach() {
        printer = new Printer(100, 200);
    }

    @Test
    public void hasPaper() {
        assertEquals(100, printer.sheetsOfPaper);
    }

    @Test
    public void hasPrint() {
        printer.print(6, 5);
        assertEquals(70, printer.sheetsOfPaper);
    }

    @Test
    public void hasNoPrintIfNotEnoughPaper() {
        printer.print(6, 5);
        assertEquals(70, printer.sheetsOfPaper);
    }

    @Test
    public void hasToner() {
        assertEquals(200, printer.toner);
    }

    @Test public void hasUseToner() {
        printer.print(5, 5);
        assertEquals(175, printer.toner);
    }



}
