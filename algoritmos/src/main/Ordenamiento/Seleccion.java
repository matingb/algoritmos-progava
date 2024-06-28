package main.Ordenamiento;

public class Seleccion {

	public void ordenar(int[] array)
	{
		int n= array.length;
		
		for(int i= 0; i < (n -1); i++)
		{
			int menor= i;
			
			for(int j= i+1; j < n; j++)
			{
				if(array[j] < array[menor])
				{
					menor= j;
				}
			}
			
			int aux= array[i];
			array[i]= array[menor];
			array[menor]= aux;
		}
	}
}
