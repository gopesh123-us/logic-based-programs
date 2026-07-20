digit = int(input());
while digit != 0:
  result = digit % 10
  print(result, end=" ") 
  digit = digit // 10
  