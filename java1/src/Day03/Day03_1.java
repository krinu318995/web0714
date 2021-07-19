package Day03;

public class Day03_1 {// starting point of class

	// 연산자[연산시 사용되는 기호]
	// 1. 산술 연산자 [ +, -, *, /, % ]
	// 2. 비교 연산자 [ <, >, <=, >=, ==, !=]
	// 결과 : true / false
	// 3. 논리[관계] 연산자 [ &&, ||, ! ]
	// 4. 대입 연산자 [ 오른쪽 데이터가 왼쪽으로 저장 ] [ = 대입, +=, -=, *=, /=, %= ]
	// 5. 증감 연산자 [1씩 증가 or 1씩 감소]
	// ++변수 : 선위 증가 / 변수++ : 후위 증가
	// --변수 : 선위 감수 / 변수-- : 선위 감소

	public static void main(String[] args) {// starting point of main

		// 1. 산술 연산자
		int numA = 10;
		int numB = 20;
		System.out.println("덧셈 : " + numA + numB); // + : 연결 연산자
		System.out.println("덧셈 : " + (numA + numB));// + : 산술 연산자
		System.out.println("뺼셈 : " + (numA - numB));
		System.out.println("곱셈 : " + (numA * numB));
		System.out.println("나눗셈 몫 : " + (numA / numB));
		System.out.println("나눗셈 나머지 : " + (numA % numB));

		// 2. 비교 연산자
		// 이상
		System.out.println(numA + ">=" + numB + " -> " + (numA >= numB));
		// 이하
		System.out.println(numA + "<=" + numB + " -> " + (numA <= numB));
		// 큼
		System.out.println(numA + ">" + numB + " -> " + (numA > numB));
		// 작음
		System.out.println(numA + "<" + numB + " -> " + (numA < numB));
		// 같음
		System.out.println(numA + "==" + numB + " -> " + (numA == numB));
		// 다름
		System.out.println(numA + "!=" + numB + " -> " + (numA != numB));

		// 3. 논리 연산자 [&& : and , || : or, ! : not ]
		int numC = 30;
		int numD = 40;
		// and : 조건을 모두 만족해야 true, 그렇지 않으면 false
		System.out.println("and : " + ((numA >= numB) && (numD >= numC)));
		// or : 한 개의 조건만 만족해도 true, 조건을 모두 충족시키지 못하면 false
		System.out.println("or : " + ((numA >= numB) || (numD >= numC)));
		// not
		System.out.println("not : " + !((numA >= numB) || (numD >= numC)));

		// 4. 대입 연산자
		numA += 1;
		System.out.println(numA);
		numA -= 1;
		System.out.println(numA);
		numA *= 10;
		System.out.println(numA);
		numA /= 10;
		System.out.println(numA);
		numA %= 10;
		System.out.println(numA);

		// 5. 증감 연산자
		System.out.println("numA : " + numA);
		System.out.println("++numA : "+ (++numA));
		System.out.println("numA++ : "+numA++);

		for (numA = 10; numA <= 100; numA += 10) {
			System.out.println("numA : " + numA);
		}

	}// endpoint of main

}// endpoint of class
