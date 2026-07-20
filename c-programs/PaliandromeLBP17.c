#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
  int original, digits, reverse;
  scanf("%d", &digits);
  original = digits;
  while (digits != 0) {
    int ld = digits % 10;
    reverse = reverse * 10 + ld;
    digits = digits / 10;
  }
  if (original == reverse) {
    printf("%s", "Yes");
  } else {
    printf("%s", "No");
  }

  return 0;
}