package date181115;
/*
	대입연산자
	=,
	+=,-=,*=,/=,%=
	<<=,>>=,>>>=
	&=, |=, ^=
*/
class Operator7{
	public static void main(String[] args){
	
		int i = 3;  // 대입

		// 산술대입
		i += 2;		// 5
		i -= 1;		// 4
		i *= 3;		// 12
		i /= 4;		// 3   자바에선 정수/정수 = 정수!(실수X)
		i %= 2;		// 1

		// 쉬프트 대입
		i <<= 4;	// 0000 0001 -> 0001 0000 = 16
		i >>= 1;	// 0001 0000 -> 0000 1000 = 8
		i >>>= 2;	// 0000 0100 -> 0000 0010 = 1
		System.out.println(i); // 디버그 목적
		
		// 비트논리 대입
		i &= 12;	// 0000 0001 & 0000 1100 = 0000 0000 = 0
		i |= 11;	// 0000 0000 | 0000 1011 = 0000 1011 = 11
		i ^= 7;		// 0000 1011 ^ 0000 0111 = 0000 1100 = 12

		System.out.println(i);

		// 문자열 비교시 equals method 사용
		String s = "안녕";
		System.out.println(s.equals("안녕!"));
		System.out.println(s.equals("안녕"));
	}
}
