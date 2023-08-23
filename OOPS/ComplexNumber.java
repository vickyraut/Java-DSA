class ComplexNumber {
    int real;
    int img;

    public ComplexNumber(int r, int i) {
        real = r;
        img = i;
    }

    public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber((a.real + b.real), (a.img + b.img));
    }

    public static ComplexNumber diff(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber((a.real - b.real), (a.img - b.img));
    }

    public static ComplexNumber product(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(((a.real * b.real) - (a.img * b.img)), ((a.real * b.img) + (a.img * b.real)));
    }

    public void printComplexNumber() {
        if (real == 0 && img != 0) {
            System.out.println(img + "i");
        } else if (real != 0 && img == 0) {
            System.out.println(real);
        } else {
            System.out.println(real + "+" + img + "i");
        }
    }

}

class ComplexNumber_Solutions {
    public static void main(String[] args) {
        // Initializing Numbers
        ComplexNumber c1 = new ComplexNumber(4, 5);
        ComplexNumber c2 = new ComplexNumber(9, 4);

        // Performing Operations
        ComplexNumber c3 = ComplexNumber.add(c1, c2);
        ComplexNumber c4 = ComplexNumber.diff(c1, c2);
        ComplexNumber c5 = ComplexNumber.product(c1, c2);

        // Printing Result
        c3.printComplexNumber();
        c4.printComplexNumber();
        c5.printComplexNumber();
    }
}