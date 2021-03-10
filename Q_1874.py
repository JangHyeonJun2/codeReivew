def num_line (n, line) :
    stack = []
    num = 1
    # stack에 들어가게 될 1부터 n까지의 오름차순 수열
    line_index = 0
    # stack에 쌓이는 1부터 n까지의 오름차순 수열의 순서 지정값 (ex) [line_index] = [0] / [1] / [2] ...)
    result = []
    # "+"와 "-"가 들어가는 list
    while True :
        if len(stack) == 0 :
            # stack에 아무것도 없는 경우 == 입력값 중 두번째 줄의 입력값이 입력되는 경우
            stack.append(num)
            # stack에 num을 추가함
            result.append("+")
            # stack에 push(+)를 했으니 result에 "+"를 추가
            num += 1

        elif line[line_index] == stack[-1] :
            # line이라는 list에 들어간 숫자들 중 [line_index]번째 수가 stack에 가장 최근값과 같은 경우
            # stack[-1] == stack.top()
            stack.pop()
            # 수열을 만들기 위해 위의 조건에 해당되면 stack의 최근값을 pop(-)한다.
            result.append("-")
            # stack에 pop("-")를 했으니 result에 "-"를 추가
            line_index += 1
            # 이제 문제에서 요구한 수를 stack에서 뽑았으니, line의 2번째 입력값(입력값의 3번째 줄)의 수를 또 뽑기 위해 
            # line_index의 값에 1을 더해줌
            if line_index == n :
                # 만약 line_index가 n과 같아지는 경우, line이라는 list에 해당하는 값이 없으니, break를 건다
                # list의 순서를 셀때는 0부터 시작하기 때문에!
                break

        else :
            if n < num :
                # n이 num보다 작게 된다면, 해결을 하지 못한 채 while문이 계속해서 돌게 된다 == 주어진 입력값같은 수열을 만들 수 없다.
                print("NO")
                break
            stack.append(num)
            # 위의 경우들이 해당 안되는 경우, stack에 num을 넣는다.
            result.append("+")
            num += 1

    if len(stack) == 0 :
        # while을 빠져 나와서 len(stack)이 0이라면
        for i in result :
            print(i)
            # result의 값을 하나씩 print해라

line = list()

n = int(input())
for i in range(n) :
    line.append(int(input()))
    # 첫 입력값이 n이고, 1~n까지의 수를 
    # line이라는 list에 1부터 오름차순으로 넣어라.
num_line(n, line)

