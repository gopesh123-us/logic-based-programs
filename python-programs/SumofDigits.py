digits = int(input())
total = 0

while (digits != 0):
  total = total + (digits % 10 )
  digits = digits // 10

print(total)
