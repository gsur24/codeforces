#include<iostream>
using namespace std;

int main() {
	
	int n;
	int h;
	int height;
	int over = 0;

	cin >> n >> h;

	for (int i = 0; i < n; i++) {
		cin >> height;

		if (height > h)
			over++;
	
	}

	cout << n + over << "\n";
}
