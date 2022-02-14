public class Pro3_64011100 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i < 20; i++) {
            queue.enqueue(i + 1);
        }
        System.out.println("Queue is: ");
        int cou = 0;
        while (!queue.empty()) {
            System.out.print("\t" + queue.dequeue());
            cou++;
            if (cou == 5) {
                System.out.println("");
                cou = 0;
            }
        }
    }
}