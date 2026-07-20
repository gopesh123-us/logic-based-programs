#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int decimalInput;
    char binary[33];
    int index = 0;
    char remainder[20];
    scanf("%d", &decimalInput);
    while(decimalInput > 0){

        int remainder = decimalInput % 2;
        binary[index] = remainder + '0';
        index++;
        decimalInput = decimalInput / 2;

    }
    binary[index] = '\0';

    for(int i = index-1; i >= 0; i--){
        printf("%c", binary[i]);
    }
    return 0;
}
