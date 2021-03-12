N = int(input())
dot_list = []
for i in range(N) :
    i = list(map(int, input().split()))
    dot_list.append(i)
dot_list.sort(key = lambda x : (x[1], x[0]))
for i in dot_list :
    print(i[0],i[1])


# sort는 원형을 변형시켜 정렬한다. 오름차순이 기본값
# sorted는 원형을 변형시키는 것이 아닌, 정렬된 결과를 반환한다.
# lambda를 사용하는 이유는 한줄짜리 간략한 함수를 구현하기 위해서