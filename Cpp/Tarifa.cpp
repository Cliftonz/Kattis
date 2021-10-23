#include <iostream>

int main(){

    int limitPerMonth, numOfMonths, currentAmount, amountUsed;

    std::cin>> limitPerMonth >> numOfMonths;

    currentAmount = limitPerMonth;
    for(int i = 0;  i< numOfMonths; i++){
        
        std::cin>> amountUsed;
        currentAmount = currentAmount - amountUsed;
        currentAmount = currentAmount + limitPerMonth;

    }

    std::cout<< currentAmount;

    return 0;
}