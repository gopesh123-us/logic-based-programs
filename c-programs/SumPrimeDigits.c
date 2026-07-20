#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>

int main()
{

  int digits;
  int total = 0;
  scanf("%d", &digits);
  while (digits != 0)
  {

    for (int i = 1; i <= digits; i++)
    {
      int lastDigit = digits % 10;
      int totalFactors = 0;
      for (int j = 1; j <= lastDigit; j++)
      {
        if (lastDigit % j == 0 && lastDigit != 1)
        {
          totalFactors = totalFactors + 1;
        }
      }
      if (totalFactors == 2)
      {
        total = total + lastDigit;
      }
      digits = digits / 10;
    }
  }
  printf("%d", total);

  return 0;
}