#include <iostream>
using namespace std;
int power(int a ,int p){
    if (p==0)
    {
        return 1;
    }
    return power(a , p-1)*a;
    
    
}
int main(){
int a ,p;
cin>>a>>p;
cout<<power(a,p);
return 0;
}