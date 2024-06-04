public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(45);
        stack.push(13);
        stack.push(18);
        stack.push(20);
        stack.push(15);
        stack.pop();


        stack.printStack();
    }
}
