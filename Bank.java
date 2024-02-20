
import java.util.Scanner;
class Bank
{
    float balance;
}

class Account extends Bank
{
    String cus_name,acc_type;int acc_no;
    Account(String name,int acc_no,String acc_type)
    {
        this.cus_name=name;this.acc_no=acc_no;this.acc_type=acc_type;balance=0.0f;
    }
    void setBal(float amt)
    {
        balance+=amt;
    }
    void disBal(){
    System.out.println("Balance:Rs "+this.balance);
    }
}

class Sav_acct extends Account
{
    float comp_int,withdrawal;
    Sav_acct(String name,int acc_no,String acc_type)
    {
        super(name,acc_no,acc_type);
    }
    void inter(float rate)
    {
        System.out.println("Interest:"+(balance*rate/100));
        balance+=(balance*rate/100);
    }
}

class Cur_acct extends Account
{
    float comp_int,withdrawal;
    Cur_acct(String name,int acc_no,String acc_type)
    {
        super(name,acc_no,acc_type);
    	balance=0.0f;
    }
    void with(float amt){
        if(amt<balance)
        balance-=amt;
        else
        System.out.println("Amount exceeds balance!");
    if(balance<500)
        {
            System.out.println("No minimum balance maintained!Rs.500 fine levied.");
            balance-=500;
        }
    }
}

class LabQ5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=0,j=0;int ch;boolean t=true,t1=true;
        System.out.println("Enter the number of customers:");
        int n=sc.nextInt();
        Sav_acct a[]=new Sav_acct[n];Cur_acct b[]=new Cur_acct[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the name, Account type and Account number of user" +(i+1)+":");
            String name=sc.next();
            String acc_type=sc.next();
            int acc_no=sc.nextInt();
		
            if(acc_type.equalsIgnoreCase("savings"))
            {
                a[k]=new Sav_acct(name,acc_no,acc_type);
                while(t)
                {
                    System.out.println("Enter 1.Update balance.\n2.Display balance.\n3.Compute and deposit interest.\n4.End");
                    ch=sc.nextInt();
                    switch(ch){
                    case 1:System.out. println("Enter the deposit amount:");
                    a[k].setBal(sc.nextFloat());
                    break;
                    case 2:
                    a[k].disBal();
                    break;
                    case 3:System.out.println("Enter the rate of interest:");
                    a[k].inter(sc.nextFloat());
                    break;
                    case 4:t=false;break;
                    default:System.out.println("Invalid choice");
                    }
                }
                k++;
            }

            if(acc_type.equalsIgnoreCase("current"))
            {
                b[j]=new Cur_acct(name,acc_no,acc_type);
                while(t1)
                {
                    System.out.println("Enter 1.Update balance.\n2.Display balance.\n3.withdraw and update balance.\n 4.End");
                    ch=sc.nextInt();
                    switch(ch){
                    case 1:System.out. println("Enter the deposit amount:");
                    b[j].setBal(sc.nextFloat());
                    break;
                    case 2:
                    b[j].disBal();
                    break;
                    case 3:System.out. println("Enter the withdraw amount:");
                    b[j].with(sc.nextFloat());
                    break;
                    case 4:t1=false;break;
                    default:System.out.println("Invalid choice");
                    }
                }j++;
            }
        }
    }
}
