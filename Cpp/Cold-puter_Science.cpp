
#include <iostream>

int main(){

    int measurements, tempuratures, count = 0;

    std::cin >> measurements;

    for(int i = 0; i < measurements; i++){
        std::cin >> tempuratures;
        if ( tempuratures < 0 ) {
            count++;
        }
        
    }

    std::cout << count;
    return 0;
}