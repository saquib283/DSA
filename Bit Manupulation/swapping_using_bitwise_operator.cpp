#include <iostream>
using namespace std;
int main(){
int a=5;
int b=3;

a=a^b;
b=a^b;
a=a^b;

 cout<<"A = "<<a<<endl;
 cout<<"B = "<<b<<endl;
return 0;
}