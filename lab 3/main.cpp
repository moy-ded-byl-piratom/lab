#include "FixedCapacityStack.h"
#include <iostream>
#include <stack>

int main() {
    FixedCapacityStack stack(5);

    stack.push(10);
    stack.push(20);
    stack.push(30);

    std::cout << "Result: " << stack.top() << std::endl;

    stack.pop();
    std::cout << "After removing the top:" << std::endl;
    std::cout << "Result: " << stack.top() << std::endl;

    return 0;
}

