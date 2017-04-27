package us.deathmarine.luyten;

//TODO Nothing
//This closes the application

public final class Closer {
	public static void tryClose(final AutoCloseable c) {
		if (c == null) {
			return;
		}
		try {
			c.close();
		} catch (Throwable ignored) {
		}
	}

	public static void tryClose(final AutoCloseable... items) {
		if (items == null) {
			return;
		}
		for (AutoCloseable c : items) {
			tryClose(c);
		}
	}
}
