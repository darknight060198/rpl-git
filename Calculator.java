public class Calculator {
	public Calculator () {
		
	}
	
	public float plus (float a, float b) {
		float res = a + b;
		return res;
	}
	
	public float minus (float a, float b) {
		float res = a-b;
		return res;
	}
	
	public float multiply (float a, float b) {
		return a*b;
		
	}
	
	public float division (float a, float b) {
		return a/b;
		
	}
	

	public float min (float a, float b){
		if (a>b){
			return b;
		} else {
			return a;
		}

	public float max (float a, float b) {
		return a>b?a:b;
	}
}