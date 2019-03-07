
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000.00;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        double price = 2.50;
        if (cashGiven >= price) {
            // if the given cash is at least the price of the lunch:
            // the price of lunch is added to register
            this.cashInRegister += price;
            // the amount of sold lunch is incremented by one
            this.economicalSold++;
            //    method returns cashGiven - lunch price 
            return cashGiven - price;
        } else {
            // if not enough money given, all is returned and nothing else happens        
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        double price = 4.00;
        if (cashGiven >= price) {
            // if the given cash is at least the price of the lunch:
            // the price of lunch is added to register
            this.cashInRegister += price;
            // the amount of sold lunch is incremented by one
            this.gourmetSold++;
            //    method returns cashGiven - lunch price 
            return cashGiven - price;
        } else {
            // if not enough money given, all is returned and nothing else happens        
            return cashGiven;
        }
    }

    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        double price = 2.50;
        // if the balance of the card is at least the price of the lunch:
        if (card.balance() >= price) {
            //    the amount of sold lunches is incremented by one
            card.pay(price);
            this.economicalSold++;
            //    the method returns true
            return true;
        }
        // if not, the method returns false
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        double price = 4.00;
        // if the balance of the card is at least the price of the lunch:
        if (card.balance() >= price) {
            //    the amount of sold lunches is incremented by one
            card.pay(price);
            this.gourmetSold++;
            //    the method returns true
            return true;
        }
        // if not, the method returns false
        return false;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum >= 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
