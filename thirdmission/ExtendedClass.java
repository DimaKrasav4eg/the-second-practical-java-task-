package thirdmission;

import java.util.Objects;

public class ExtendedClass extends Object {
	private byte b;
	private int i;
	private double d;
	private String s;
	
	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (other instanceof ExtendedClass) {
			final ExtendedClass e = (ExtendedClass) other;
			if (this.b == e.b && this.i == e.i 
					&& this.d == e.d && this.s.equals(e.s)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(b, i, d, s);
	}
	@Override
	public String toString() {
		return "ExtendedClass [b=" + b + ", i=" + i + 
				            ", d=" + d + ", s=" + s + "]";
	}
}
