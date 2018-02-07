#include <iostream>
#include <cstdlib>
#include <ctime> //seeds, time(), srand(time(0));
using namespace std;


int main() {
    srand(static_cast<unsigned int>(time(0)));
    
    cout << "Amount of numbers(0 = random): ";
    
    int amount;
    cin >> amount;
    
    cout << "Use letters? Y/N: ";
    char choice;
    cin >> choice;
    
    bool useLetters;
    if (choice == 'Y' || choice == 'y'){
        useLetters = true;
    } else {
        useLetters = false;
    }
    
    if (amount == 0){
        amount = rand() % 100;
    }
    
    int numberSet[amount];
    char letterSet[] = {
        'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
        'o','p','q','r','s','t','u','v','w','x','y','z'
    };
    
    cout << endl << endl <<  "Generated numbers: ";
    
    for (int i = 0; i < amount; i++){
        numberSet[i] = rand() % 10;
        
        if (useLetters) {
            int applyChar = rand() % 2;
            if (applyChar == 1){
                cout << letterSet[rand() % 26];
            }
        }
        
        cout << numberSet[i];
    }
    
    cout << endl;
    
    return 0;
}
