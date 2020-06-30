package sdu.edu.medium;
// 我们遇到什么困难也不要怕，微笑着面对他，消除恐惧的最好办法就是面对恐惧。坚持，才是胜利！加油！奥利给！

/*
 * @Author: 刘伯栋
 * DateTime: 2020-06-30 08:07:55
 * Version: 1.0
 * Description: https://leetcode-cn.com/problems/design-circular-deque
 */

public class DesignCircularDeque {

    public static void main(String[] args) {
        MyCircularDeque circularDeque = new MyCircularDeque(3); // 设置容量大小为3
        System.out.println(circularDeque.insertLast(1)); // 返回 true
        System.out.println(circularDeque.insertLast(2)); // 返回 true
        System.out.println(circularDeque.insertFront(3)); // 返回 true
        System.out.println(circularDeque.insertFront(4)); // 已经满了，返回 false
        System.out.println(circularDeque.getRear()); // 返回 2
        System.out.println(circularDeque.isFull()); // 返回 true
        System.out.println(circularDeque.deleteLast()); // 返回 true
        System.out.println(circularDeque.insertFront(4)); // 返回 true
        System.out.println(circularDeque.getFront()); // 返回 4
    }


    public static class MyCircularDeque {

        // 1、不用设计成动态数组，使用静态数组即可
        // 2、设计 head 和 tail 指针变量
        // 3、head == tail 成立的时候表示队列为空
        // 4、tail + 1 == head

        private int capacity;
        private int[] arr;
        private int front;
        private int rear;

        /**
         * Initialize your data structure here. Set the size of the deque to be k.
         */
        public MyCircularDeque(int k) {
            capacity = k + 1;
            arr = new int[capacity];

            // 头部指向第 1 个存放元素的位置
            // 插入时，先减，再赋值
            // 删除时，索引 +1（注意取模）
            front = 0;
            // 尾部指向下一个插入元素的位置
            // 插入时，先赋值，再加
            // 删除时，索引 -1（注意取模）
            rear = 0;
        }

        /**
         * Adds an item at the front of Deque. Return true if the operation is successful.
         */
        public boolean insertFront(int value) {
            if (isFull()) {
                return false;
            }
            front = (front - 1 + capacity) % capacity;
            arr[front] = value;
            return true;
        }

        /**
         * Adds an item at the rear of Deque. Return true if the operation is successful.
         */
        public boolean insertLast(int value) {
            if (isFull()) {
                return false;
            }
            arr[rear] = value;
            rear = (rear + 1) % capacity;
            return true;
        }

        /**
         * Deletes an item from the front of Deque. Return true if the operation is successful.
         */
        public boolean deleteFront() {
            if (isEmpty()) {
                return false;
            }
            // front 被设计在数组的开头，所以是 +1
            front = (front + 1) % capacity;
            return true;
        }

        /**
         * Deletes an item from the rear of Deque. Return true if the operation is successful.
         */
        public boolean deleteLast() {
            if (isEmpty()) {
                return false;
            }
            // rear 被设计在数组的末尾，所以是 -1
            rear = (rear - 1 + capacity) % capacity;
            return true;
        }

        /**
         * Get the front item from the deque.
         */
        public int getFront() {
            if (isEmpty()) {
                return -1;
            }
            return arr[front];
        }

        /**
         * Get the last item from the deque.
         */
        public int getRear() {
            if (isEmpty()) {
                return -1;
            }
            // 当 rear 为 0 时防止数组越界
            return arr[(rear - 1 + capacity) % capacity];
        }

        /**
         * Checks whether the circular deque is empty or not.
         */
        public boolean isEmpty() {
            return front == rear;
        }

        /**
         * Checks whether the circular deque is full or not.
         */
        public boolean isFull() {
            // 注意：这个设计是非常经典的做法
            return (rear + 1) % capacity == front;
        }
    }

}
