digits = int(input("Enter a number: "))
total = 0

while digits != 0:
  n = digits % 10 % 2
  if n == 0:
    total = total + digits % 10
  digits = digits // 10
    
print(total)
  

