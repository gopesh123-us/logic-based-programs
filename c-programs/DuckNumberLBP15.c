#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
  int digits;
  int flag = 0;
  scanf("%d", &digits);
  while (digits != 0)
  {
    int ld = digits % 10;
    if (ld == 0)
    {
      flag = 1;
      break;
    }
    digits = digits / 10;
  }
  if (flag == 1)
  {
    printf("%s", "Yes");
  }
  else
  {
    printf("%s", "No");
  }
  return 0;
}