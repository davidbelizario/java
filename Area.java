package Poligonos;

public class Area {
	static double base;
	static double altura;
	double basemaior;
	double area;


	
	Area(double altura, double base){	
		area = base * altura;
		System.out.println("Área do Retângulo = " + area);
	}
	
	Area(){
		Area.base = 5.00;
		Area.altura = 4.00;
		area = (Area.base * Area.altura) / 2;
		System.out.println("Área do Triângulo = " + area);
	}
	
	Area(double basemaior){
		
		area = ((Area.base + basemaior) * Area.altura) / 2;
		System.out.println("Área do Trapézio = " + area);
	}
}
