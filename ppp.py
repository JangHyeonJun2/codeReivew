def calc():
    x = int(input())
    y = int(input())

    for i in range (len(str(y))):
        result = int(y/(1*10**i))-int(y/(10*10**i))*10
        print(x*result)
    print(x*y)