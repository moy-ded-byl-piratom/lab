#include "Queue.h"
#include <iostream>
#include <queue>

int main() {
    Queue q;

    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);

    std::cout << q;

    std::cout << "first: " << q.front() << std::endl;
    std::cout << "last: " << q.back() << std::endl;

    q.dequeue();
    std::cout << "After removing the top:" << std::endl;
    std::cout << q;

    return 0;
}

