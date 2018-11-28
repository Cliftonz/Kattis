#include <iostream>
#include <string>


int main(){

    std::string name;

    std::cin>> name;

    for(int i = 0; i < name.length(); i++  )
    {
        if(name[i]==name[i+1])
        {
            name[i+1] = '0';

            for(int k =0; k< name.length(); k++)
            { 
                if(name[k] == '0')
                {
                    char temp = name[k+1];
                    name[k+1] = name[k];
                    name[k] = temp;
                }
            }
            i--;                                   
        }
    }
    
    for(int i = 0 ; i < name.length(); i++){
        if(name[i] =='0'){
            break;
        }
        else{
            std::cout<<name[i];
        }
    }

    return 0;
}