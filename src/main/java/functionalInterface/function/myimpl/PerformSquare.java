package functionalInterface.function.myimpl;

import java.util.function.Function;

/**
 * Created by sca820 on 04 juni, 2022
 */
public class PerformSquare implements Function<Long, Long> {
    @Override
    public Long apply(Long aLong) {
        return aLong * aLong;
    }
}
