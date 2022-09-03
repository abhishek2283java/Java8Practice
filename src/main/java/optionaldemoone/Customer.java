package optionaldemoone;

import java.util.Optional;

import static java.util.Optional.ofNullable;

public class Customer {
    private String name;
    private MemberCard memberCard;

    public Customer(String name, MemberCard memberCard) {
        this.name = name;
        this.memberCard = memberCard;
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Optional<MemberCard> getMemberCard() {
        return ofNullable(memberCard);
    }
}
