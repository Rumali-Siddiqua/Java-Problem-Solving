class Account{
 
  String name;
  double balance;
  Account(){
    name="Default Account";
    balance=0.0;
  }
  
  Account(String name,double balance){
    this.name=name;
    this.balance=balance;
  }
  
  String nameKi(){
    return name;
  }
  double balanceKi(){
     return balance;
  }
  
  void nameBoshao(String name){
    this.name=name;
  }
  void balanceBoshao(double balance){
     this.balance=balance;
  }
  
  void withdraw(double amount){
    double restBalance=balance-amount;
    if(restBalance<=100){
      System.out.println("The account balance after deducting withdraw amount is equal to or less than minimum. Cannot withdraw");
    }
    else{
     balance= balance-amount;
     System.out.println("Withdraw successful! New balance is: "+balance);
      
    }   
  }  
}


  
  
  
  
  
  
  
  
