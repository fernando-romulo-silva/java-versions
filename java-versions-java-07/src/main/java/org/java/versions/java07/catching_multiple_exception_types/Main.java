package org.java.versions.java07.catching_multiple_exception_types;

class Main {

	static class FirstException extends Exception {
	}

	static class SecondException extends Exception {
	}

	static void rethrowException(String exceptionName) throws FirstException, SecondException {
		try {
			if (exceptionName.equals("First")) {
				throw new FirstException();
			} else {
				throw new SecondException();
			}
		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {

		try {

			rethrowException("Firts");

		} catch (FirstException | SecondException ex) {
			ex.printStackTrace();
		}
	}

}
