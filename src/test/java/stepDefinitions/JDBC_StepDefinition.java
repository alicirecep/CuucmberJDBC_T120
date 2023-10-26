package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.JDBCReusableMethods;



public class JDBC_StepDefinition {

    @Given("Database baglantisi kurulur.")
    public void database_baglantisi_kurulur() {

        JDBCReusableMethods.createConnection();

    }
    @Given("Query hazirlanir ve chat_users tablosuna execute edilir.")
    public void query_hazirlanir_ve_chat_users_tablosuna_execute_edilir() {


    }

    @Given("Chat_users tablosundan donen resultSet dogrulanir.")
    public void chat_users_tablosundan_donen_result_set_dogrulanir() {


    }

    @Given("Database baglantisi kapatilir.")
    public void database_baglantisi_kapatilir() {

    }



}
