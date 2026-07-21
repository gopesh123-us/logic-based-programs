// LBP20

#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int fib(int n) {
    if (n == 0 || n == 1) {
        return n;
    } else {
        return fib(n - 1) + fib(n - 2);
    }
}

int main() {
    int inputDigit;
    scanf("%d", &inputDigit);
    int result = fib(inputDigit);
    printf("%d", result);

    return 0;
}