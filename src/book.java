import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class book {

	//informations d'accès à la base de données
	private static String URL = "jdbc:mysql://localhost:3306/JAVABOOK";
    private static String LOGIN = "root";
    private static String PASSWORD = "not24get";
	public static void main(String[] args) {
		
		
		
		JFrame fenetre = new JFrame();
		fenetre.setVisible(true);
		fenetre.setTitle("Titre des livres");
		fenetre.setSize(400,100);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel 	Titre = new JLabel("Titre des livres:");
		JLabel 	TitreLivre = new JLabel("<html>Titre des livre:<br>Everyday Italian<br>Harry Potter<br>XQuery Kick Start<br>Learning XML</html>");
		fenetre.add(TitreLivre);
		//JFrame fenetre2 = new JFrame();
		//fenetre2.setVisible(true);
		//fenetre2.setTitle("Detail du livre");
		//fenetre2.setSize(400,100);
		//fenetre2.setLocationRelativeTo(null);
		//fenetre2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		
		
		
		
        
		
		
		
		
//		Connection cn=null; Statement st=null; ResultSet rs =null; 
		
		
		
//			try {
//				
//				cn = DriverManager.getConnection(URL, LOGIN, PASSWORD);
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			try {
//				st = cn.createStatement();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			String sql = "SELECT * FROM Books";
//			try {
//				rs= st.executeQuery(sql);
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			try {
//				while (rs.next()){
//					System.out.println(rs.getString("Books"));
//				         }
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}					
//		try {
//			cn.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			st.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//bookBDD book = new bookBDD(null, null, 0, null);
		
		//List<bookBDD> book = new ArrayList<bookBDD>();

	
	
}
}

