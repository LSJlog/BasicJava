package chapter11;

import java.util.Objects;

public class Key {
	public int number;
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		return number == other.number;
	}
	
}
