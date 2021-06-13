import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests for LargeInteger.
 */
public class LargeIntegerTest {

    private static final String rationalTestCases = "src/test/resources/large-integer.csv";

    @Test
    public void fileTests() {
        try (var scanner = new Scanner(new File(rationalTestCases))) {
            while (scanner.hasNext()) {
                var strA = scanner.next();
                var strB = scanner.next();
                var a = new LargeIntegerSolution(strA);
                var b = new LargeIntegerSolution(strB);
                var complementA = new LargeIntegerSolution(scanner.next());
                var complementB = new LargeIntegerSolution(scanner.next());
                var compareAb = Integer.parseInt(scanner.next());
                var compareBa = Integer.parseInt(scanner.next());
                var plusAb = new LargeIntegerSolution(scanner.next());
                var plusBa = new LargeIntegerSolution(scanner.next());
                var minusAb = new LargeIntegerSolution(scanner.next());
                var minusBa = new LargeIntegerSolution(scanner.next());

                Assertions.assertEquals(complementA, new LargeIntegerSolution(a).ninesComplement(),
                    String.format("%s has wrong 9's complement", strA));
                Assertions.assertEquals(complementB, new LargeIntegerSolution(b).ninesComplement(),
                    String.format("%s has wrong 9's complement", strA));
                Assertions
                    .assertEquals(compareAb,
                        new LargeIntegerSolution(a).compareTo(new LargeIntegerSolution(b)),
                        String.format("%s compared to %b lead to wrong result", strA, strB));
                Assertions
                    .assertEquals(compareBa,
                        new LargeIntegerSolution(b).compareTo(new LargeIntegerSolution(a)),
                        String.format("%s compared to %b lead to wrong result", strB, strA));
                Assertions.assertEquals(plusAb,
                    new LargeIntegerSolution(a).plus(new LargeIntegerSolution(b)),
                    String.format("%s + %s lead to wrong result", strA, strB));
                Assertions.assertEquals(plusBa,
                    new LargeIntegerSolution(b).plus(new LargeIntegerSolution(a)),
                    String.format("%s + %s lead to wrong result", strB, strA));
                Assertions.assertEquals(minusAb,
                    new LargeIntegerSolution(a).minus(new LargeIntegerSolution(b)),
                    String.format("%s - %s lead to wrong result", strA, strB));
                Assertions.assertEquals(minusBa,
                    new LargeIntegerSolution(b).minus(new LargeIntegerSolution(a)),
                    String.format("%s - %s lead to wrong result", strB, strA));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
