#include <iostream>
using namespace std;


void rec(int n)
{
    if (n == 0)
    {
        return;
    }
    cout << "Hello World " << endl;

    return rec(n - 1);
}

int main()
{

    cout << "How-Many-Times" << endl;
    int n;
    cin >> n;
    rec(n);
    return 0;
}