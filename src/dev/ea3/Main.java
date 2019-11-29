package dev.ea3;

public class Main {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane", "Jones", 1235));
        stack.push(new Employee("John", "Doe", 5553));
        stack.push(new Employee("Mary", "Smith", 7789));
        stack.push(new Employee("Mike", "Wilson", 0076));
        stack.push(new Employee("Bill", "End", 2333));

//        stack.printStack();

//        System.out.println(stack.peek());
//        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());




    }
}
