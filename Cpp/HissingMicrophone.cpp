#include <iostream>
#include <string>

int main(){
    std::string line;
    bool consecutiveS = false;

    std::cin>> line;

    for(int i = 0; i< line.length() - 1 ; i++){
        if(line[i]== 's' && line[i+1] == 's'){
            consecutiveS = true;
            break;
        }
    }
    if(consecutiveS == true){
        std::cout << "hiss";
    }
    else
    {
        std::cout << "no hiss";
    }

    return 0;
}