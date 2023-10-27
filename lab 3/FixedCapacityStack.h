#ifndef FIXEDCAPACITYSTACK_H
#define FIXEDCAPACITYSTACK_H

#include <iostream>
#include <memory>

class FixedCapacityStack {
private:
    std::unique_ptr<int[]> a;
    int n;
    int capacity;

public:
    FixedCapacityStack(int capacity);
    ~FixedCapacityStack();
    bool empty() const;
    bool full() const;
    void push(int item);
    int pop();
    int top() const;
    friend std::ostream& operator<<(std::ostream& os, const FixedCapacityStack& st);
};

#endif // FIXEDCAPACITYSTACK_H

