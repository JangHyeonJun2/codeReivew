# # 각 케이스마다 한 줄씩 평균을 넘는 
# # 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.

# 5
# 5 50 50 70 80 100
# 7 100 95 90 80 70 60 50
# 3 70 90 80
# 3 70 90 81
# 9 100 99 98 97 96 95 94 93 91

n = int(input())

for i in range(0, n):
    l = input().split()
    sum = 0

    for  j in range (1, len(l)):
        sum += int(l[j])

    avg = sum / int(l[0])

    cnt=0
    for k in range (1, len(l)) :
        if int(l[k]) > avg :
         cnt += 1

    per = cnt / int(l[0]) * 100
    # print(f'{per:.3f}%')
    print("%.3f" % per + "%")
