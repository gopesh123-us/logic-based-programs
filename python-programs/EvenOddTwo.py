n = int(input())
#print("invalid" if n < 0 else ("even" if n % 2 == 0 else "odd"))
print("invalid" if n < 0 else ("even" if n % 10 % 2 == 0 else "odd"))

