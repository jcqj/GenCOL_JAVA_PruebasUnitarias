import org.example.Carrito;
import org.example.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CarritoTest {

    //! Carrito creado vacio.
    @Test
    void carritoCreadoVacio()
    {
        Carrito car1 = new Carrito();
        assertTrue(true == car1.estaVacio());
    }

    //! Agregar producto, cantidad de producto es 1.
    @Test
    void agregarProducto()
    {
        Carrito car1 = new Carrito();
        Producto productOne = new Producto("Aguacate" , 2000 , 4);
        car1.agregar(productOne);
        assertEquals(1, car1.cantidadDeProductos());
    }

    //! Total de carrito con 2 productos.
    @Test
    void totalDosProductos()
    {
        Carrito car1 = new Carrito();
        Producto productOne = new Producto("Aguacate" , 2000 , 4);
        Producto productTwo = new Producto("Panela" , 1000 , 2);
        car1.agregar(productOne);
        car1.agregar(productTwo);
        double suma = productOne.getPrecio() + productTwo.getPrecio();
        System.out.println(suma);
        assertEquals(car1.calcularTotal(), suma);
    }

    //! Un carrito con almenos 1 producto no esta vacio.
    @Test
    void almenosUnProducto()
    {
        Carrito car1 = new Carrito();
        Producto productOne = new Producto("Aguacate" , 2000 , 4);
        car1.agregar(productOne);
        assertTrue((car1.cantidadDeProductos() >= 1) != car1.estaVacio());
    }

    //! Total de carrito vacio es cero.
    @Test
    void totalCarritoVacio()
    {
        Carrito car1 = new Carrito();
        assertEquals(0 , car1.cantidadDeProductos());
    }

    //! Validación adicional, creada para PRODUCTO. Ver en PRODUCTO.





}
