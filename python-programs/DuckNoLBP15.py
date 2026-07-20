import sys
digits = int(input())
counter = 0
while digits != 0:
  d = digits % 10
  counter = counter + 1
  if d == 0:
    if counter < 1:
      if d == 0:
        print("Octal")
        sys.exit()
    print("Yes")
    sys.exit()
  digits = digits // 10
print("No")
  