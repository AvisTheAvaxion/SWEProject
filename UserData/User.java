public class User {
  public String firstName;
  public String lastName;
  public String email;
  public String id;
  private String type;
  private String address;
  private String username;
  private String password;

  public boolean changeUserType(User employee) {
    if (employee.type == "employee") {
      if (type = "customer") {
        type = "employee";
        return true;
      }
      else {
        type = "customer";
        return true;
      }
    }
    else {
      return false;
    }
  }

  public String getAddress(String userPassword) {
    if (password = userPassword) {
      return password;
    }
    else {
      return null;
    }
  }

  public String getUsername(String userPassword) {
    if (password = userPassword) {
      return password;
    }
    else {
      return null;
    }
  }
}