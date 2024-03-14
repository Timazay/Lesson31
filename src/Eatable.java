public interface Eatable {
    int SIZE = 10;

    void eat();


    default int sum(int a, int b){
        return a + b;
    }

}
