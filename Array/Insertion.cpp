#include <iostream>
using namespace std;
int Insertion(int arr[], int n, int elementTobeInserted, int indexOfInsertion)
{
    for (int i = 0; i < n-1; i++)
    {
        arr[i+1]=arr[i];
    }
    
}

int main()
{

    int n;
    cout << "Enter-No-Of-Element" << endl;
    cin >> n;
    int arr[n];

    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    n = n++;
    int elementTobeInserted;
    int indexOfInsertion;
    Insertion(arr, n, elementTobeInserted, indexOfInsertion);

    return 0;
}