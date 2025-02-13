package Lambdaexpression;

@FunctionalInterface
public interface I1 {
	public abstract void m1();

	default void m2() {
	}

	default void m3() {
	}

	static void m4() {
	}

	static void m5() {
	}

}
