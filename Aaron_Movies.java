
package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLite {
	public static void main(String[] args) {
		String jdbcUrl="jdbc:sqlite:/Movies.db";
		Connection connection =DriverManager.getConnection(jdbcUrl);
		
	String sql="create table Movies (Name varchar(50),Actor varchar(20),Actress varchar(20),Director varchar(20),Year_of_release int)";    
	Statement statement =connection.createStatement();
	statement.executeUpdate(sql);
	//1
	String sql1="insert into Movies values('Ghost Rider','Nicolas Cage','Eva Mendes','Mark Steven Johnson','2007')";    
	statement.executeUpdate(sql1);
	//2
	String sql2="insert into Movies values('Charlie and the chocolate factory','Johnny Depp','Julia Winter','Tim Burton','2005')";    
	statement.executeUpdate(sql2);
	//3
	String sql3="insert into Movies values('Inception','Leonardo DiCaprio','Marion Cotillard','Christopher Nolan','2010')";    
	statement.executeUpdate(sql3);
	
	//4
	String sql4="insert into Movies values('The Shawshank Redemption','Tim Robbins','Renee Blaine','Frank Darabont','1994')";    
	
	statement.executeUpdate(sql4);
	
	//5
	String sql5="insert into Movies values('The Lord of the Rings','Elijah Wood','Cate Blanchett','Peter Jackson','2002')";    
	statement.executeUpdate(sql5);
	
	//6
	String sql6="insert into Movies values('Fantastic Beasts: The Crimes of Grindelwald','Eddie Redmayne','Katherine Waterston','David Yates','2018')";    
	statement.executeUpdate(sql6);
	
	//selecting
	String sql7="select rowid, * from Movies ";
	ResultSet result = statement.executeQuery(sql7);
	while(result.next()) {
		String Name=result.getString("Name");
		String Actor=result.getString("Actor");
		String Actress=result.getString("Actress");
		String Director=result.getString("Director");
		String Year_of_release=result.getString("Year_of_release");
		
		System.out.println(Name+" | "+Actor+" | "+Actress+" | "+Director+" | "+Year_of_release);
     }
 System.out.println("");

 String sql8="select rowid, * from Movies where Actor='Johnny Depp' ";
	ResultSet result = statement.executeQuery(sql8);
	while(result.next()) {
		String Name=result.getString("Name");
		String Actor=result.getString("Actor");
		String Actress=result.getString("Actress");
		String Director=result.getString("Director");
		String Year_of_release=result.getString("Year_of_release");
		
		System.out.println(Name+" | "+Actor+" | "+Actress+" | "+Director+" | "+Year_of_release);
		
		
	}
	
	}

}