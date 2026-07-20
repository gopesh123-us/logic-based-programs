#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int num = 0;
    scanf("%d", &num);
    int total = 0;
    while (num != 0) {
        if (num % 10 % 2 == 0) {
            total = total + (num % 10);
        }
        num = num / 10;
    }

    printf("%d", total);

    return 0;
}