// LBP22
#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

const char* isNiven(int inputDigit) {
    int original = inputDigit;
    int sum = 0;
    while (inputDigit != 0) {
        int current = inputDigit % 10;
        sum = sum + current;
        inputDigit = inputDigit / 10;
    }
    if (original % sum == 0) {
        return "Yes";
    } else {
        return "No";
    }
}

int main() {
    /* code */
    int inputDigit;
    scanf("%d", &inputDigit);
    printf("%s", isNiven(inputDigit));
    return 0;
}
