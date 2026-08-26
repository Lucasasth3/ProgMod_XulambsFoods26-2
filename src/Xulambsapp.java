import java.util.LinkedList;
import java.util.List;

public class Xulambsapp {

private List<Pizza> listaPizzas;

private void limparTela(){
IO.println("\033[H\033[J");
}

void comprarPizza() {
int adicionais = Integer.parseInt(IO.readln("Quantos ingendientes? "));
Pizza nova = new Pizza(adicionais);
mostrarNota(nova);
listaPizzas.add(nova);
}

void mostrarPizzas(){
for(int i = 0; i<listaPizzas.size(); i++){
mostrarNota(listaPizzas.get(i));
}
}

private void mostrarNota(Pizza pizza) {
IO.println("Pizza Comprada:");
IO.println(pizza.gerarCupom());
IO.println("=================");

}

private void cabecalho(){
limparTela();
IO.println("XULAMBS PIZZA - v0.1");
IO.println("=====================");
}

private int exibirMenu() {
cabecalho();
IO.println("1 - Comprar pizza");
IO.println("2 - Ver todas as pizzas");
IO.println("0 - Sair");
return Integer.parseInt(IO.readln("Digite a sua opção"));
}

private void pausa(){
IO.readln("Digite <ENTER> para continuar");
}


void main(){
int opcao;
listaPizzas = new LinkedList<>();
do{
opcao = exibirMenu();
switch (opcao) {
case 1 -> comprarPizza();
case 2 -> mostrarPizzas();
case 0 -> IO.println("Encerrado!");
default -> IO.println("Opção invalida");

}
pausa();
limparTela();
}while(opcao != 0);

}


}
