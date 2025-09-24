class ReverseNum{

static int num  = 1234;
static int sum ;

	public static void main(String[] args) {

		while(num>0){
			sum += num%10;
			System.out.println(sum);
			num/=10;
		}
		System.out.println(sum);
	}
}