#include <iostream>
using namespace std;

int fib(int n){
    if (n==1 || n==0)
    {
        return n;
    }
    return fib(n-1)+fib(n-2);
    
}

int main()
{
    int n;

    cout << "How Many No of terms You want" << endl;
    cin >> n;
    cout<<"Fibonacci Series : "<<endl;
    int i=0;
    while (i<n)
    {
        cout<<" "<<fib(i);
        i++;
    }
    
    return 0;
}