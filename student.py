class Student:
    def __init__(self, name='', roll='', m1=0, m2=0, m3=0, total=0):
        self.name=name
        self.roll=roll
        self.m1=m1
        self.m2=m2
        self.m3=m3
        self.total=total

    def store(self):
        self.name=input("Enter The student name: ")
        self.roll=input("Enter the roll number: ")
        self.m1=int(input("Enter marks of subject 1: "))
        self.m2=int(input("Enter marks of subject 2: "))
        self.m3=int(input("Enter marks of subject 3: "))
    
    def add(self):
        self.total=self.m1 + self.m2 + self.m3
    
    def display(self):
        print("Details of student:")
        print("Student name:",self.name)
        print("Roll number:",self.roll)
        print("Marks 1:",self.m1)
        print("Marks 2:",self.m2)
        print("Marks 3:",self.m3)
        print("Total marks:",self.total)
    
s1=Student()
s1.store()
s1.add()
s1.display()
