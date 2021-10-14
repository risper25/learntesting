import org.junit.Before;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.OngoingStubbing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
class BankTest {

User user=mock(User.class);
@InjectMocks
private Bank bank=new Bank();
    @Before
    public void setup() {
        bank.setUser(user);
        bank.setBalance(200);
    }
    @Test
    @DisplayName("passed this test")
    void getBalance() {
        assertEquals(200,bank.getBalance());
    }

    @Test
    void setBalance() {
        assertEquals(200,bank.getBalance());
    }

    @Test
    @Disabled("not implemented")
    void deposit() {
        bank.deposit(100);
        assertEquals(300,bank.getBalance());
    }


    @Test
    void wirthdraw() {
        bank.wirthdraw(100);
        assertEquals(100,bank.getBalance());
    }

@Test
void getUsername() {
    when(user.getName()).thenReturn("risper");
    assertEquals("risper",bank.getUsername());
    verify(user).getName();
}

@Test
void addcutomertest(){
   doNothing().when(user).setName(anyString());
    //assertEquals(anyString(),bank.getUsername());
    bank.addCustomer("risper");
    verify(user).setName("risper");
}
}