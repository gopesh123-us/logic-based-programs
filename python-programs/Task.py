digits = int(input("Enter digits: "))
sum = 0

while digits != 0:
  if (digits % 10) % 2 != 0: 
    sum = sum + (digits % 10)
    digits = digits // 10

print(sum)