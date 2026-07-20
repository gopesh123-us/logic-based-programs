digits = int(input("Enter digits: "))
total = 0

while digits != 0:
  if (digits % 10) % 2 != 0: 
    total = total + (digits % 10)
  digits = digits // 10

print(total)