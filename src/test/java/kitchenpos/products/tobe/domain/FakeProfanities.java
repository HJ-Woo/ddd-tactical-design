package kitchenpos.products.tobe.domain;

import java.util.Arrays;
import java.util.List;

public class FakeProfanities implements Profanities {

    private static final List<String> profanities;

    static {
        profanities = Arrays.asList("욕설", "비속어");
    }

    @Override
    public boolean contains(final String text) {
        return profanities.contains(text);
    }
}
