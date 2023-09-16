

interface Abc{				//Function Interface (Only one method)
	void show();
}


public class LambdaExpresionDemo {
	public static void main(String [] args) {
		
		Abc obj = () -> System.out.println("Lambda Expresion show");  //Lambda Expresion
		obj.show();
		
	}

}
