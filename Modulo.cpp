
#include <iostream>
#include <set>

int main(){

    std::set<int> set;

    int input = 0;

    for(int i = 0; i < 10; i++){
        std::cin >> input;
         
        input %= input;

        set.insert(input);
    }
    std::cout << set.size;
    return 0;
}