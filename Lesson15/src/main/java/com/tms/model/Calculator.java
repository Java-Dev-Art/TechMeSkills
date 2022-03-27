package com.tms.model;

public class Calculator {
    public static <T extends Number> T sum(T a, T b) {
        if (a == null || b == null) {
            return null;
        }
        if (a instanceof Double && b instanceof Double) {
            return (T) new Double(a.doubleValue() + b.doubleValue());
        } else if (a instanceof Integer && b instanceof Integer) {
            return (T) new Integer(a.intValue() + b.intValue());
        } else if (a instanceof Integer && b instanceof Double) {
            return (T) new Double(a.intValue() + b.doubleValue());
        } else if (a instanceof Double && b instanceof Integer) {
            return (T) new Double(a.doubleValue() + b.intValue());
        } else {
            throw new IllegalArgumentException("Wrong TYPE");
        }
    }

    public static <T extends Number> T multiply(T a, T b) {
        if (a == null || b == null) {
            return null;
        }
        if (a instanceof Double && b instanceof Double) {
            return (T) new Double(a.doubleValue() * b.doubleValue());
        } else if (a instanceof Integer && b instanceof Integer) {
            return (T) new Integer(a.intValue() * b.intValue());
        } else if (a instanceof Integer && b instanceof Double) {
            return (T) new Double(a.intValue() * b.doubleValue());
        } else if (a instanceof Double && b instanceof Integer) {
            return (T) new Double(a.doubleValue() * b.intValue());
        } else {
            throw new IllegalArgumentException("Wrong TYPE");
        }
    }

    public static <T extends Number> T divide(T a, T b) {
        if (a == null || b == null) {
            return null;
        }
        if (a instanceof Double && b instanceof Double) {
            return (T) new Double(a.doubleValue() / b.doubleValue());
        } else if (a instanceof Integer && b instanceof Integer) {
            return (T) new Integer(a.intValue() / b.intValue());
        } else if (a instanceof Integer && b instanceof Double) {
            return (T) new Double(a.intValue() / b.doubleValue());
        } else if (a instanceof Double && b instanceof Integer) {
            return (T) new Double(a.doubleValue() / b.intValue());
        } else {
            throw new IllegalArgumentException("Wrong TYPE");
        }
    }

    public static <T extends Number> T subtraction(T a, T b) {
        if (a == null || b == null) {
            return null;
        }
        if (a instanceof Double && b instanceof Double) {
            return (T) new Double(a.doubleValue() - b.doubleValue());
        } else if (a instanceof Integer && b instanceof Integer) {
            return (T) new Integer(a.intValue() - b.intValue());
        } else if (a instanceof Integer && b instanceof Double) {
            return (T) new Double(a.intValue() - b.doubleValue());
        } else if (a instanceof Double && b instanceof Integer) {
            return (T) new Double(a.doubleValue() - b.intValue());
        } else {
            throw new IllegalArgumentException("Wrong TYPE");
        }
    }
}
