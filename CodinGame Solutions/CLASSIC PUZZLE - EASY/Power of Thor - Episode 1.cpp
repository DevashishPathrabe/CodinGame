#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/

int main()
{
    int lightX; // the X position of the light of power
    int lightY; // the Y position of the light of power
    int initialTX; // Thor's starting X position
    int initialTY; // Thor's starting Y position
    cin >> lightX >> lightY >> initialTX >> initialTY; cin.ignore();
    int thorX = initialTX;
    int thorY = initialTY;
    // game loop
    while (1) {
        int remainingTurns; // The remaining amount of turns Thor can move. Do not remove this line.
        cin >> remainingTurns; cin.ignore();

        // Write an action using cout. DON'T FORGET THE "<< endl"
        // To debug: cerr << "Debug messages..." << endl;
        char *directionX = "";
        char *directionY = "";
        if(thorX > lightX){
            directionX = "W";
            thorX--;
        }
        else if(thorX < lightX){
            directionX = "E";
            thorX++;
        }
        if(thorY > lightY){
            directionY = "N";
            thorY--;
        }
        else if(thorY < lightY){
            directionY = "S";
            thorY++;
        }
        // A single line providing the move to be made: N NE E SE S SW W or NW
        cout << directionY << directionX << endl;
    }
}