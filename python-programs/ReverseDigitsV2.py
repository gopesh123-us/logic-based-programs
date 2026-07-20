digits = int(input())
reverse = 0
while digits != 0:
  cld = digits % 10
  reverse = reverse * 10 + cld
  digits = digits // 10
print(reverse)