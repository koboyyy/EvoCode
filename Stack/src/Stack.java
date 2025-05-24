public class Stack {
    private  int [] stack;
    private int top;
    private int capacity;

    //Konstruktor
    public Stack (int size) {
        capacity = size;
        stack = new int [capacity];
        top = -1;
    }

    //menambahkan elemen ke stack
    public  void push (int item) {
        if (top == capacity - 1) {
            System.out.println("STACK PENUH. tidak bisa menambahkan : " + item);
            return;
        }
        stack[++top] = item;
        System.out.println("Push:" + item);
    }

    //menghapus elemen dari stack
    public  int pop(){
        if (isEmpty()) {
            System.out.println(" Stack kosong. tidak bisa melalkukan pop. ");
            return -1;
        }
        return stack[top--];
    }
    //melihat elemen teratas tanpa menghapus
    public int peak(){
        if (isEmpty()){
            System.out.println("Stack kosong. ");
            return -1;
        }
        return stack[top];
    }
    //mengecek apakah stack kosong
    public boolean isEmpty(){
        return top == 1;
    }
    //Mendapatkan jumlah elemen dalam stack
    public  int size (){
        return  top + 1;
    }
    //Menampilkan isi stack
    public  void printStack() {
        if (isEmpty()){
            System.out.println("Stacfk kosong. ");
            return;
        }
        System.out.println("Isi Stack: ");
        for (int i = 0; i <= top; i++){
            System.out.println(stack[i] + " ");
        }
        System.out.println();
    }
    //Main methood untuk testing
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(9);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(38);

        stack.printStack(); //Untuk menampilkan isi stack

        System.out.println("peak: " + stack.peak()); // untuk melihat elemen teratas

        System.out.println("Pop: " + stack.pop()); //Menghapus elemen teratas
        stack.printStack();

        System.out.println("Ukuran stack: " + stack.size());
        System.out.println("Apakah stack kosong? " + stack.isEmpty());
    }
}