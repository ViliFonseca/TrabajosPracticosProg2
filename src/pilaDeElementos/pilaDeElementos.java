package pilaDeElementos;
import java.util.ArrayList;
public class pilaDeElementos {
private ArrayList<Object> elementos;


public pilaDeElementos() {
	elementos = new ArrayList<>();
}






public void push(Object o) {
	elementos.add(o);
	}
	
	public Object pop() {
		if(!elementos.isEmpty())
		return elementos.remove(elementos.size() - 1);
		else return null;
	}
	
	public Object top() {
		if (!elementos.isEmpty())
			return elementos.getLast();
		 else return null;
	} 
	public Object size() {
	 return elementos.size();
	}
	
	public pilaDeElementos copy() {
	pilaDeElementos copia = new pilaDeElementos();
	 copia.elementos.addAll(this.elementos);
	 return copia;
	}
	public pilaDeElementos reverse() {
		pilaDeElementos pilaI = new pilaDeElementos(); 
		for(int i = elementos.size() - 1; i >= 0; i--) {
			pilaI.push(elementos.get(i));
		}
		return pilaI;
	}
	
	
	
		public static void main(String[] args) {
         String i = "hola";
         String b = "mundo";
		pilaDeElementos pila1 = new pilaDeElementos();
		pila1.push(i);
		System.out.println(pila1.top());
		pila1.push(b);
		System.out.println(pila1.top());
		pilaDeElementos pila2 = pila1.reverse();
		System.out.println(pila2.top());
		pila2.pop();
		System.out.println(pila2.top());

		
		}
}
