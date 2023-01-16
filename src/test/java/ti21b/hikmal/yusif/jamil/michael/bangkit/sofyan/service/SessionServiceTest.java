package ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.service;

import ti21b.hikmal.yusif.jamil.michael.bangkit.sofyan.service.SessionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class SessionServiceTest {

    @Test
    void testCreate() throws IOException {
        SessionService.create("sedhayu", "Sedhayu");
    }

    @Test
    void testCurrent() throws IOException {
        SessionService.create("sedhayu", "Sedhayu");
        var user = SessionService.current();
        Assertions.assertEquals("sedhayu", user.getId());
    }

    @Test
    void testDestroy() throws IOException {
        SessionService.destroy();
    }

}
