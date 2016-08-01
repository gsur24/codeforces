#include<iostream>
using namespace std;

int main() {
	int num = 0;
	int final_num = 0;
	int n;
	int person1 = 0;
	int person2 = 0;
	int person3 = 0;

	cin >> n;

	for (int i = 0; i < n; i++) {
		cin >> person1;
		if (person1 == 1)
			num++;
		cin >> person2;
		if (person2 == 1)
			num++;
		cin >> person3;
		if (person3 == 1)
			num++;
		
		if (num > 1)
			final_num++;
		
		person1 = 0;
		person2 = 0;
		person3 = 0;
		num = 0;
	}

	cout << final_num << "\n";
}

