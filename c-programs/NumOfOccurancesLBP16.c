#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
  int d, digits, key, counter = 0;
  scanf("%d %d", &digits, &key);
  while (digits != 0) {
    d = digits % 10;
    if (d == key) {
      counter = counter + 1;
    }
    digits = digits / 10;
  }
  printf("%d", counter);

  return 0;
}