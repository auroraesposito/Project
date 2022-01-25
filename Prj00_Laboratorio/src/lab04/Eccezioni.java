package lab04;

public class Eccezioni {

	/**
	 * Created by mauro on 20/06/16.
	 */

	    public static void main(String[] args) {

	        String s = null;

	        System.out.println(s);

	        String welcome = "Benvenuto!";

	        char[] caratteri = welcome.toCharArray();

	        for (int i = 0; i < caratteri.length; i++) {

	            System.out.println(caratteri[i]);

	        }


	        try {
	            if(caratteri.length < 9){
	                throw (new Exception("Mio messaggio: non ci provare!"));
	            }
	        } catch (Exception e) {
	            System.out.println(e.getMessage());// e.printStackTrace();
	        }


	        try {
	            char lastChar = caratteri[caratteri.length - 1];
	            System.out.println(lastChar);

	            String sub = welcome.substring(11);


	        } catch (ArrayIndexOutOfBoundsException e){

	            System.out.println("errore array");

	        }
	        catch (StringIndexOutOfBoundsException e) {
	            e.printStackTrace();
	            System.out.println("si è verificato un errore in lettura");
	        }


	    }



	}


