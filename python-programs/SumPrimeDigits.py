digits = int(input())
total = 0
while (digits != 0):
  for j in range(1, digits):
    lastDigit = digits % 10
    totalFactors = 0
    for i in range(1, lastDigit + 1):
      if lastDigit % i == 0 and lastDigit != 1:
        totalFactors = totalFactors + 1
    if totalFactors == 2:
        total = total + lastDigit    
      
    digits = digits // 10

print(total)

