#include <iostream>
#include <math.h>
int main(){
    double modernMile;
    std::cin>> modernMile;

    double paces = std::ceil( 1000*((modernMile*5280) /4854)); //convert to modern mile then divide to get equivalant paces

    std::cout<<paces;
    return 0;
}
