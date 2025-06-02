//package net.engineeringdigest.journalApp;
//
//import net.engineeringdigest.journalApp.entity.User;
//import net.engineeringdigest.journalApp.repository.UserRepository;
//import net.engineeringdigest.journalApp.service.UserDetailsServiceImpl;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.ArrayList;
//
//import static org.mockito.Mockito.*;
//
//@SpringBootTest
//public class UserDetailsServiceImplTest {
//    @InjectMocks
//    private UserDetailsServiceImpl userDetailsService;
//
//    @Mock
//    private UserRepository userRepository;
//
//    @BeforeEach
//    void setUp(){
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    void loadUserByUsernameTest(){
//        when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(User.builder().userName("abc2").password("hello").roles(new ArrayList<>()).build());
//        UserDetails user= userDetailsService.loadUserByUsername("abc2");
//        Assertions.assertNotNull(user);
//    }
//}
