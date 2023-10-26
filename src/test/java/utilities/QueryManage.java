package utilities;

public class QueryManage {


  private String chatUsersQuery = "select count(*) from u168183796_qawonder.chat_users where create_staff_id=1";







  //*********Getter**********

    public String getChatUsersQuery() {
        return chatUsersQuery;
    }
}
