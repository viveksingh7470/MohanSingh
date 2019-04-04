package p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.OracleDriver;

/**
 * Servlet implementation class Model
 */
public class Model extends HttpServlet 
{
	private String balance;
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getBalance() {
		return balance;
	}
	public String getAccno() {
		return accno;
	}
	private String accno;
	private String newpwd;
		public void setNewpwd(String newpwd) {
		this.newpwd = newpwd;
	}
		public String getNewpwd() {
		return newpwd;
	}
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();
		int x;
		private String saccno;
		private String amt;
		private String oldpwd;
		private String cnewpwd;
		private String name;
		private String custid;
		private String fname;
		private String mname;
		private String add;
		private String dob;
		private String sex;
		private String category;
		private String mobile;
		private String email;
		ResultSet res=null;
	
		public void setAl1(ArrayList al1) {
			this.al1 = al1;
		}
		public void setAl2(ArrayList al2) {
			this.al2 = al2;
		}
		public void setX(int x) {
			this.x = x;
		}
		public ArrayList getAl1() {
			return al1;
		}
		public ArrayList getAl2() {
			return al2;
		}
		public int getX() {
			return x;
		}
		public void setSaccno(String saccno) {
			this.saccno = saccno;
		}
		public void setAmt(String amt) {
			this.amt = amt;
		}
		public void setOldpwd(String oldpwd) {
			this.oldpwd = oldpwd;
		}
		public void setCnewpwd(String cnewpwd) {
			this.cnewpwd = cnewpwd;
		}
		public String getSaccno() {
			return saccno;
		}
		public String getAmt() {
			return amt;
		}
		public String getOldpwd() {
			return oldpwd;
		}
		public String getCnewpwd() {
			return cnewpwd;
		}
		public void setRes(ResultSet res) {
			this.res = res;
		}
		public ResultSet getRes() {
			return res;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setCustid(String custid) {
			this.custid = custid;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public void setMname(String mname) {
			this.mname = mname;
		}
		public void setAdd(String add) {
			this.add = add;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	
		public void setPw(String pw) {
			this.pw = pw;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public void setUnn(String unn) {
			this.unn = unn;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public void setCon(Connection con) {
			this.con = con;
		}
		public void setPstmt(PreparedStatement pstmt) {
			this.pstmt = pstmt;
		}
		public String getName() {
			return name;
		}
		public String getCustid() {
			return custid;
		}
		public String getFname() {
			return fname;
		}
		public String getMname() {
			return mname;
		}
		public String getAdd() {
			return add;
		}
		public String getDob() {
			return dob;
		}
		public String getSex() {
			return sex;
		}
		public String getCategory() {
			return category;
		}
		public String getMobile() {
			return mobile;
		}
		public String getEmail() {
			return email;
		}

		public String getPw() {
			return pw;
		}
		public String getUrl() {
			return url;
		}
		public String getUnn() {
			return unn;
		}
		public String getPwd() {
			return pwd;
		}
		public Connection getCon() {
			return con;
		}
		public PreparedStatement getPstmt() {
			return pstmt;
		}
		private String pw;
		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String unn="system";
		String pwd="system";
		Connection con=null;
		PreparedStatement pstmt=null;
		Model()
		{
			try
			{
				DriverManager.registerDriver(new OracleDriver());
				con=DriverManager.getConnection(url,unn,pwd);
			}
			catch(Exception e )
			{
				e.printStackTrace();
			}
		}
			int register()
			{
				try
				{
					String s="INSERT INTO SBI1 VALUES(?,?,?,?,?,?,?,?,?,?,?)";
					pstmt=con.prepareStatement(s);
					pstmt.setString(1, custid);
					pstmt.setString(2, name);
					pstmt.setString(3, fname);
					pstmt.setString(4, mname);
					pstmt.setString(5, add);
					pstmt.setString(6, dob);
					pstmt.setString(7, sex);
					pstmt.setString(8, mobile);
					pstmt.setString(9, email);
					pstmt.setString(10, pw);
					pstmt.setString(11, category);
					int x=pstmt.executeUpdate();
					return x;
				}
				catch (Exception e)
				{
				 e.printStackTrace();
				}
				return 0;
			}
			//*********************************Login Module*************
			//*********************************Login Module*************
			boolean login()
			{
				try
				{
					String s="SELECT * FROM SBI3 WHERE CUSTID =? AND PW =?";
					pstmt=con.prepareStatement(s);
					pstmt.setString(1, custid);
					pstmt.setString(2, pw);
					res=pstmt.executeQuery();
					while(res.next()==true)
					{


						custid=res.getString(2);
						pw=res.getString(3);
						balance=res.getString(5);
						accno=res.getString(6);
						return true;
					}
					
				}
				catch(Exception e)
				{
					System.out.println("Some problem in Model");
				}
				return false;
			}
			void checkBalance()
			{
				try
				{
					String s = "SELECT * FROM SBI3 WHERE ACCNO=?";
					pstmt=con.prepareStatement(s);
					pstmt.setString(1, accno);
					res=pstmt.executeQuery();
					while(res.next()==true)
					{
						balance = res.getString(5);
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			//________________________ApplyLoan______________________
			
			void applyLoan()
			{
				try
				{
					String s = "SELECT * FROM SBI3 WHERE ACCNO=?";
					pstmt = con.prepareStatement(s);
					pstmt.setString(1, accno);
					res=pstmt.executeQuery();
					while(res.next()==true)
					{
						name=res.getString("NAME");
						email = res.getString("EMAIL");
					}
				}
				catch(Exception e)
				{
					
				}
			}
			//*********************************************************RESET PWD**********************
			boolean resetPwd()
			{
				try
				{
					String s="SELECT * FROM SBI3 WHERE ACCNO=? AND PW=?";
					pstmt=con.prepareStatement(s);
					pstmt.setString(1, accno);
					pstmt.setString(2, pw);
					res=pstmt.executeQuery();
					
					if(res.next()==true)
					{
						try
						{
							String s1="UPDATE SBI3 SET PW=? WHERE ACCNO=?";
							pstmt=con.prepareStatement(s1);
							pstmt.setString(1,newpwd);
							pstmt.setString(2,accno);
							int x=pstmt.executeUpdate();


							if(x==0)
							{
								return false;
							}
							else
							{
								return true;
							}
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
					}
					else
					{
						return true;
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				return false;

			}
			//_________________________Money transfer__________________	
			boolean transfer()
			{	try
				{	String s = "SELECT * FROM SBI3 WHERE ACCNO=?";
					pstmt=con.prepareStatement(s);
					pstmt.setString(1, saccno);
					res=pstmt.executeQuery();
					if(res.next()==true)
					{	
						try
						{
							String s1 = "UPDATE SBI3 SET BALANCE=BALANCE+? WHERE ACCNO=? ";
							pstmt=con.prepareStatement(s1);
							pstmt.setString(1, amt);
							pstmt.setString(2, saccno);
							int x = pstmt.executeUpdate();	
							if(x==1)
							{
								try
								{	String s2 = "UPDATE SBI3 SET BALANCE=BALANCE-? WHERE ACCNO=?";
									pstmt=con.prepareStatement(s2);
									pstmt.setString(1, amt);
									pstmt.setString(2, accno);
									x=pstmt.executeUpdate();
									if(x==0)
									{	return false;
									}
									else
									{
										try
										{	String s3 = "INSERT INTO GETSTATEMENT VALUES(?,?,?)";
											pstmt=con.prepareStatement(s3);
											pstmt.setString(1, accno);
											pstmt.setString(2, saccno);
											pstmt.setString(3, amt);
											pstmt.executeUpdate();
											return true;
										}
										catch(Exception e)
										{
											
										}
										
									}
									
									
								}
								catch(Exception e)
								{
									System.out.println("Unable to transfer");
								}
							}
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
					}
					else
					{
						return false;
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				return false;
			}
			//__________________________GetStatement_____________
			
			void getStatement()
			{
				try
				{
					System.out.println(accno);
					String s = "SELECT * FROM GETSTATEMENT WHERE ACCNO=?";
					pstmt=con.prepareStatement(s);
					pstmt.setString(1, accno);
					res=pstmt.executeQuery();
					while(res.next()==true)
					{
						al1.add(res.getString(2));
						al2.add(res.getString(3));
						System.out.println(al1);
						System.out.println(al2);
					}
				}
				catch(Exception e)
				{
					
				}
			}
		}
