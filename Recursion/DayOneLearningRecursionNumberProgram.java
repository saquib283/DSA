public class DayOneLearningRecursionNumberProgram {
    public static void main(String[] args) {
        print1(1);
    }

    static void print1(int number){
        System.out.println(number);
        print2(number+1);
    }
    static void print2(int number){
        System.out.println(number);
        print3(number+1);
    }
    static void print3(int number){
        System.out.println(number);
        print4(number+1);
    }
    static void print4(int number){
        System.out.println(number);
        print5(number+1);
    }
    static void print5(int number){
        System.out.println(number);
    }
}
