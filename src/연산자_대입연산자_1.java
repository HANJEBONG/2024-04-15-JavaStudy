/*
 *    대입연산자 => 메모리에 저장
 *               ------ 변수 
 *               
 *    =  => int a=10;
 *              10을 a라는 메모리에 저장 (대입)
 *       => 형변환
 *          int a='A'
 *          ----  --
 *           4     2  =>작은 값은 대입이 가능
 *            => 'A' ==> 65로 변경후에 저장
 *          long l=20;
 *          ----   --
 *            8    4
 *            => 20 ==> 20L
 *         double d=20;  20.0
 *         
 *    = 대입연산자
 *    -------------
 *    복합대입연산자
 *    
 *     +=
 *      int a=10;
 *                 <====
 *      a+=1;  => a = a+1;
 *       --           ---1
 *                     10+1 => a=11
 *              --2
 *      a+=10  ==> a=a+10 => 20
 *      a+=20  ==> a=a+20
 *     -=
 *      a-= ==> a=a-1
 *      a-=10 ==> a=a-10
 *     *=
 *      a*=2 ==> a=a*2
 *     /=
 *      a/=2 ==> a=a/2
 *      
 *      int a=10;
 *      a++;
 *      a++;
 *      a++;
 *      a++;
 *      a++;
 *      
 *      a+=5;
 *     -----------------------------
 *      
 *     => 누적, 문자열 결합
 */
public class 연산자_대입연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long l=20; //20L
//		int a=20;
//		double d=20;
//		System.out.println("d="+d);
		int a=10;
		a++;
		a++;
		a++;
		a++;
		a++;
		System.out.println("a="+a);
		
		int b=10;
		b+=5;
		System.out.println("b="+b);
		/*
		 *    한개 증가 / 한개 감소
		 *       ++      --
		 *    여러개 증가 / 여러개 감소
		 *       +=        -=
		 *       
		 *    int a=10;
		 *    a++ / ++a / a+=1 / a=a+1 ==> 한개 증가
		 *    
		 *    int a=10;
		 *    a-- / --a / a-=1 / a=a-1 ==> 한개 감소
		 *    
		 *    여러개 증가 / 여러개 감소
		 *    int a=10;
		 *    a-=5  => a=a-5
		 *    a+=5  => a=a+5
		 */
		
		int score1=10;
		int score2=5;
		score1+=score2;
		System.out.println("score1="+score1);//15
		score1-=score2;
		System.out.println("score1="+score1);//10
		
		// 변수값이 변경 ==> ++,--,+=,-=
		//나머지 연산자는 변수값 변경이 안된다
		int m=10;
		int n=20;
		System.out.println(n=m+n);
		System.out.println("n="+n);
		char k=' ';
		System.out.println(k+1);

	}

}
