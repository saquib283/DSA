#include <iostream>
using namespace std;

int main()
{
    // Question is find the ith bit of number.

    // number is 15
    int num = 15;

    // i is the required bit position
    int n = 6;

    int mask = 1 << n;

    int result = num & mask;

    if (result == 0)
    {
        cout << "The nth bit of the number is zero.";
    }
    else
    {
        cout << "The nth bit of the number is one.";
    }
    return 0;
}