#include<iostream>
using namespace std;

int main() {

	int n;
	cin >> n;

	int inputArray[n];
	for (int i = 0; i < n; i++) {
		cin >> inputArray[i];
	}

	int outputArray[n];

	outputArray[n - 1] = inputArray[n - 1];

	for (int index = n - 2; index >= 0; index--) {
		outputArray[index] = inputArray[index] + inputArray[index + 1];
	}

	for (int counter = 0; counter < n; counter++) {
		cout << outputArray[counter] << " ";
	}


}
