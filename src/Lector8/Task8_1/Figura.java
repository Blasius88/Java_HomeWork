package Lector8.Task8_1;


abstract class Figure {
    protected double a;
    protected double b;

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Figure() {}

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public abstract String getName();

    public abstract double getSquare();
}

class Circle extends Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double a, double b) {
        super(a, b);
        radius = Math.min(a, b) / 2;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Figure {
    // катет
    private double leg;

    public double getLeg() {
        return leg;
    }

    public void setLeg(double leg) {
        this.leg = leg;
    }

    public Triangle(double a, double b) {
        super(a, b);
        leg = Math.min(a, b);
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getSquare() {
        return leg * leg / 2;
    }

    public double getPerimeter() {
        return (2 + Math.sqrt(2)) * leg;
    }
}

class Square extends Figure {
    private double x;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Square(double a, double b) {
        super(a, b);
        x = Math.min(a, b);
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getSquare() {
        return x * x;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * x;
    }
}

class Ellipse extends Figure {
    private double semiMajorAxis;
    private double semiMinorAxis;

    public Ellipse(double a, double b) {
        super(a, b);
        semiMajorAxis = Math.max(a, b) / 2;
        semiMinorAxis = Math.min(a, b) / 2;
    }

    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getSemiMinorAxis() {
        return semiMinorAxis;
    }

    public void setSemiMinorAxis(double semiMinorAxis) {
        this.semiMinorAxis = semiMinorAxis;
    }

    @Override
    public String getName() {
        return "Ellipse";
    }

    @Override
    public double getSquare() {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }

    public double getAxisSum() {
        return semiMajorAxis + semiMinorAxis;
    }
}