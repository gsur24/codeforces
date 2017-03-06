#include <vector>
#include <string>
#include <iostream>
#include <unordered_set>
using namespace std;
int main() {
	
	// get the input
	int n;
	int sock;
	cin >> n;
	vector<int> pairs;
	for (int i = 0; i < 2*n; i++) {
		cin >> sock;
		pairs.push_back(sock);
	}

  int max = 0;
	auto start = pairs.begin();
	auto end = pairs.end();
  unordered_set<int> table;
	while (start != end) {
		sock = *start;
		if (table.find(sock) != table.end()) {
			table.erase(sock);
		}

		else {
			table.insert(sock);
			if (table.size() > max) {
				max = table.size();
			}
		}
		start++;	
	}

	cout << max << endl;

}
