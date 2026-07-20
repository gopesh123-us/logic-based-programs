#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

int main()
{
	int n;

	bool isOdd = false;
	bool isEven = false;

	scanf("%d", &n);
	if (n >= 1 && n <= 100)
	{
		if (n % 2 == 0)
		{
			isEven = true;
		}
		else
		{
			isOdd = true;
		}
		if (isOdd == true)
		{
			printf("Weird");
		}
		else if (isEven == true)
		{
			if (n >= 2 && n <= 5)
			{
				printf("Not Weird");
			}
			else if (n >= 6 && n <= 20)
			{
				printf("Weird");
			}
			else if (n > 20)
			{
				printf("Not Weird");
			}
		}
	}

	return 0;
}