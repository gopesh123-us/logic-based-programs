def addPrimes(n):
    sum = 0;
    while(n!=0):
        r = n % 10;
        if r == 2 or r == 3 or r == 5 or r == 7: 
            sum = sum + r
        n = n // 10
    return sum

intputDigit = int(input())
print(addPrimes(intputDigit))