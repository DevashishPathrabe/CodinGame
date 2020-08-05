#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/

int main()
{
    int W; // width of the building.
    int H; // height of the building.
    cin >> W >> H; cin.ignore();
    int N; // maximum number of turns before game over.
    cin >> N; cin.ignore();
    int X0;
    int Y0;
    cin >> X0 >> Y0; cin.ignore();
    int minX = 0, minY = 0;
    int maxX = W - 1;
    int maxY = H - 1;
    // game loop
    while (1) {
        string bombDir; // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
        cin >> bombDir; cin.ignore();

        // Write an action using cout. DON'T FORGET THE "<< endl"
        // To debug: cerr << "Debug messages..." << endl;
        for(int i=0;i<bombDir.size();i++){
            if(bombDir[i] == 'U'){
                maxY = Y0 - 1;
            }
            else if(bombDir[i] == 'D'){
                minY = Y0 + 1;
            }
            if(bombDir[i] == 'L'){
                maxX = X0 - 1;
            }
            else if(bombDir[i] == 'R'){
                minX = X0 + 1;
            }
        }
        X0 = minX + (maxX - minX) / 2;
        Y0 = minY + (maxY - minY) / 2;

        // the location of the next window Batman should jump to.
        cout << X0 << " " << Y0 << endl;
    }
}