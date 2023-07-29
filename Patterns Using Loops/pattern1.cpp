
#include <iostream>
using namespace std;
int main() {
    
   int rows,cols;
   
   cout<<"Enter Number of Rows"<<endl;
   cin>>rows;
   cout<<"Enter The Number Of columns"<<endl;
   cin>>cols;
   for(int i=1;i<=rows;i++){
       for(int j=1;j<=cols;j++){
           cout<<"*";
       }
       cout<<endl;
   }

    return 0;
}

