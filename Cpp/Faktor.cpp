#include <iostream>
using namespace std;
    int main(){
        int articles, impact;
        std::cin>> articles >> impact;
        int citations = (articles * (impact-1))+1;
        std::cout << citations;
        return 0;
    }
