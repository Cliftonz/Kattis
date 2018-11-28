#include <iostream>

int main() {

	long a, b, c;
	bool bink = false;
	std::cin >> a >> b >> c;

	for (int i = 1; i <= c; i++)
	{
		bool hit1, hit2;
		if (i%a == 0) {
			hit1 = true;
		}
		else {
			hit1 = false;
		}

		if (i%b == 0) {
			hit2 = true;
		}
		else {
			hit2 = false;
		}

		if (hit1 && hit2 == true) {
			bink = true;
			break;
		}
	}
	if (bink == true)
	{
		std::cout << "yes";
	}
	else
	{
		std::cout << "no";
	}

	return 0;
};