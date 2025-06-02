//package net.engineeringdigest.journalApp;
//
//import net.engineeringdigest.journalApp.entity.User;
//import net.engineeringdigest.journalApp.repository.UserRepository;
//import net.engineeringdigest.journalApp.service.UserService;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ArgumentsSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//@SpringBootTest
//public class UserServiceTests {
//
//
//
//    @Autowired
//    private UserService userService;
//
//    @ParameterizedTest
//    @ArgumentsSource(UserArgumentsProvider.class)
//    public void testSaveNewUser(User user){
//
//        assertTrue(userService.saveNewUser(user));
//    }
//}
