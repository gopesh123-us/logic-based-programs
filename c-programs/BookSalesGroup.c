#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int sales;
    scanf("%d", &sales);

    if (sales >= 30 && sales <= 100) {
        if (sales >= 30 && sales <= 50) {
            printf("D");
        } else if (sales >= 51 && sales <= 60) {
            printf("C");
        } else if (sales >= 61 && sales <= 80) {
            printf("B");
        } else {
            printf("A");
        }
    }
    return 0;
}