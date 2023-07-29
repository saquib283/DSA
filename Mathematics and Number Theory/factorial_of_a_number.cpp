#include <iostream>
using namespace std;
int main()
{
    int n;
    cout << "Enter-Number" << endl;
    cin >> n;
    int fact = 1;
    for (int i = 1; i <= n; i++)
    {
        fact = fact * i;  // Example  1*1=1   1*2=2  2*3=6  6*4=24
    }
    cout << fact;

    return 0;
}