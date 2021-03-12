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
    
    # for j in range(num[2]) :
#         num[0] != len(floor_list)
#         floor_list.append(1)
#         if num[2] > num[0] :
            
    # if num[0] == len(floor_list) :
    #     for k in range(num[1]) :
    #         num[1] != len(room_list)
    #         room_list.append(1)
    #         print(floor_list)
        
    