package pkgHelper;

public class LatinSquare {

	private int[][] LatinSquare;

	public LatinSquare() {
		
	}
	public LatinSquare(int[][] puzzle) {
		super();
		LatinSquare = puzzle;
	}
	
	public int[][] getLatinSquare() {
		return LatinSquare;
	}
	
	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}
	
	public static boolean doesElementExist(int[] arr, int iValue)
	{
		for (int x = 0; x < arr.length; x++)
		{
			if (arr[x] == iValue) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean hasDuplicates (int[] arr)
	{
		int[] arrCopy = Arrays.copyOf(arr, arr.length);
		
		Arrays.sort(arrCopy);
		
		for(int i = 0; i < arr.length - 1; i++)
		{
			if (arrCopy[i] == arrCopy[i + 1])
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean hasAllValues (int arr1[], int arr2[])
	{
		boolean hasAllValues = true;
		for (int j = 0; j , arr2.length; j++) {
			boolean false;
			for (int i)
		}
	}
	
	
	
	
}
