
public class Complex {
    private double real;
    private double imaginary;
     
    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
     
    /**
     * Get Real part of the Complex number
     * @return  real    Real Number
     */
    public double getReal(){
        return real;
    }
    /**
     * Get imaginary part of the Complex number
     * @return  imaginary       Complex Number
     */
    public double getImaginary(){
        return imaginary;
    }
     
    /**
     * Set real part of the Complex number.
     * @param real  Real Number
     */
    public void setReal(double real){
        this.real = real;
    }
     
    /**
     * Set imaginary part of the Complex number.
     * @param imaginary Imaginary Number
     */
    public void setImaginary(double imaginary){
        this.imaginary = imaginary;
    }
     
    /**
     * Squares this complex number
     * @return  new ComplexNumber   
     */
    public Complex square(){
        double r = real*real - imaginary*imaginary;
        double i = real*imaginary*2;
        return new Complex(r,i);
    }
     
    /**
     * Squares this complex number with the mod of real and imaginary
     * @return  new ComplexNumber   
     */
    public Complex burningShipSquare(){
        real = Math.abs(real);
        imaginary = Math.abs(imaginary);
        double r = real*real - imaginary*imaginary;
        double i = real*imaginary*2;
        return new Complex(r,i);
    }
     
    /**
     * Add Complex Number d to the current Complex Number.
     * @param d     Complex Number to be added.
     */
    public void add(Complex d){
        this.setReal(this.getReal() + d.getReal());
        this.setImaginary(this.getImaginary() + d.getImaginary());
    }
     
    /**
     * Getting the modulus square of the complex number
     * @return  A double representing the modulus square.
     */
    public double modulusSquared(){
        return (real*real) + (imaginary*imaginary);
    }
     
    /**
     * Set complex number to 0+0i.
     */
    public void reset(){
        setReal(0);
        setImaginary(0);
    }
}