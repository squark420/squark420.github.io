// 30.10 skwarek.cpp : Ten plik zawiera funkcję „main”. W nim rozpoczyna się i kończy wykonywanie programu.
//

#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;

// zadanie 1
//int main()
//{
//    
//    int wynik=0;
//    int limit, druga, a, b;
//
//    cin >> a >> b;
//
//
//    if (a > b) {
//        limit = a;
//        druga = b;
//    }
//    else {
//        limit = b;
//        druga = a;
//    }
//    
//    for (int i = druga; i <= limit; i++) {
//        cout << i << endl;
//        wynik += i;
//    }
//    cout <<"suma wszystkich:"<<endl << wynik;
//
//}

//zadanie 2
int main() {
	int liczba;
	float sredniaar=0,sredniage;
	int counter=0;
	int pierwsza;
	float wynik;

	while (true){
		cin >> liczba;
		if (liczba == 0) {
			sredniaar = sredniaar / counter;
			sredniage = sredniage / pierwsza;
			wynik = pow(sredniage,(1/int(counter)));
			cout << endl << "srednia arytmetyczna:" << sredniaar << endl << "srednia geometryczna:" <<wynik<<endl;
			break;
		}
		else {
			if (counter == 0) {
				sredniage = liczba;
				pierwsza = liczba;
			}
			counter++;
			sredniaar = sredniaar + liczba;
			sredniage = sredniage * liczba;
		}
	}
	
}

//zadanie 3
//int main() {
//
//	int a = 0, b = 10;
//	const double pi = 3.1415926536;
//	cout << setw(3) << "x" << setw(14) << "log(x)" << setw(14) << "sin(2pix/20)"<<endl;
//	for (float x = a; x <= b; ++x) {
//		double f1, f2;
//		f1 = log(x);
//		f2 = sin(x / 20 * 2 * pi);
//		cout << setw(3) << x << setw(14) << f1 << setw(14) << f2<<endl;
//	}
//}

