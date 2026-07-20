#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int main()
{
  int digits, total = 0;
  scanf("%d", &digits);
  while (digits != 0)
  {
    int lastDigit = digits % 10;

    if (lastDigit % 3 == 0)
    {
      total = total + lastDigit;
    }
    digits = digits / 10;
  }
  printf("%d", total);
  return 0;
}