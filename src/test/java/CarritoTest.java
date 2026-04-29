import org.example.Carrito;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CarritoTest {

    @Test
    void carritoCreadoVacio()
    {
        Carrito car1 = new Carrito();
        assertTrue(true == car1.estaVacio());
    }
}
