import org.example.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ProductoTest {

    //! Precio de un producto sea el del constructor.
    @Test
    void precioProducto(){
        Producto productOne = new Producto("Aguacate" , 2000 , 4);
        assertEquals(2000, productOne.getPrecio());
    }

    //! Producto con stock mayor a cero esta disponible.
    @Test
    void estaDisponible(){
        Producto productOne = new Producto("Aguacate" , 2000 , 1);
        assertTrue(productOne.getStock() > 0);
    }

    //! Stock igual a cero no esta disponible
    @Test
    void noEstaDisponible()
    {
        Producto productOne = new Producto("Aguacate" , 2000 , 0);
        assertEquals(0, productOne.getStock());
    }

    //! Disminuir Stock
    @Test
    void disminuirStock()
    {
        Producto productOne = new Producto("Aguacate" , 2000 , 5);
        productOne.reducirStock(3);
        assertEquals(2, productOne.getStock());
    }

    //! Reducir stock mas de disponible lanza IllegalArgumentException
    @Test
    void disminuirMasDeStock()
    {
        Producto productOne = new Producto("Aguacate" , 2000 , 5);
        Exception exception = assertThrows(IllegalArgumentException.class , () -> productOne.reducirStock(8));
        assertEquals("Stock insuficiente" , exception.getMessage());
    }
    //! Crear producto con precio negativo lanza IllegalArgumentException
    @Test
    void crearPrecioNegativo()
    {
//        Producto productOne = new Producto("Aguacate" , 2000 , 5);
        Exception exception = assertThrows(IllegalArgumentException.class  , () ->{         Producto productOne = new Producto("Aguacate" , -2000 , 5);});
        assertEquals("El precio no puede ser negativo" , exception.getMessage());

    }




}
