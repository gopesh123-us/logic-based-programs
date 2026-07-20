#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int n;
    scanf("%d", &n);
    char str[20];
    sprintf(str, "%d", n);
    for (int i = strlen(str) - 1; i >= 0; i--) {
        printf("%c ", str[i]);
    }
    return 0;
}