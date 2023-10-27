#include "FixedCapacityStack.h"

FixedCapacityStack::FixedCapacityStack(int capacity) : capacity(capacity), n(0) {
    a = new int[capacity];
}

FixedCapacityStack::~FixedCapacityStack() {
    delete[] a;
}

bool FixedCapacityStack::empty() const {
    return n == 0;
}

bool FixedCapacityStack::full() const {
    return n == capacity;
}

void FixedCapacityStack::push(int item) {
    if (full()) {
        std::cerr << "Stack is full" << std::endl;
        return; // assert()
    }
    a[n++] = item;
}

int FixedCapacityStack::pop() {
    if (empty()) {
        std::cerr << "Stack is empty" << std::endl;
        return -1;
    }
    return a[--n];
}

int FixedCapacityStack::top() const {
    if (empty()) {
        std::cerr << "Стек пуст. Вершина стека не определена." << std::endl;
        return -1; 
    }
    return a[n - 1];
}

std::ostream& operator<<(std::ostream& os, const FixedCapacityStack& st) {
    os << "Stack: ";
    for (int i = st.n - 1; i >= 0; --i) {
        os << st.a[i] << " ";
    }
    os << std::endl;
    return os;
}

