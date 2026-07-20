sales = int(input())

if sales >= 30 and sales <= 100:
  if sales >= 30 and sales <= 50:
    print("D")
  elif sales >= 51 and sales <= 60:
    print("C")
  elif sales >= 61 and sales <= 80:
    print("B")
  else:
    print("A")

