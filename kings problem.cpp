#include <iostream>

int camt(int desired, int have){
    return desired- have;// this puts the output to tell the client to remove or add that many pieces
}

int main(){
    int king, queen, rooks, biships, knights, pawns;
    std::cin>>king>>queen>>rooks>>biships>>knights>>pawns;
    std::cout<<camt(1,king)<<camt(1,queen)<<camt(2,rooks)<<camt(2,biships)
        <<camt(2,knights)<<camt(8,pawns);
    return 0;
}