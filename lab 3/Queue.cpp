#include "Queue.h"

    // �����������: ������������� ������ �������
    Queue() : first(nullptr), last(nullptr), n(0) {}

    bool empty() const {
        return n == 0;
    }

    int size() {
        return n;
    }
    //��������
    void enqueue(int item) {
        ListNode* newNode = new ListNode(item);
        if (empty()) {
            first = last = newNode;
        }
        else {
            last->next = newNode;
            last = newNode;
        }
        n++;
    }

    // ������� 
    int dequeue() {
        if (empty()) {
            std::cerr << "Queue is empty" << std::endl;
            return -1; 
        }
        int item = first->data;
        ListNode* temp = first;
        first = first->next;
        delete temp;
        n--;
        return item;
    }

    // ������� �������� ������� ������������ �������� � �������
    int front() const {
        if (empty()) {
            std::cerr << "Queue is empty" << std::endl;
            return -1;
        }   
        return first->data;
    }

    // ������� �������� ���������� ������������ �������� � �������
    int back() const {
        if (empty()) {
            std::cerr << "Queue is empty" << std::endl;
            return -1; 
        }
        return last->data;
    }

    // ���������� ��������� << ��� ������ ��������� ������� ����� cout
    friend std::ostream& operator<<(std::ostream& os, const Queue& q) {
        os << "Queue: ";
        ListNode* current = q.first;
        while (current != nullptr) {
            os << current->data << " ";
            current = current->next;
        }
        os << std::endl;
        return os;
    }
};

