
public class mainTest {
	
	public static void main(String[] args) throws Exception {
		
		Pilha pilha = new Pilha();
		
		pilha.push(new Curso(122,"ADS",1,"T.I"));
		pilha.push(new Curso(2154,"LOGISTICA",2,"EXATAS"));
		pilha.push(new Curso(2154,"ADMINITRAÇÃO",3,"HUMANAS"));
		
		Curso curso = (Curso) pilha.peek();
        System.out.println(curso.toString());
        
        pilha.pop();

        
        pilha.push(new Curso(122,"R.H",6,"HUMANAS"));
		pilha.push(new Curso(2154,"SEGUGANÇA DA INFROMAÇÃO",4,"EXATAS"));
		pilha.push(new Curso(2154,"BIOLOGIA",7,"HUMANAS"));
        

        pilha.pop();
        

        pilha.pop();

        pilha.pop();
        Curso curso02 = (Curso) pilha.peek();
        System.out.println(curso02.toString());

	}

}
