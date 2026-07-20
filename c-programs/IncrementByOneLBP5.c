#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int n;
    // printf("Enter integer: \n");
    scanf("%d", &n);
    if (n >= 0) {
        n = n + 1;
        printf("%d\n", n);
    }
    return 0;
}