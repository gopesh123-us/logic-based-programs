inputDigit = int(input())
original = inputDigit
sum = 0
while inputDigit != 0:
    current = inputDigit % 10 
    sum = current + sum
    inputDigit = inputDigit // 10
if original % sum == 0:
    print("Yes")
else: 
    print("No")