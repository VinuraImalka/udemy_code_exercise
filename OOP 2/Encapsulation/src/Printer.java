public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel>-1 && tonerLevel <= 100)?tonerLevel:-1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount <= 100){
            if((tonerLevel+tonerAmount) > 100){
                return -1;
            }else {
                this.tonerLevel += tonerAmount;
                return tonerLevel;
            }
        }else{
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(duplex){
            pagesPrinted += (pagesToPrint/2)+ (pagesToPrint%2);
        }else{
            pagesPrinted += pagesToPrint;
        }
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
