#include<iostream>
using namespace std;

int main() {
	int n;
	int cnum;
	int mnum;
	int mwin = 0;
	int cwin = 0;
	cin >> n;

	for (int i = 0; i < n; i++) {
		cin >> mnum;
		cin >> cnum;

		if (mnum > cnum) {
			mwin++;
		}

		else if (cnum > mnum) {
			cwin++;
		}
		
	}

	if (cwin > mwin) {
		cout << "Chris" << "\n";
	}

	else if (mwin > cwin) {
		cout << "Mishka" << "\n";
	}
	
	else {
		cout << "Friendship is magic!^^" << "\n";
	}


}
