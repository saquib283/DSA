#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "No. of Element ?" << endl;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cout << "Enter-Element " << i << endl;
        cin >> arr[i];
    }
    //Sorting
    for (int i = 1; i < n; i++)
    {
        int temp = arr[i];
        int j = i - 1;
        while (arr[j] > temp && j >= 0)
        {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = temp;
    }
    ///////////

    for (int i = 0; i < n; i++)
    {
        cout << " " << arr[i];
    }

    return 0;
}