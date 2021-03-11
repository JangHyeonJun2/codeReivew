# 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.



croa = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=','z=']
word = input()
for find in croa :
    word = word.replace(find, '*')
print(len(word))
