decimalInput = int(input())
remainder = ''
while decimalInput > 0:
    remainder = str(decimalInput % 2) + remainder
    decimalInput = decimalInput // 2
print(remainder)