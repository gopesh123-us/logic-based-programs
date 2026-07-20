// LBP001
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
  int n;
  // printf("Enter an integer\n");
  scanf("%d", &n);
  if (n >= 0)
  {
    if (n % 2 == 0)
    {
      printf("even");
    }
    else
    {
      printf("odd");
    }
  }
  else
  {
    printf("invalid");
  }
  return 0;
}
