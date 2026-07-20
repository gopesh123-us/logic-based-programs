digits = int(input())
flag = 0
while digits != 0:
  ld = digits % 10
  if ld == 0:
    flag = 1
    break
  digits = digits // 10
if flag == 0:
  print("No")
else:
  print("Yes")