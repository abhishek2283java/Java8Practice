package optionaldemoone;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountServiceTest {

    @Test()
    @Tag("Rel1")
    void shouldGetDiscountLineAs10percentForCustomerWithCardPoint100() {
        DiscountService service = new DiscountService();
        String discountLine = service.getDiscountLine(new Customer("Jack", new MemberCard(100)));
        System.out.println(discountLine);
    }

    @Test
    @Tag("Rel1")
    void shouldGetDiscountLineAs5percentForCustomerWithCardPoint50() {
        DiscountService service = new DiscountService();
        String discountLine = service.getDiscountLine(new Customer("Sara", new MemberCard(50)));
        System.out.println(discountLine);
    }

    @Test
    @Tag("Rel2")
    void shouldGetDiscountLineAs0percentForCustomerWithCardPoint10() {
        DiscountService service = new DiscountService();
        String discountLine = service.getDiscountLine(new Customer("Matt", new MemberCard(10)));
        System.out.println(discountLine);
    }

    @Test
    @Tag("Rel2")
    void shouldGetDiscountLineAsZeroPercentForCustomerWithNoCard() {
        DiscountService service = new DiscountService();
        String discountLine = service.getDiscountLine(new Customer("Bill"));
        System.out.println(discountLine);
    }
}