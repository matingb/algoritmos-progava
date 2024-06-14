package Ordenamiento;

public class Insercion {

	public void ordenar(int[] array)
	{
		int i, j;
		
		for(i=1; i < array.length; i++)
		{
			int aux= array[i];
			j= i-1;
			
			while(j >= 0 && aux < array[j])
			{
				array[j+1]= array[j];
				j--;
			}
			
			array[j+1]= aux;
		}
		
	}
}
