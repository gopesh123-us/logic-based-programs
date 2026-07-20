digits = int(input())
key = int(input())
counter = 0
while digits != 0:
  d = digits % 10
  if d == key:
    counter = counter + 1
  digits = digits // 10
print(counter)