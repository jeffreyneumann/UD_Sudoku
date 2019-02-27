package pkgTest;

import pkgHelper.LatinSquare;

public class LatinSquareTest {
	
	public void doesElementExist_Test() {
		int [] arr = {1,2,3,4,5};
		int iValue = 5;
		boolean bExpected = true;
		boolean bActual = LatinSquare.doesElementExist(arr,  iValue);
		
		assertEquals(bExpected, bActual);
		
	}
	public void hasDuplicates_test1() {
		int [] arr = {1,2,3,4,5};
		int iValue = 5;
		boolean bExpected = true;
		boolean bActual = LatinSquare.hasDuplicates(arr,  iValue);
		
		assertEquals(bExpected, bActual);
	}
	
	
		
	
}
