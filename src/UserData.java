public class UserData {
    public class UserDBManager extends User{
        private String Filepath;
        private int AccNum;

       /* public static void SaveUser(User) {}
        public static User LoadUser(String userName, String password) {

        }
        public  User[] SearchUsers(String field, String employee) {

        }
        private static String Encrypt(String password) {

        }
        public boolean ResetPassword(String userName, String email) {

        }
        public User CreateUser(String firstName, String lastName, String phoneNumber, String email, int ID, String address, String userName, String password) {

        } */

    }
    protected static class User{


        String lastName;
        String phoneNumber;
        String email;
        int ID;
        String Type;
        String field;
        String address;
        private String userName;
        private String password;

    }
}
