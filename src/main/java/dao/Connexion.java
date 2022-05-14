package dao;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.naming.Context;
import javax.naming.InitialContext;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Connexion {

//    VendorDataSource vds = new VendorDataSource();
//
//    vds.setServerName("");
//    vds.setDatabaseName("my_database");
//    vds.setDescription("");
//
//    Context ctx = new InitialContext();
//    ctx.bind("jdbcAcmeDB",vds);
}
