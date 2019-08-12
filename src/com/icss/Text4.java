package com.icss;

public class Text4 {

}

class A extends Exception {
}

class B extends A {
}

class C extends Exception {
}

class Fu {
	Fu() throws A {
	}

	void show() throws A {
	}
}

class Zi extends Fu {
	Zi() throws Exception {
	}

	void show() throws B {
	}
}