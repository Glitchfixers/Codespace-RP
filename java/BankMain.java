import java.io.*;
import java.io.BufferedReader;

class BankAccount{
    String name;
    int accNo;
    double balance;
    BankAccount(String n, int a, double b){
        name = n;
        accNo = a;
        balance = b < 1000 ? 1000 : b;
    }
    int search(int a){
        return accNo==a ? 1 : 0;
    }
    void deposit(int d){
        balance+=d;
        System.out.println(balance);

    }
    
}

class BankMain{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int acc = Integer.parseInt(br.readLine());
        BankAccount ba = new BankAccount("Ritam",1234,5000);
        if(ba.search(acc)==1){
            ba.deposit(5000);
        }
    }
}