input = int(input())
original = input;
firstDigit = input % 10;
input = input // 10;
secondDigit = input % 10;
add = firstDigit + secondDigit;
product = firstDigit * secondDigit;
if original == (add + product):
    print("Yes")
else:
    print("No")