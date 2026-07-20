#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

int main()
{
  int digits;
  int total = 0;
  scanf("%d", &digits);
  while (digits != 0)
  {
    if (digits % 10 % 2 != 0)
    {
      total = total + digits % 10;
    }
    digits = digits / 10;
  }
  printf("%d", total);
  return 0;
}
