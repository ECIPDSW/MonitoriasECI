package Servicios;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.google.inject.*;
import java.util.Optional;
import org.mybatis.guice.XMLMyBatisModule;
import org.postgresql.*;

public class Fabrica {
    private static Fabrica instance = new Fabrica();
    private static Injector injector;
    private static Injector testInjector;
    
    private Injector myBatisInjector() {
        return Guice.createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                setClassPathResource("mybatis-config.xml");
                /*bind(ServiciosAlquiler.class).to(ServiciosAlquilerItemsImpl.class);
                bind(ItemDAO.class).to(MyBATISItemDAO.class);
                bind(ClienteDAO.class).to(MyBATISClienteDAO.class);
                bind(ItemRentadoDAO.class).to(MyBATISItemRentadoDAO.class);
                bind(TipoItemDAO.class).to(MyBatisTipoItemsDAO.class);*/
            }
        });
    }
    public Fabrica(){
        /*injector = Guice.createInjector(new XMLMyBatisModule(){
            @Override
            protected void initialize(){
                //install(JdcbHelper.PostgreSQL);
                setClassPathResource("mybatis-config.xml");
            }
        });*/
        
    }
    
     public ServicioAsesoria getServiciosAsesoria(){
        return Optional.of(myBatisInjector()).get().getInstance(ServicioAsesoria.class);
    }
     
    public static Fabrica getInstance(){
        return instance;
    }
     
}
