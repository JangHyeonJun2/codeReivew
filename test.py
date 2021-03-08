a=input()
b=input()
a=int(a)
b=int(b)
num1 = a*(b%10)
num2 = (a*((b%100)-(b%10)))/10
num3 = (a*(b-(b%100)))/100
num1 = int(num1)
num2 = int(num2)
num3 = int(num3)
print(num1)
print(num2)
print(num3)
print(a*b)