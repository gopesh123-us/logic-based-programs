#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int day;
    char month[20];
    scanf("%19s", month);
    scanf("%d", &day);

    int monthGuess = strcasecmp(month, "July");

    if (monthGuess == 0 && day == 5) {
        printf("%d", 1);
    } else {
        printf("%d", 0);
    }

    return 0;
}