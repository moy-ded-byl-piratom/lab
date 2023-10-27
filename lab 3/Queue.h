#ifndef QUEUE_H
#define QUEUE_H

#include <iostream>
#include <memory>

class Queue {
private:
    struct ListNode {
        int data;
        ListNode* next;
        ListNode(int val) : data(val), next(nullptr) {}
    };
    ListNode* first; // ��������� �� ������ �������
    ListNode* last; // ��������� �� ����� �������
    int n; /
public:
    // �����������: ������������� ������ �������
    Queue() : first(nullptr), last(nullptr), n(0);
    bool empty() const;
    int size();
    void enqueue(int item);
    int dequeue();
    int front() const;
    int back() const;
    friend std::ostream& operator<<(std::ostream& os, const Queue& q);
};

#endif // FIXEDCAPACITYSTACK_H

