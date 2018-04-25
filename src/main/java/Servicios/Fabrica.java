package Servicios;
import DAOS.AsesoriaDAO;
import DAOS.MonitorDAO;
import DAOS.ProfesorDAO;
import DAOS.SemestreDAO;
import DAOS.TemaAsesoriaDAO;
import MyBatis.MyBatisAsesoriaDao;
import MyBatis.MyBatisMonitorDao;
import MyBatis.MyBatisProfesorDao;
import MyBatis.MyBatisSemestreDao;
import MyBatis.MyBatisTemaAsesoriaDao;
import ServiciosImpl.ServicioAsesoriaImpl;

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
    
    private Injector myBatisInjector(final String pathResource) {
        return Guice.createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                setClassPathResource("mybatis-config.xml");
                bind(ServicioAsesoria.class).to(ServicioAsesoriaImpl.class);
                bind(SemestreDAO.class).to(MyBatisSemestreDao.class);
                bind(AsesoriaDAO.class).to(MyBatisAsesoriaDao.class);
                bind(ProfesorDAO.class).to(MyBatisProfesorDao.class);
                bind(TemaAsesoriaDAO.class).to(MyBatisTemaAsesoriaDao.class);
                bind(MonitorDAO.class).to(MyBatisMonitorDao.class);
                
            }
        });
    }
    
     public ServicioAsesoria getServiciosAsesoria(){
        return injector.getInstance(ServicioAsesoria.class);
    }
 
      private Fabrica(){

        injector = myBatisInjector("mybatis-config.xml");
        testInjector = myBatisInjector("mybatis-config-h2.xml");
      }
     
   
    public static Fabrica getInstance(){
        return instance;
    }
     
}
