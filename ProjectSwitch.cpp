#include <iostream>
#include <string>

using namespace std;

int step(int ch, int st) {
    if (st == 0) {
        return 1;
    }
    int res = ch;
    for (int i = 0; i != st - 1; i++) {
        res *= ch;
    }
    return res;
}

string reverse(string ch) {
    string res = "";
    for (int i = ch.length() - 1; i >= 0; i--) {
        res += ch[i];
    }
    return res;
}

int main() {
    setlocale(0, "");
    cout << "Выберите, куда переводим(1 - из двоичной в десятичную, 2 - из десятичной в двоичную): ";
    string rv = "", ch = "", rs = "";
    int sw = 0, res = 0, sg = 0;
    cin >> sw;
    switch (sw) {
        case 1:
            cout << "Введите двоичное число: ";
            cin >> ch;
            rv = reverse(ch);
            for (int i = 0; i != rv.size(); i++) {
                if (rv[i] == '1') {
                    res += step(2, i);
                }
            }
            cout << "Результат: " << to_string(res) << endl;
            break;
        case 2:
            cout << "Введите десятичное число: ";
            cin >> sg;
            while (sg != 0) {
                if (sg % 2 == 1) {
                    sg -= 1;
                    sg /= 2;
                    rs += "1";
                }
                else {
                    sg /= 2;
                    rs += "0";
                }
            }
            cout << "Результат: " << reverse(rs) << endl;
            break;
        default:
            cout << "Неверный номер действия!" << endl;
            return -1;
    }
    return 0;
}
