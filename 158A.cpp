#include <iostream>
using namespace std;

int main() {
	
	int n;
	int k;
	int boundary;
	int number = 0;

	cin >> n;
	cin >> k;

	int integerArray[n];

	for (int i = 0; i < n; i++) {
		cin >> integerArray[i];
	}

	boundary = integerArray[k - 1];

	for (int counter = 0; counter < n; counter++) {
		if (integerArray[counter] >= boundary && integerArray[counter] > 0)
			number++;
	}

	cout << number << "\n";

}
