package Servicios;
import DAOS.AdministradorDAO;
import DAOS.AsesoriaDAO;
import DAOS.CursoDAO;
import DAOS.EstudianteDAO;
import DAOS.GrupoDAO;
import DAOS.MonitorDAO;
import DAOS.MonitoriaDAO;
import DAOS.MonitoriaRegistradaDAO;
import DAOS.ProfesorDAO;
import DAOS.SemestreDAO;
import DAOS.TemaAsesoriaDAO;
import DAOS.TemaCursoDAO;
import MyBatis.MyBatisAdministradorDao;
import MyBatis.MyBatisAsesoriaDao;
import MyBatis.MyBatisCursoDao;
import MyBatis.MyBatisEstudianteDao;
import MyBatis.MyBatisGrupoDao;
import MyBatis.MyBatisMonitorDao;
import MyBatis.MyBatisMonitoriaDao;
import MyBatis.MyBatisMonitoriaRegistradaDao;
import MyBatis.MyBatisProfesorDao;
import MyBatis.MyBatisSemestreDao;
import MyBatis.MyBatisTemaAsesoriaDao;
import MyBatis.MyBatisTemaCursoDao;
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
                bind(MonitoriaRegistradaDAO.class).to(MyBatisMonitoriaRegistradaDao.class);
                bind(GrupoDAO.class).to(MyBatisGrupoDao.class);
                bind(AdministradorDAO.class).to(MyBatisAdministradorDao.class);
                bind(CursoDAO.class).to(MyBatisCursoDao.class);
                bind(MonitoriaDAO.class).to(MyBatisMonitoriaDao.class);
                bind(TemaCursoDAO.class).to(MyBatisTemaCursoDao.class);
                bind(EstudianteDAO.class).to(MyBatisEstudianteDao.class);
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
