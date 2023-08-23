class Adult_or_Teen {
    public static void main(String[] args) {
        int age = 18;

        if (age >= 18) {
            System.out.println("Adult: You can(Vote & Drive)");
        } else if (age < 18 && age >= 13) {
            System.out.println("You are a Teenager");
        } else {
            System.out.println("Not Adult");
        }
    }
}