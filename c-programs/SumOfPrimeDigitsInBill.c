#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int addPrimes(int n) {
    int sum = 0;
    while (n != 0) {
        int r = n % 10;
        if (r == 2 || r == 3 || r == 5 || r == 7) {
            sum = sum + r;
        }
        n = n / 10;
    }
    return sum;
}

int main() {
    int inputDigit;
    scanf("%d", &inputDigit);
    int result = addPrimes(inputDigit);
    printf("%d", result);
    return 0;
}
