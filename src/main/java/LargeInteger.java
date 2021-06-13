import java.util.Arrays;

/**
 * Abstraction of an Integer with arbitrary precision.
 */
public class LargeInteger {

    private final char[] digits = {};

    public LargeInteger() {
        // TODO: completar
    }

    public LargeInteger(long value) {
        // TODO: completar
    }

    public LargeInteger(LargeInteger value) {
        // TODO: completar
    }

    public LargeInteger(String value) throws IllegalArgumentException {
        // TODO: completar
    }

    public int size() {
        // TODO: completar
        return 0;
    }

    public LargeInteger plus(LargeInteger value) {
        // TODO: completar
        return new LargeInteger();
    }

    public LargeInteger ninesComplement() {
        // TODO: completar
        return new LargeInteger();
    }

    public LargeInteger minus(LargeInteger value) {
        // TODO: completar
        return new LargeInteger();
    }

    public int compareTo(LargeInteger value) {
        // TODO: completar
        return 0;
    }

    @Override
    public String toString() {
        // TODO: completar
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
