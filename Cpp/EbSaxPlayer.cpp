#include <iostream>
#include <string>

int main(){
    int numTestCases;
    
    std::cin>> numTestCases;
    for(int i = 0; i< numTestCases; i++){
        int finger [10];
        std::string line;
        std::cin>> line;

        for(int j = 0; j < line.length(); j++){
           switch(line[j]){
                case 'c':
                finger[1]++;
                finger[2]++;
                finger[3]++;
                finger[6]++;
                finger[7]++;
                finger[8]++;
                finger[9]++;
                break;
                case 'd':
                finger[1]++;
                finger[2]++;
                finger[3]++;
                finger[6]++;
                finger[7]++;
                finger[8]++;
                break;
                case 'e':
                finger[1]++;
                finger[2]++;
                finger[3]++;
                finger[6]++;
                finger[7]++;
                break;
                case 'f':
                finger[1]++;
                finger[2]++;
                finger[3]++;
                finger[6]++;
                break;
                case 'g':
                finger[1]++;
                finger[2]++;
                finger[3]++;
                break;
                case 'a':
                finger[1]++;
                finger[2]++;
                break;
                case 'b':
                finger[1]++;
                break;
                case 'C':
                finger[2]++;
                break;
                case 'D':
                finger[0]++;
                finger[1]++;
                finger[2]++;
                finger[3]++;
                finger[6]++;
                finger[7]++;
                finger[8]++;
                break;
                case 'E':
                finger[0]++;
                finger[1]++;
                finger[2]++;
                finger[3]++;
                finger[6]++;
                finger[7]++;
                break;
                case 'F':
                finger[0]++;
                finger[1]++;
                finger[2]++;
                finger[3]++;
                finger[6]++;
                break;
                case 'G':
                finger[0]++;
                finger[1]++;
                finger[2]++;
                finger[3]++;
                break;
                case 'A':
                finger[0]++;
                finger[1]++;
                finger[2]++;
                break;
                case 'B':
                finger[0]++;
                finger[1]++;
                break;
           }
        }
        for(int k = 0; k < 10; k++)
        {
            std::cout<< finger[k]<< " ";
        }
        std::cout << std::endl;
    }

    return 0;
}