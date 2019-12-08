public class Client
{
    // Declaring the instance variables
    private String name;
    private int age;
    private double income; 
    private Account loan; 
    
    /**
     * Constructor for objects of class Client
     */
    public Client()
    {
        // initialising instance variables
        name = "";
        age = 0; 
        income = 0.0;
        loan = new Account();
    }

    // Storing the variables userName, userAge and userIncome into their respective instance variables and the rest variables will be stored into the Account.java 
    // by using the method called 'setAccount' within the Account.java file. 
    public void setData(String userName, int userAge, double userIncome, double userAmount, int userMonths, String userAccount)
    {
        name = userName; 
        age = userAge; 
        income = userIncome; 
        loan.setAccount(userAmount, userMonths, userAccount);
    }
   
    // Return the string 'name' when the method is called   
    public String getName()
    {
        return name; 
    }
    
    // Returns the interger value of 'age' when the method is called
    public int getAge()
    {
        return age; 
    }
    
    // returns the double value of 'income' when the method is called. 
    public double getIncome()
    {
        return income; 
    }
    
    //  return the double value of interest rate which is received from the account.java file when the method is called
    public double outputInterestRate()
    {
        double interest = loan.getInterestRate();
        // multiplying the interest rate by 100 to get it into percentage form.
        interest *= 100;
        return interest; 
    }
    
    //  return the integer value of number of months which is received from the account.java file when the method is called
    public int outputNumberOfMonths() 
    {
        return loan.getNumberOfMonths();
    }
    
    //  return the double value of amount borrowed which is received from the account.java file when the method is called
    public double outputAmountBorrowed()
    {
        return loan.getAmountBorrowed();
    }
    
    //  return the string 'accountType'which is received from the account.java file when the method is called
    public String outputAccountType()
    {
            return loan.getAccountType();
    }
    
    //  return the string 'table'which is received from the account.java file when the method is called
    public String outputTable()
    {
        return loan.setAmortizationTable();
    }
}
