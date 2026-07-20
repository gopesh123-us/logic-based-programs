#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int main()
{
  int digits;
  scanf("%d", &digits);
  int currentLastDigit = 0;
  int reverse = 0;
  while (digits != 0)
  {
    int currentLastDigit = digits % 10;
    reverse = reverse * 10 + currentLastDigit;
    digits = digits / 10;
  }
  printf("%d", reverse);
  return 0;
}