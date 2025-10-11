class BankAccount:
    def __init__(self,name='',bal=0,w=0,d=0):
        self.name=name
        self.bal=bal
        self.w=w
        self.d=d

    def store(self):
        self.name=input("Enter the account holder's name:")
        self.bal=int(input("Enter the current balance:"))
    
    def deposit(self):
        self.d=int(input("Enter the deposit amount:"))
        self.bal+=self.d
        print("Balance after deposit:",self.bal)

    def withdraw(self):
        self.w=int(input("Enter the withdraw amount:"))
        self.bal-=self.w
        print("Balance after withdrawing:",self.bal)

    def display(self):
        print("Balance:",self.bal)

b=BankAccount()
b.store()
b.deposit()
b.withdraw()
b.display()