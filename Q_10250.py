T = int(input())

for i in range(T) :
    h, w, n = list(map(int, input().split()))
    if h >= n :
        print(n*100+1)
    else :                    
        if n%h == 0 :
            print(int((h*100)+(n/h)))
        else : 
            print(int((n%h)*100+((n/h)+1)))
