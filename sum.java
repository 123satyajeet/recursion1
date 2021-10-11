class sum{

static int rec(int n){
	if(n<1){
	return 0;
	}
	return (n%10)+rec(n/10);
}

public static void main(String args[]){

System.out.println(rec(25));

}




}
