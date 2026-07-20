#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int main()
{
  int cups;
  scanf("%d", &cups);
  if (cups >= 1)
  {
    int freeCups = cups / 6;
    int totalCups = freeCups + cups;
    printf("%d", totalCups);
  }

  return 0;
}