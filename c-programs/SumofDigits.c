#include <stdio.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>

int main()
{
  int digits;
  int total = 0;
  scanf("%d", &digits);
  while (digits != 0)
  {
    total = total + (digits % 10);
    digits = digits / 10;
  }
  printf("%d", total);
  return 0;
}