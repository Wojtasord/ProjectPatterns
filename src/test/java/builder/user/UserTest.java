package builder.user;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.Fail;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static builder.user.User.*;
import static org.assertj.core.api.Assertions.*;

public class UserTest {
    @DisplayName("Should pass with User with valid mail")
    @Test
    void validateMailPositiveTest() throws Exception
    {
        // given
        User user= aUser().withEmail("dupa@wp.pl").build();
        // when
        boolean result =  user.validateMail();
        // then
        assertThat(result).isTrue();
    }
    @DisplayName("Shuld pass with User with non Valid mail")
    @Test
    void validateMailNegativeTest() throws Exception
    {
        // given
        User user = aUser().withEmail("dupa.pl").build();
        // when
        boolean result = user.validateMail();
        // then
        assertThat(result).isFalse();
    }
}
