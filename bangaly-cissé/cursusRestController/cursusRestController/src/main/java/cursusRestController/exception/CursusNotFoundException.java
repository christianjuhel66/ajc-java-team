package cursusRestController.exception;

public class CursusNotFoundException extends RuntimeException{
	
private static final long serialVersionUID = 1L;
	
	public CursusNotFoundException(String message) {
		super(message);
	}
	
	public CursusNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public CursusNotFoundException(Throwable cause) {
		super(cause);
	}

}
