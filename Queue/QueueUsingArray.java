package DSA.Queue;
//Queue Using Array
public class QueueUsingArray {

    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;

        Queue(int size){
            arr=new int[size];
            Queue.size=size;
        }

        public static boolean isempty() {
            return rear ==-1;
        }

        public static void addData(int data) {
            if(rear==size-1){
                System.out.println("Queue Full !!!!");
                return;      
            }

            rear++;
            arr[rear]=data;
        }

        public static int remove() {
            if(isempty()){
                System.out.println("Queue Empty !!!!");
                return -1;
            }
            int front=arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i]=arr[i+1];
            }
            rear--;
            return  front;
        }

        public static int peek() {
            if(isempty()){
                System.out.println("Queue Empty !!!!");
                return -1;
            }
            return arr[0];
        }
        
    }

    public static void main(String[] args) {
        Queue q=new Queue(5);
        Queue.addData(1);
        Queue.addData(1);

    }

    
}
