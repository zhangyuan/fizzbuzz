public class FizzBuzz {
    private int from;
    private int to;

    public FizzBuzz(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public String[] perform() {
        String[] result = new String[this.to];

        for (int i = 0; i < this.to; i ++) {
            int number = i + 1;
            if (number % 3 == 0 && number % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (number % 3 == 0) {
                result[i] = "Fizz";
            } else if ( number % 5 == 0) {
                result[i] = "Buzz";
            }
            else {
                result[i] = String.valueOf(number);
            }

        }
        return result;
    }
}
