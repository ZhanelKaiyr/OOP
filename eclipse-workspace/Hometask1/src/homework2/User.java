package homework2;

public class User {
	private String firstName;
	private String secondName;
	private int id,age;
	private String gender;
	private String  password;
	private String dateOfBirth;
    private static int generatorid= 0;
	
	public User(String fn,String sn,int a,String g,String p, String date){
		firstName=fn;
		secondName=sn;
		this.id =generatorid+1;
		age=a;
		gender=g;
		password=p;
		dateOfBirth=date;
	}

	public void setfirstName(String  firstname){
	    this.firstName = firstname;
	}

	public void setsecondName(String  secondname){
	    this.secondName=secondname;
	}

	public String getfirstName(){
	    return firstName;
	}

	public String getsecondName(){
	    return secondName;
	}
	public int getId() {
		return id;
	}
	public void setAge(int age){
	    this.age=age;
	}

	public int getAge(){
	    return age;
	}
	public void setGender(String  gender){
	    this.gender=gender;
	}

	public String getGender(){
	    return gender;
	}
	public void setPassword (String  password){
	    this.password=password;
	}

	public String getPassword(){
	    return password;
	}
	public void setDateOfBirth(String  dateOfBirth){
	    this.dateOfBirth=dateOfBirth;
	}

	public String getdateOfBirth(){
	    return dateOfBirth;
	}
	public void Printall() {
		System.out.println(getfirstName());
		System.out.println(getsecondName());
		System.out.println(getAge());
		System.out.println(getGender());
		System.out.println(getPassword());
		System.out.println(getdateOfBirth());
	}
	
    public String toString() {
        return "Student{" +"id="+id+
                "First name='" + firstName + '\'' +"Second name='" + secondName +
                ", age=" + age +
                ", gender=" +gender +"Password="+password+"Date of Birth="+dateOfBirth +
                '}';
    }

	
}
