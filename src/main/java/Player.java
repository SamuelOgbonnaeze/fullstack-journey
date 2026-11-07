public class Player {
    int number;

    public void guess() {
        number = Integer.parseInt(IO.readln("Enter your guess: ").trim());
    }
}
