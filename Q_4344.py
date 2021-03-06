# 입력 : 첫째 줄에는 테스트 케이스의 개수 C가 주어짐
# 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 <= N <= 1000, N은 정수)이 주어지고,
# 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
# 출력 : 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
N = int(input()) 

for _ in range(N) :
    nums = list(map(int, input().split()))
    average = sum(nums[1:])/nums[0]
    count = 0
    for point in nums[1:] :
        if point > average:
            count += 1
    rate = count/nums[0] * 100
    print(f'{rate:.3f}%')
    
