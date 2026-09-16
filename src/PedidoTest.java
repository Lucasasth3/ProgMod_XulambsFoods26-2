import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidoTest {
    Pedido pedido;
    Pizza pizzaVazia;
    Pedido pedidoComPizza;
    Pedido vazio;
    

    @BeforeEach 
    public void setUp(){
        pedido = new Pedido();
        pizzaVazia = new Pizza();
        pedidoComPizza = new Pedido();
        pedidoComPizza.adicionarPizza(pizzaVazia);
        vazio = new Pedido();

    }

    @Test
    public void naoAdicionaPizzaEmPedidoFechado(){
        //Arrange
        pedidoComPizza.fecharPedido();

        //Act
        int quantidade = pedido.adicionarPizza(new Pizza());
    
        //Assert
        assertEquals(1, quantidade);
    }


    @Test
    public void AdicionaPizzaEmPedidoAberto(){
        //Arrange
        

        //Act
        int quantidade = pedidoComPizza.adicionarPizza(new Pizza());
    
        //Assert
        assertEquals(2, quantidade);
    }

    @Test 
    public void pedidoVazio(){
        //Act
        double valor = vazio.precoAPagar();
    
        //Assert
        assertEquals(0, valor,0.01);
    }

    @Test 
    public void pedidoComPizza(){
        //Act
        double valor = pedidoComPizza.precoAPagar();
    
        //Assert
        assertEquals(29, valor,0.01);
    }

    @Test 
    public void testeRelatorio(){
        //Act
        String relatorioValido = vazio.relatorio();
    
        //Assert
        assertEquals("Pedido nº 3 - 2026-09-16 (aberto)\nVALOR: R$ 0,00", relatorioValido);
    }


}
