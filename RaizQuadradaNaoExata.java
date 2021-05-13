package aula;

public class RaizQuadradaNaoExata {
	public int num;
	public String raizq;
	
	
	public String CalcularRQ() {
		int n, cc=1, ci=1, r;
		n = num;
		r = n - ci;
	while(r > 0)
		{
		 cc = cc + 1;
		 ci = ci + 2;
		 n = r;
		 r = n - ci;
		}
		if(r == 0)
			raizq = String.valueOf(cc);
		else
			raizq = "Entre " + (cc - 1) + " e " + cc;
		return raizq;
		
	
	}

}
