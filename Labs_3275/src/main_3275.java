import javax.swing.JOptionPane;

public class main_3275 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput = JOptionPane.showInputDialog("Please, type your name: ");
		
		for(int i=0;i<userInput.length();i++){
			System.out.println(userInput.charAt(i));
		}
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		//This is a new Change that will be committed - adding a comment
	}

}
