

public class Date
{
    private String month;
    private int date;
    
    public Date() {
        this.date = date;
        this.month = month;
    }
   
    public int getDate(){
        return date;
    }
    
    public String getMonth(){
        return month;
    }
    
    public void switchDate(){
        
        switch (date) {
            case 1: month = "Januar 2017";
            break;
            case 2: month = "Januar 2017";
            break;
            case 3: month = "Januar 2017";
            break;
            case 4: month = "Februar 2017";
            break;
            case 5: month = "Februar 2017";
            break;
            case 6: month = "Februar 2017";
            break;
            case 7: month = "Mars 2017";
            break;
            case 8: month = "Mars 2017";
            break;
            case 9: month = "Mars 2017";
            break;
            case 10: month = "April 2017";
            break;
            case 11: month = "April 2017";
            break;
            case 12: month = "April 2017";
            break;
        }
        
    }
    
    public String toString(int date, String month, int year){
        String retur = (getDate() + getMonth());
        return retur;
    }
    
    
   
}
