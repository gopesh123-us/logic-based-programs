#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int original, sum, product, input, firstDigit, secondDigit;
    scanf("%d", &input);
    original = input;
    firstDigit = input % 10;
    input = input / 10;
    secondDigit = input % 10;
    sum = firstDigit + secondDigit;
    product = firstDigit * secondDigit;
    if (original == (sum + product)) {
        printf("%s", "Yes");
    } else {
        printf("%s", "No");
    }
    original = input;

    return 0;
}