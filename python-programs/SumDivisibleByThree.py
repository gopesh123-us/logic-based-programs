digits = int(input())
total = 0
while(digits != 0):
  lastDigit = digits % 10
  if(lastDigit == 3 or lastDigit == 6 or lastDigit == 9):
    total = total + lastDigit
  digits = digits // 10
print(total)