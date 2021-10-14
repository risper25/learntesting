public class Bank {


    public double balance;
    User user;

    public Bank(){
        this.balance=0;

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bank(User user, double balance){
        this.balance=balance;
        this.user=user;

    }
    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }
    public void deposit(double amount){

        this.balance+=amount;
    }
    public void wirthdraw(double amount){

        this.balance-=amount;
    }
    public String getUsername(){

        return this.user.getName();
    }


    public void addCustomer(String name){
        user.setName(name);

    }

}
