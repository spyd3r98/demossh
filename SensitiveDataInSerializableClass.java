package javacodechecker;

import java.io.Serializable;

//added at 2:45
// EMB-ISSUE: CodeIssueNames.SENSITIVE_DATA_IN_SERIALIZABLE_CLASS
public class SensitiveDataInSerializableClass implements Serializable
{
    private String passwordHash;

    protected void setPassword(String password)
    {
        passwordHash = password;

    }

    protected String getPassword()
    {
        return passwordHash;
    }

    protected void withdraw(float amount) throws SQLException
    {
        if (passwordHash != null)
        {
            Connection connection = DriverManager.getConnection("192.168.39.10", "sa", passwordHash);


            if (connection != null)
            {
                try
                {
                    connection.close();
		    System.out.println("Hello added a new Line");
			System.out.println("Hello added a new Line");
			//adding new comment
                }

            }
        }
    }		
    public void printOutput(){
		System.out.println("Added new line for now");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		object1.finalize();
		object2.finalize();
		object3.finalize();
		object4.finalize();
		
		
	}
}
