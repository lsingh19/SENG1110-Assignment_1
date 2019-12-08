import javax.swing.*;
public class LoanCalculator
{
    public static void main (String[] args) 
    {
        // The Integer variable below will store a value that will be checked in the while statement. If true then the do-while loop will be rerun again. 
        // This will be repeated until the user decides not to rerun the program. 
        int rerun;
            do 
        {
                Client client; 
                double userAmount, userIncome;
                String userAccount, userName, results; 
                int userMonths, userAge;
                
                //  a new object will be created which will be called client in the program. 
                client = new Client();
                
                // Asking the user for the customer's name which be stored in the variable userName
                userName = JOptionPane.showInputDialog("Please enter name of potential client");      
                
                // Asking the user for the customer's age which will be recieve in String form and transformed from a String to an Interger
                // the integer will be stored in the variable userAge
                userAge = Integer.parseInt(JOptionPane.showInputDialog("Please enter the age of the client"));
                
                // The following code will go to the private helper method called 'checkInteger' in this file to check if the integer is postive and greater than 0
                // If the user input for Age does not meet these conditions then the user will be asked to re-enter an integer that meets the requirements.
                // The user will be asked again and again until a valid integer is provided. 
                checkInteger(userAge);                     
                
                // Asking the user to input the income per year of the customer. 
                // The input will in String form which will be converted to Double and stored in the variable userIncome. 
                userIncome = Double.parseDouble(JOptionPane.showInputDialog("Please enter income of the client"));
                
                // The following code will go to the private helper method called 'checkDouble' and check to see if the input for 'income per year' 
                // is greater than 0 and a postive integer. If the input does not meet these conditions then the user will be asked for an valid double value input 
                // that meets these conditions. 
                checkDouble(userIncome); 
                            
                // Asking the user for the amount of money the user would like to borrow. The input will be in string form so it will be converted into Double form and 
                // stored in the variable 'userAmount'. 
                userAmount = Double.parseDouble(JOptionPane.showInputDialog("Please enter number the amount of money the user would like to borrow"));
                
                // The Helper Method called 'checkDouble' will check if the input is a positive number. If not then the user will be asked to enter a 
                // a valid input that meets the condition. This process will be repeated until a valid input is provided. 
                checkDouble(userAmount);      
                
                // Asking the user for the number of months the user would like to pay. The input will be in String form which be be converted into integer form 
                // and then stored in the variable 'userMonths'. 
                userMonths = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of months"));
                
                // The helper method 'checkInteger' will check if the input for the number of months is a postive number.If not then the user will be asked 
                // to enter a valid input that meets the condition. This process will be repeated until a valid input is provided. 
                checkInteger(userMonths);
                
                // Asking the user what type of account they would like to set-up. The two accounts are given to the user from which the user must select one and type that 
                // in. 
                userAccount = JOptionPane.showInputDialog("Please select a the type of account \nno fees or fees");    
        
                // Once the user has provided valid inputs then the variables that contain the inputs are then stored in the client.java and account.java
                // file using a method in the client.java file. The variables that contain name, age and income will be stored within the Client.java file.
                // The other variables will be stored into the Account.java file which is done by using methods in the Account.java file. 
                client.setData(userName, userAge, userIncome, userAmount, userMonths, userAccount);
                
                // Since this program utilies the GUI method so the output must be in String form. The following code is storing the outputs from the program into a 
                // String variable called 'results'. 
                results = client.getName() + ", age " + client.getAge() + ", income " + client.getIncome() + "\n";  
                results += "Amount to borrow = $" + client.outputAmountBorrowed() + " to pay in " + client.outputNumberOfMonths() + " Months in Account Type " +  "\"" + client.outputAccountType() + "\"" + "\n";
                results += "The interest rate will be " + client.outputInterestRate() + "%. \n";
                results += client.outputTable(); 
               
                //Outputting the results to the user. 
                JOptionPane.showMessageDialog(null, results, "Results", JOptionPane.INFORMATION_MESSAGE);      
                
                // Asking if the user would like to rerun the program. 
                rerun = Integer.parseInt(JOptionPane.showInputDialog("Would you like to re-run the program \n YES(1) or NO(0)"));
            }
            
                // Checking to see if the rerun is equal to 1. If true then the do-statement will be rerun. 
                while (rerun == 1);
    }
    
    // This Helper Method will check to see if the input is a positive integer number. 
    private static int checkInteger(int value)
    {
        {
            // As long the user provides a negative integer number the while-loop will keep repeating until a valid positive interger number is provided.
            while (value < 0)
            {
                // Asking the user to input a postive integer number
                value = Integer.parseInt(JOptionPane.showInputDialog("Please enter a valid integer number that is not a negative number"));  
            }
            // Once a postive integer number is provided then this number is returned. From which it will be stored into whatever the variable was put within
            // the brackets of the method call.
            return value; 
        }
    }
    
    // This Helper Method will check to see if the input is a positive double number.
    private static double checkDouble(double number)
    {
        {
         // As long the user provides a negative DOUBLE number the while-loop will keep repeating until a valid double interger number is provided.
            while (number < 0)
            {
                // Asking the user to input a postive double number
                number = Double.parseDouble(JOptionPane.showInputDialog("Please enter a valid double number that is not a negative number"));     
            }
            // Once a postive double number is provided then this number is returned. From which it will be stored into whatever the variable was put within
            // the brackets of the method call.
            return number; 
        }
    }
}
