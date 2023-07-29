#include <iostream>
using namespace std;
void swap(int arr[], int j, int k)
{
    int temp = arr[j];
    arr[j] = arr[k];
    arr[k] = temp;
}
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
    // Sorting

    for (int i = 0; i < n - 1; i++)
    {
        bool swapped = false;
        for (int j = 0; j < n - j - 1; i++)
        {
            if (arr[j] > arr[j + 1])
            {
                swapped = true;
                swap(arr, j, j + 1);
            }
        }
        if (!swapped)
        {
            break;
        }
    }

    ///////////

    for (int i = 0; i < n; i++)
    {
        cout << " " << arr[i];
    }

    return 0;
}