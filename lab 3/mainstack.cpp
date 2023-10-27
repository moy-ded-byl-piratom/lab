#include <iostream>
#include <stack>
#include <string>

bool Balance(const std::string& s) {
    std::stack<char> stack;

    for (char c : s) {
        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
        }
        else if (c == ')' || c == '}' || c == ']') {
            if (stack.empty()) {
                return false; // Нет соответствующей открывающей скобки
            }

            char a = stack.top();
            stack.pop();

            if ((c == ')' && a != '(') ||
                (c == '}' && a != '{') ||
                (c == ']' && a != '[')) {
                return false; // Несоответствие типа скобок
            }
        }
    }

    return stack.empty(); // Если стек пуст, то все скобки сбалансированы
}

int main() {
    std::string input;
    std::cout << "Enter a string with brackets ";
    std::cin >> input;

    if (Balance(input)) {
        std::cout << "YES" << std::endl;
    }
    else {
        std::cout << "NO" << std::endl;
    }

    return 0;
}