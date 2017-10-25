#include <bits/stdc++.h>


using namespace std;

int main() {
  int n;
  string seq;
  
  cin >> n;
  
  for (int i = 0; i < n; i++) {
  	
    cin >> seq;
    sort(seq.begin(), seq.end());
    
    do {
      cout << seq << endl;
    } while (next_permutation(seq.begin(), seq.end()));
    cout << endl;
  }

  return 0;
}
