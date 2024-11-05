class ComplexNumbers {

    // variables to hold real and imaginary parts of the complex number
    int real, image;

    // Constructor for initializing complex numbers
    public ComplexNumbers(int r, int i) {
        this.real = r;
        this.image = i;
    }

    // Method to print the complex number
    public void showC() {
        System.out.println(this.real + " +i " + this.image);
    }

    // Method to add two complex numbers
    public ComplexNumbers add(ComplexNumbers c1, ComplexNumbers c2) {
        // Adding the real and imaginary parts separately
        int newReal = c1.real + c2.real;
        int newImage = c1.image + c2.image;
        // Returning the result as a new ComplexNumber object
        return new ComplexNumbers(newReal, newImage);
    }

    public static void main(String[] args) {
        ComplexNumbers c1 = new ComplexNumbers(3, 2);
        ComplexNumbers c2 = new ComplexNumbers(1, 7);

        ComplexNumbers result = c1.add(c1, c2);
        result.showC();
    }
}
