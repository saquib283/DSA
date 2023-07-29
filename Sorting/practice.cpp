#include <iostream>
using namespace std;
int BinarySearch(int arr[],int size,int key){
    int start=0;
    int end=size-1;
    while (start <= end)
    {
        int mid = (start+end)/2;
        if (arr[mid]==key)
        {
            return mid;
        }
        if (key>arr[mid])
        {
            start = mid+1;
        }
        else
        {
            end=mid-1;
        }
        mid = start+(end-start)/2;
        


        
        
    }
    return -1;
    
    
}
int main(){
int arr[10]={2,4,6,8,10,12,14,16,18,20};
int key=14;
int size=10;
int index=BinarySearch(arr,size,key);
cout<<"Your Array Is Present at index"<<index<<endl;
return 0;
}