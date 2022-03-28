public class Printer {

    int sheetsOfPaper;
    int toner;

    public Printer(int sheetsOfPaper, int toner) {
        this.sheetsOfPaper = sheetsOfPaper;
        this.toner = toner;
    }

    public void print(int pages, int copies) {
        int paperUsed = (pages * copies);
        if (paperUsed <= sheetsOfPaper) {
            this.sheetsOfPaper -= paperUsed;
            this.toner -= paperUsed;
        }
    }



}
