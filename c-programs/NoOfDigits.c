#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int digits = 0;
    int counter = 0;
    int d = 0;
    scanf("%d", &digits);
    while (digits != 0) {
        counter = counter + 1;
        digits = digits / 10;
    }
    printf("%d", counter);
    return 0;
}