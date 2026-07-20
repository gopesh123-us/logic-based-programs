#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>

int main()
{
  int n;
  scanf("%d", &n);

  while (n != 0)
  {
    int result = n % 10;
    printf("%d ", result);
    n = n / 10;
  }

  return 0;
}