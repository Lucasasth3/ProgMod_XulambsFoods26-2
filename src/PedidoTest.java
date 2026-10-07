import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidoTest {
    Pedido pedido;
    Pizza pizzaVazia;
<<<<<<< HEAD
    Pedido pedidoComPizza;
    Pedido vazio;
=======

    @BeforeEach 
    public void setUp(){
        pedido = new Pedido();
        pizzaVazia = new Pizza();
        pedido.adicionarPizza(pizzaVazia);
    }
>>>>>>> acb2c111c98ead94a5d9acd75fec7df3a7dcda34
    

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
<<<<<<< HEAD
        pedidoComPizza.fecharPedido();

=======
         pedido.fecharPedido();
>>>>>>> acb2c111c98ead94a5d9acd75fec7df3a7dcda34
        //Act
        int quantidade = pedido.adicionarPizza(new Pizza());
        //Assert
        assertEquals(1, quantidade);
    }

<<<<<<< HEAD

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


=======
    @Test
    public void adicionaPizzasEmPedidoAberto(){
        //Arrange
         pedido.adicionarPizza(pizzaVazia);
        //Act
        int quantidade = pedido.adicionarPizza(new Pizza());
        //Assert
        assertEquals(3, quantidade);
    }

    @Test 
    public void calculaPrecoComUmaPizza(){
        //Act
        double preco = pedido.precoAPagar();
        //Assert
        assertEquals(29d, preco, 0.01);
    }

    @Test 
    public void calculaPrecoComVariasPizzas(){
        //Arrange
        Pizza comIngredientes = new Pizza(2);
        pedido.adicionarPizza(comIngredientes);
        //Act
        double preco = pedido.precoAPagar();
        //Assert
        assertEquals(68d, preco, 0.01);
    }

    @Test 
    public void gerarRelatorioComDetalhes(){
        //Arrange
        pedido.adicionarPizza(new Pizza());
        //Act
        String cupom = pedido.toString();
        assertTrue(
            cupom.contains("2 pizzas") &&
            cupom.contains("58,00")
        );    
    }
>>>>>>> acb2c111c98ead94a5d9acd75fec7df3a7dcda34
}
