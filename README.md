# SENG1110-Assignment_1
Object-Oriented Programming Course - Assignment 1

Mark: 90.5 / 100 

# Comments by Marker

-2 for having static methods and not isolating the main function by a separate run function. Good practice is to have very few lines of code in main and the rest is in another private function. 

-7.5 as table is wrong for no fees, should not print negative values, must stop if total balance is 0 

# Assignment Specifications
## Introduction 
 
The objective of this assignment is the implementation of an object oriented program using Java to receive information from a potential client and calculate and display details of a possible loan from the GoodMates Loan Institution. The assignment 2 will be an extension of this assignment. 

## Specification
The program will start asking for the following inputs: 
* User name 
* User age  
* User income per year  
* amount of money the user would like to borrow 
* number of months the user would like to pay 
* type of account (see below) 
 
If the user inputs a negative number, the program should show a message and ask the input again.  
There are two types of accounts the user can choose: 
1. No fees. If the user chooses this option, the interest rate will be 
    - 6.5%  if n < 50 
    - 7.5%  if 50 <= n < =100 
    - 8.5%  if n > 100 where n is number of months 
    
2. Fees. The interest rate will be 6%, but the user needs to pay an additional fee of $10 every month. 
 
Next, the program will output the monthly payment, which will be calculated using the formula:  

p = (d * r * a ^ n) / 12 * (a ^ n - 1)

where d = amount to borrow, a = 1 + r/12, r = interest rate and n = number of months   
 
Then, the program will show the amortization table. Each row of the table will show: 
- month 
- initial balance 
- payment 
- interest paid 
- principal paid 
- final balance

The payment is calculated by the formula (1).  
The interest paid will be  (initial balance) * r/12.  
The principal paid will be  (payment - interest paid)  
The final balance will be  (initial balance – payment + interest paid.) 

The program will also inform
- Total payment 
- Total interest paid

**_For example:_**   
Suppose the following inputs:  
Name = Joao da Silva   
Age = 31   
Income per year = 60000   
Amount to borrow = 10000    
Months to pay = 10   
Account type = no fees   
 
The output would be: 
Name = Joao Silva, age 31, income 60000  
Amount to borrow = 10000 to pay in 10 months in accountType “no fees”.   
The interest rate will be 6.5%.   
The month payment will be p = $1030.03.    
The total payment is 10300.34   
Total interest paid is 300.34.   
The amortization table is:   

| Month | InitBalance | MonthPayment | InterestPaid | PrincipalPaid | FinalBalance |
| --- | --- | --- | --- | --- | --- |
| 1 | $10000.00 | $1030.03 | $54.17 | $975.87 | $9024.13 | 
| 2 | $9024.13 | $1030.03 | $48.88 | $981.15 | $8042.98 |
| 3 |  $8042.98  | $1030.03 | $43.57 | $986.47 | $7056.51 |
| 4  |  $7056.51 |  $1030.03 | $38.22 | $991.81 | $6064.70  |
| 5  |  $6064.70  | $1030.03 | $32.85 | $997.18 | $5067.52  |
| 6  |  $5067.52 |  $1030.03 | $27.45 | $1002.58 | $4064.94  |
| 7  |  $4064.94 |  $1030.03 | $22.02 | $1008.01 | $3056.92  |
| 8  |  $3056.92 |  $1030.03 | $16.56 | $1013.47 | $2043.45  |
| 9  |  $2043.45 |  $1030.03 | $11.07 | $1018.96 | $1024.48  |
| 10 |   $1024.48 |  $1030.03 |  $5.55 | $1024.48  |   $0.00  |

## Program Requirements 
There must be three classes: Client, Account and LoanCalculator. 
 
1. The Account class (the file needs to be Account.java) 
 
	It will hold the required instance data for an account and it will have suitable methods to access and modify the data for an account.       
	The instance variables will be 
	- interestRate – double 
	- numberOfMonths – int 
	- amount – double 
	- accountType – String

	You need to implement at least one constructor, which will initialize the instance variables with values from parameters. The class needs to have methods to change and access all instance variables. It will also have the following methods (at least): 
	- setInterestRate, which will set the value in the interestRate which will depend on the type of the account (as explained above). 
	- calculateMontlyPayment, which will calculate the formula (1) 
	- setAmortizationTable - it will output a String with the table information. 

2. The Client Class (the file needs to be Client.java)  

	It will hold the required instance data for a client and it will have suitable methods to access and modify the data for a client.   
	The instance variables will be: 
	- name – String 
	- age – int 
	- income – double 
	- loan – Account 
	You need to implement at least one constructor that will have the parameters name, age and income. The class needs to have methods to change and access all instance variables.  
 
3. The LoanCalculator Class (the file needs to be LoanCalculator.java)   

	It will receive inputs and show outputs. It will have a Client variable. This is the only class that should have a main method. The class LoanCalculator will also be the only one that will receive inputs and show outputs.  
