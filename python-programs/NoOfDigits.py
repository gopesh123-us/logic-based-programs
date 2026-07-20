digits = int(input())
counter=0
while digits != 0:
  lastDigit = digits % 10
  counter = counter + 1
  digits = digits // 10
print(counter)

