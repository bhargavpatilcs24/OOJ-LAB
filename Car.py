class Car:
    def __init__(self, name='', year='', price=0,fuel_eff=0):
        self.name=name
        self.year=year
        self.price=price
        self.fuel_eff=fuel_eff

    def store(self):
        self.name=input("Enter The car model name: ")
        self.year=input("Enter the year which it was bought: ")
        self.price=int(input("Enter the price: "))
        self.fuel_eff=int(input("Enter the fuel efficiency: "))
    
    def display(self):
        print("Car model name:",self.name)
        print("The year which it was bought:",self.year)
        print("The on road price:",self.price)
        print("The fuel efficiency:",self.fuel_eff)
c=Car()
c.store()
c.display()