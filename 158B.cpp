#include<iostream>
using namespace std;

int main() {

	int n;
	int value;
	int count = 0;
	int groups[4];

	for (int i = 0; i < 4; i++) {
		groups[i] = 0;
	}

	cin >> n;

	for (int counter = 0; counter < n; counter++) {
		cin >> value;
		groups[value - 1]++;
	}

	count = groups[3];

	while (groups[2] > 0 && groups[0] > 0) {
			count++;
			groups[2]--;
			groups[0]--;
	}

	count += groups[2];

	while (groups[1] > 1) {
		count++;
		groups[1] -= 2;
	}

	if (groups[1] == 1) {
		if (groups[0] >= 2) {
			groups[0] -= 2;
		}

		else if (groups[0] == 1) {
			groups[0] -= 1;
		}

		count++;
	}

	if (groups[0] != 0) {
		if (groups[0] % 4 == 0) {
			count += groups[0]/4;
		}
		else {
			count += (groups[0]/4) + 1;
		}
	}

	cout << count << "\n";
}
