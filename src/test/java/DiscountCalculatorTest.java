import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountCalculatorTest {

    @Test
    public void FinalPriceWithDiscount() {
        DiscountCalculator calculator = new DiscountCalculator();

        //Test technic is decision table
        // NONE
        assertEquals(100, calculator.calculateFinalPrice(100, DiscountCalculator.MembershipLevel.NONE));
        assertEquals(200, calculator.calculateFinalPrice(200, DiscountCalculator.MembershipLevel.NONE));
        assertEquals(500, calculator.calculateFinalPrice(500, DiscountCalculator.MembershipLevel.NONE));

        // SILVER
        assertEquals(90, calculator.calculateFinalPrice(90, DiscountCalculator.MembershipLevel.SILVER));
        assertEquals(142.5, calculator.calculateFinalPrice(150, DiscountCalculator.MembershipLevel.SILVER));
        assertEquals(475, calculator.calculateFinalPrice(500, DiscountCalculator.MembershipLevel.SILVER));

        // GOLD
        assertEquals(35, calculator.calculateFinalPrice(35, DiscountCalculator.MembershipLevel.GOLD));
        assertEquals(90, calculator.calculateFinalPrice(100, DiscountCalculator.MembershipLevel.GOLD));
        assertEquals(450, calculator.calculateFinalPrice(500, DiscountCalculator.MembershipLevel.GOLD));

        // PLATINUM
        assertEquals(80, calculator.calculateFinalPrice(100, DiscountCalculator.MembershipLevel.PLATINUM));
        assertEquals(160, calculator.calculateFinalPrice(200, DiscountCalculator.MembershipLevel.PLATINUM));
        assertEquals(400, calculator.calculateFinalPrice(500, DiscountCalculator.MembershipLevel.PLATINUM));
    }
}

