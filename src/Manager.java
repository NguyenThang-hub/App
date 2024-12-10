public class Manager {
    private String name;
    private int id;
    private String department;
    private String email;
    private String password;
    private String phone;
    private String address;
    private int salary;
    private int bonus;
    private int totalSalary;

    public Manager(String name, int id, String department, String email, String password, String phone, String address, int salary, int bonus, int totalSalary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
        this.bonus = bonus;
        this.totalSalary = totalSalary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setDepartment(String department){
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return phone;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void setBonus(int bonus){
        this.bonus = bonus;
    }

    public void setTotalSalary(int totalSalary){
        this.totalSalary = totalSalary;
    }

}
