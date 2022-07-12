import java.util.Scanner;
import java.util.*;
public class Stack {
    int max = 4;
    int s[] = new int[max];
    int top = -1;

    void push(int ele){
        if(top >=max-1)
            System.out.println("Stack is overflow");
        else
            s[++top] = ele;
    }

    int pop() {
        int z = 0;
        if (top == -1)
            System.out.println("Stack is empty");
        else
            z = s[top--];
        return z;
    }

    void display(){
        if(top == -1)
            System.out.println("Stack underflow");
        else
            System.out.println("Stack elements are");
        for (int i=top;i>-1;i--)
            System.out.println(s[i]+" ");



    }

    public static void main(String[] args) {

        int q = -1;

            Stack m = new Stack();
            System.out.println("Program to perform Stack operation");
            Scanner sc =new Scanner(System.in);
            while (q!=0) {
                System.out.println("ENTER");
                System.out.println("1.push");
                System.out.println("2.pop");
                System.out.println("3.display");
                System.out.println("4.exit");
                System.out.println("enter your choice");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("enter the element to be pushed");
                        int ele = sc.nextInt();
                        m.push(ele);
                        break;

                    case 2:
                        int p;
                        p = m.pop();
                        if (p != 0) {
                            System.out.println("the popped element is " + p);
                            m.display();
                        }
                        break;
                    case 3:
                        System.out.println("elements in the stack are" );
                        m.display();
                        break;
                    case 4:
                        q = 0;
                        break;
                    default:
                        System.out.println("invalid choice");
                }
            }


    }
}

