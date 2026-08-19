#include <stdio.h>

int main() {
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);

    // code here
   int  d=a^a;
    int e=c^b;
   int f=a&b;
   int g=~e;

    printf("%d %d %d %d\n", d, e, f, g);
    return 0;
}
