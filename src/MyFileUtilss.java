
public class MyFileUtilss {
	public int subtract10FromLargerNumber(int number) throws Exception{
		if(number <10){
			throw new FooRuntimeException("number is too small to subtract");
		}
		return number -10;
	}
	
	public class FooRuntimeException extends Exception{
		public FooRuntimeException(String message){
			super(message);
		}
	}
}
