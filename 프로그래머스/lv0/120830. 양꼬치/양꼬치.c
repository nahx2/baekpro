#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int k) {
    int answer = 0;
    int y = 12000;
    int u = 2000;
    answer = y*n + (k-(n/10))*u;
    return answer;
}