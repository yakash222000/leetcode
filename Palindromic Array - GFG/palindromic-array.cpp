//{ Driver Code Starts
#include<iostream>
#include<string.h>
using namespace std;


// } Driver Code Ends
/*Complete the function below*/

class Solution {
public:
    bool isPalindrome(int x){
      string str = to_string(x);
      int len=str.length();
      for(int i=0;i<len/2;i++){
          if(str[i] != str[len - 1 - i]){
              return false;
          }
      }
      return true;
    }
    int PalinArray(int a[], int n){
         for (int i = 0; i < n; i++) {
            if (!isPalindrome(a[i]))
                return 0;
        }
        return 1;
    }
};
    

//{ Driver Code Starts.

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		int a[n];
		for(int i = 0; i < n; i++)
			cin>>a[i];
		Solution obj;
		cout<<obj.PalinArray(a,n)<<endl;
	}
}
// } Driver Code Ends