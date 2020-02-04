public class Customer extends  Account{

    private String CustomerName;
    private String bank_id;
    private Bank account;
    //private Account account_number;
    public Customer(String customerName, String bank_id, Bank account){
        this.account = account;
        this.bank_id = bank_id;
        this.CustomerName = customerName;
    }

    public void CreateAcount(){

    }





}
