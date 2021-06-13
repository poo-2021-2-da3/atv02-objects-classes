import java.util.Arrays;

/**
 * Abstraction of an Integer with arbitrary precision.
 */
public class LargeInteger {

    private final char[] digits = {};

    public LargeInteger() {
        // TODO: implementar
    }

    public LargeInteger(long value) {
        // TODO: implementar
        System.out.println(value); // delete me
    }

    public LargeInteger(LargeInteger value) {
        // TODO: implementar
        System.out.println(value); // delete me
    }

    public LargeInteger(String value) throws IllegalArgumentException {
        // TODO: implementar
        System.out.println(value); // delete me
    }

    public int size() {
        // TODO: implementar
        return 0;
    }

    public LargeInteger plus(LargeInteger value) {
        // TODO: implementar
        return new LargeInteger();
    }

    public LargeInteger ninesComplement() {
        // TODO: implementar
        return new LargeInteger();
    }

    public LargeInteger minus(LargeInteger value) {
        // TODO: implementar
        return new LargeInteger();
    }

    public int compareTo(LargeInteger value) {
        // TODO: implementar
        return 0;
    }

    @Override
    public String toString() {
        // TODO: implementar
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LargeInteger that = (LargeInteger) o;

        return compareTo(that) == 0;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(digits);
    }
}
