#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int n, a[10], i, d;
    scanf("%d", &n);
    i = 0;
    while (n != 0) {
        d = n % 2;
        a[i++] = d;
        n = n / 2;
    }
    for (i = i - 1; i >= 0; i--) {
        printf("%d", a[i]);
    }

    return 0;
}