#include <iostream>
using namespace std;
int main(){
int a;
cout<<"Enter the Number to Check Even or Odd"<<endl;
cin>>a;
if ((a&1)==0)
{
    cout<<"Even-Number" <<endl;
}
else
{
    cout<<"Odd-Number"<<endl;
}


return 0;
}