digits = int(input())
digitsString = str(digits)
reverse_digits = "".join(reversed(digitsString))
for i in reverse_digits:
  print(i, end=" ")