import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//用户的实体类

public class User {
    private String User_id;
    private String User_name;
    private String Password;
    private String Nickname;
    private String Gender;
    private String Major;
    private String Birthday;
    private String Postnum;

    public void setUser_id(String a) {
        this.User_id = a;
    }

    public String getUser_id() {
        return User_id;
    }

    public void setUser_name(String a) {
        this.User_name = a;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setPassword(String a) {
        this.Password = a;
    }

    public String getPassword() {
        return Password;
    }

    public void setNickname(String a) {
        this.Nickname = a;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setGender(String a) {
        this.Gender = a;
    }

    public String getGender() {
        return Gender;
    }

    public void setMajor(String a) {
        this.Major = a;
    }

    public String getMajor() {
        return Major;
    }

    public void setBirthday(String a) {
        this.Birthday = a;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setPostnum(String a) {
        this.Postnum = a;
    }

    public String getPostnum() {
        return Postnum;
    }

    public String toString() {
        return ("User [User_id = " + User_id + ", User_name = " + User_name + ", Password = " + Password + ", Nickname = " + Nickname + ", Gender = " + Gender + ", Major = " + Major + ", Birthday = " + Birthday + ", Postnum = " + Postnum + "]");
    }
}
