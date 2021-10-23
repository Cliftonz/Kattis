#include <iostream>

int main(){

    int month = 3;
    int STARTYEAR = 2018;
    int year= 0;
    int inputYear;
    std::cin >> inputYear;
    
    while(year + STARTYEAR < inputYear){
        month += 26;
        year += month / 12;
        month = month % 12;
    }

    if(year + STARTYEAR == inputYear){
    std::cout<<"yes";
    } 
    else{
    std::cout<<"no";
    }
    return 0;
}