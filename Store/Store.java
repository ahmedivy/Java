public class Store {
    public Book[] booksList = new Book[500];
    private double revenue = 0;

    public void printList() {
        for (int i = 0; i < booksList.length; i++) {
            if (booksList[i] != null){
                System.out.println(booksList[i]);
                System.out.println("==================================================");
            }
        }
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public Book[] getBooksList() {
        return booksList;
    }

    public int searchBook(String title){
        for (int j = 0; j < booksList.length; j++) {
            if (booksList[j] != null) {
                if (booksList[j].getTitle().toUpperCase().equals(title.toUpperCase())) {
                    return j;
                }
            }
        }
        return 0;
    }
}