
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate comparedDate) {
        if (this.earlier(comparedDate)) {
            return this.differenceWhenThisEarlier(comparedDate);
        }
        int subtract = 0;
        
        if (this.month < comparedDate.month) {
            subtract = 1;
        } else if (this.month == comparedDate.month && this.day < comparedDate.day) {
            subtract = 1;
        }
        
        return this.year - comparedDate.year - subtract;
    }
    
    public int differenceWhenThisEarlier(MyDate compared) {
        int subtract = 0;
        
        if (compared.month < this.month) {
            subtract = 1;
        } else if (compared.month == this.month && compared.day < this.day) {
            subtract = 1;
        }
        
        return compared.year - this.year - subtract;
    }

  
}
