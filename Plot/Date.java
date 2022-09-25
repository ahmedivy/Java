package Plot;

public class Date {
    public int year, month, date;

    public Date(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public int getDate() {
        return date;
    }
    
    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + date;
    }
}
