package utilities;

public class QueryManage {


  private String chatUsersQuery = "select count(*) from u168183796_qawonder.chat_users where create_staff_id=1";

  private String studentsQuery = "Select * From u168183796_qawonder.students Where firstname= 'Brian' AND lastname= 'Kohlar'";






  //*********Getter**********

    public String getChatUsersQuery() {
        return chatUsersQuery;
    }

    public String getStudentsQuery() {
        return studentsQuery;
    }
}
