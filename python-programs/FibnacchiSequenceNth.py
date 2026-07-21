inputDigit = int(input())
firstDigit = 1
secondDigit = 1
start_index = 0;
current = 0
for i in range(start_index + 2, inputDigit):
    current = firstDigit + secondDigit
    firstDigit = secondDigit
    secondDigit = current
    
print(current)
    