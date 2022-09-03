package optionaldemoone;

import java.util.Optional;
import java.util.function.Function;

import static java.util.Optional.*;

public class DiscountService {

    public String getDiscountLine(Customer customer) {
        return customer.getMemberCard()
                //.flatMap(card -> getDiscountPercentageAsInteger(card))
                .flatMap(this::getDiscountPercentageAsInteger)
                .map(d -> customer.getName() + " gets Discount% " + d)
                .orElse(customer.getName() + " gets Discount% 0");

//        Integer discountPercentage = getDiscountPercentageAsInteger(customer.getMemberCard());
//        return customer.getName() + " gets Discount% " + discountPercentage;
    }

    private int getDiscountPercentage(MemberCard memberCard) {
        if(memberCard.getPoints() >= 100)
            return 10;
        else if(memberCard.getPoints() >= 50)
            return 5;
        return 0;
    }

    private Optional<Integer> getDiscountPercentageAsInteger(MemberCard memberCard) {
        if(memberCard.getPoints() >= 100)
            return of(10);
        else if(memberCard.getPoints() >= 50)
            return of(5);
        return empty();
    }
}
