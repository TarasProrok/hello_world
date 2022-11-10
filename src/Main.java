import java.util.Arrays;

class HelloWorld {
    // to track files by git -> git add "filename" or git add -u or git add .
    // to make commit -> git commit -m "your message"
    // to see commit history -> git log
    // to go to other commit -> git checkout "commit hash"
    // to create new branch -> get checkout -b "branch name"
    // to switch to exiting branch -> get checkout "branch name"
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("I`m doing it!");
        int[] arrSource = {1, 2, 3, 4, 5};
        int[] arrTarget = Arrays.copyOf(arrSource, arrSource.length);
        String[] names = {"Taras", "Dima"};
        arrSource[0] = 100;
        System.out.println(arrTarget[0]); // отримаємо 1
        System.out.println(arrSource[0]);
        System.out.println(Arrays.toString(names));
        String skyColor = "black";

        if (skyColor.equals("blue")) {
            System.out.println("На вулиці день");
        } else {
            System.out.println("На вулиці ніч");
        }
    }
}
