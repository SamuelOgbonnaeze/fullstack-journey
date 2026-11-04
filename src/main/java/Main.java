public class Main {
    void main(){

        int x = 0;

        while ( x < 4 ) {
            IO.print("a");

            if (x < 1) {
                IO.print(" ");
            }

            IO.print("n");

            if (x > 1) {
                IO.print(" oyster");
                x = x + 2;
            }

            if (x == 1) {
                IO.print("noys");
            }

            if (x < 1) {
                IO.print("oise");
            }

            IO.println();
            x = x + 1;
        }
    }


}
