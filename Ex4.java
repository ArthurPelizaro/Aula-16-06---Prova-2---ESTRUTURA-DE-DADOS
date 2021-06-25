import java.util.Scanner;
import util.Pilha;

public class Exercicio3 {
 public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 int op;
 Pilha<String> p = new Pilha<String>();
 
 do {
 System.out.println("\n1 - Empilhar elemento");
 System.out.println("2 - Desempilhar elemento");
 System.out.println("3 - Mostrar topo");
 System.out.println("4 - Imprimir tudo zerando a pilha");
 System.out.println("5 - Sair");
 System.out.print("Digite uma opção: ");
 op = Integer.parseInt(sc.nextLine());

 if (op==1) {
 System.out.print("\nDigite um String a ser empilhado: ");
 String aux = sc.nextLine();
 p.push(aux);
 }
 if (op==2) {
 if (p.isEmpty()) {
 System.out.println("A pilha está vazia!");
 }
 else {
 String aux = p.pop();
 System.out.println("Elemento desempilhado: " + aux);
 }
 }
 if (op==3) {
 if (p.isEmpty()) {
 System.out.println("A pilha está vazia!");
 }
 else {
 String aux = p.topo();
 System.out.println("Elemento do topo: " + aux);
 }
 }
 if (op==4) {
 System.out.println("Desempilhando tudo:");
 while (!p.isEmpty()) {
 String aux = p.pop();
 System.out.println(aux);
 }
 }
 
 } while (op != 5);
 }
}
