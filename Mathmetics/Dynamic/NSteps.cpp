/*
 * NSteps.cpp
 *
 *  Created on: 2015-4-28
 *      Author: ivan
 */

#include<iostream>
using namespace std;

int ways[10000];
int N;
//one man go N steps,every step,he can cross 1,2,3steps
//how many ways he has to cross all the N steps

int countWays(int n){
	if(ways[n]==-1){
		if(n<=0){
			return 0;
		}
		else {
			ways[n]=countWays(n-1)+countWays(n-2)+countWays(n-3);
		}
	}

	return ways[n];
}

int main(){
	for(int i=0;i<10000;i++){
		ways[i]=-1;
	}
	ways[1]=1;
	ways[2]=2;
	ways[3]=4;

	cout<<countWays(5);

	return 0;
}
