package Banking_Managaement_Sytem;

public class MyBank implements Bank{

    private String name;
    private long mobNumber;
    private long adharNumber;
    private String DOB;
    private String address;

    private long accountNumber;
    private double balance;

    // getter()
    public String getName() {
        return name;
    }
    public long getMobNumber() {
        return mobNumber;
    }
    public long getAdharNumber() {
        return adharNumber;
    }
    public String getDOB() {
        return DOB;
    }
    public String getAddress() {
        return address;
    }

    // setter()
    public void setName(String name) {
        this.name = name;
    }
    public void setMobNumber(long mobNumber) {
        this.mobNumber = mobNumber;
    }
    public void setAdharNumber(long adharNumber) {
        this.adharNumber = adharNumber;
    }
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    // constructor
    MyBank(){}

    // constructor to load the variables
    MyBank(String name,long mobNumber , long adharNumber , String DOB , String address){
        this.name = name;
        this.mobNumber = mobNumber;
        this.adharNumber = adharNumber;
        this.DOB = DOB;
        this.address = address;
    }


    @Override
    public void createAccount() {
        System.out.println("\n\tYou are successfully created a Bank Account...!\n");

        System.out.println("\tName : " + name);
        System.out.println("\tMobile Number : " + mobNumber);
        System.out.println("\tAdhar Number : " + adharNumber);
        System.out.println("\tDate of Birth : " + DOB);
        System.out.println("\tAddress : " + address);
        accountNumber = (long)(Math.random() * 900000000000l);
        System.out.print("\n\tYour Bank Account Number is : " + accountNumber);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public void checkBalance() {
        System.out.println("\tAccount Balance : " + balance);
    }
}
