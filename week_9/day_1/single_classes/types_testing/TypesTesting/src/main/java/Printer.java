
//Create a Printer class that has a property for number of sheets of paper left.
public class Printer {
    private int sheetsLeft;
    private int tonerLeft;

    public Printer(int sheetsTot, int tonerLeft) {
        this.sheetsLeft = sheetsTot;
        this.tonerLeft = tonerLeft;
    }

    public void print(int numPages, int numCopies) {
        if (this.sheetsLeft > (numPages * numCopies) & this.tonerLeft > (numPages * numCopies)) {
            this.sheetsLeft -= (numPages * numCopies);
            this.tonerLeft -= (numPages * numCopies);
        }

    }

    public int countSheets() {
        return this.sheetsLeft;
    }

    public int checkToner() {
        return this.tonerLeft;
    }

}

/*
Add a method to print that takes in a number of pages
and number of copies.
The print method will only run if the printer has enough
paper. If it runs it will reduce the value of the paper left
by number of copies * number of pages.
 */


/*
Add a toner volume property to the class.
Modify the printer so that it reduces the toner by 1 for each page printed.
*/

