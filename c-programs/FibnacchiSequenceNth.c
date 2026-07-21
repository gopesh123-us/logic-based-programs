// LBP20

#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int inputDigit;
    int firstDigit = 1;
    int secondDigit = 1;
    int current = 0;
    scanf("%d", &inputDigit);
    for (int i = 2; i < inputDigit; i++) {
        current = firstDigit + secondDigit;
        firstDigit = secondDigit;
        secondDigit = current;
    }
    printf("%d", current);

    return 0;
}