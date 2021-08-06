
module Java {
	requires activation;
	requires mail;

	// opens 사용할 패키지 명 to 사용할 놈들
	opens Day14 to activation, mail;

}