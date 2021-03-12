while True :
    bracket = input()
    if bracket == "." :
        break
    # 문제에서 "." 으로 끝나는 괄호가 없는 경우에도 균형잡힌 문자열로 간주 할 수 있다고 설명
    stack = []
    # stack의 초기화
    answer = True

    for i in bracket :
        if i == "(" or i =="[" :
            # input값인 bracket에 ( 혹은 [가 있다면
            stack.append(i)
            # stack에 그 값을 추가한다.
        elif i == ")" :
            if len(stack) == 0:
                # 만약 ) 가 가장 먼저 있다면, len(stack)이 0일 경우 flase
                answer = False
                break
            if stack[-1] == "(" :
                # stack에서 [-1]은 top과 같은 의미로, 
                # stack의 마지막 값을 pop처럼 빼는 것이 아닌 그냥 가져오기만 하는 것
                # 가져왔을 때의 값과 ( 이 일치한다면
                stack.pop()
                # ( 을 빼버린다. -> stack을 비우기 위해서
            else :
                answer = False
                break
            # 아무 괄호도 없는 문장인 경우("."만 있는 경우 제외)
        elif i == "]" :
            # ] 의 경우에는 위의 )가 왔을 때, ( 가 왔을 때와 동일
            if len(stack) == 0 :
                answer = False
                break
            if stack[-1] == "[":
                stack.pop()
            else :
                answer = False
                break

    if answer and not stack :
        print("yes")
    else :
        print("no")
