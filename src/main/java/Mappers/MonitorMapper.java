package Mappers;

import Modelo.Monitor;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * Mapper del monitor
 * @author 666 Industries
 */
public interface MonitorMapper {
    
    /**
     * Recibe un monitor
     * @param id ID del monitor
     * @return Monitor
     */
    Monitor loadMonitor(@Param("id") int id);
    
    /**
     * retorna el monitor con las credenciales registradas
     * @param id ID del monitor
     * @param psw COntra del Monitor
     * @return Monitor
     */
    Monitor loadMonitorLogin(@Param("id")int id, @Param("psw")String psw);
    
    /**
     * devuelve todos los monitores por profesor
     * @param idProfesor ID del profesor
     * @param semestre ID del semestre
     * @return Monitores de ese profesor
     */
    List<Monitor> loadMonitoresAsociadosProfesor(@Param("idprofesor")int idProfesor, @Param("semestre")int semestre);
    
    /**
     * Carga el monitor del grupo
     * @param idgrupo ID del grupo
     * @return Monitor por un grupo
     */
    Monitor loadMonitorPorGrupo(@Param("idgrupo")int idgrupo);
    
    /**
     * Crea un monitor
     * @param id ID de un monitor
     * @param nombre Nombre del monitor
     * @param apellido Apellio del monitor
     * @param correo Correo del monitor
     * @param contrasena Contraseña del monitor
     * @param telefono telefono del monitor
     * @param programa Programa de monitor
     * @param semestreIngreso semestre de ingreso, PUEDE SER NULO
     */
    void crearMonitor(@Param("id")int id, @Param("nombre")String nombre, @Param("apellido")String apellido, @Param("correo")String correo, @Param("contra")String contrasena, @Param("tel")int telefono, @Param("programa")String programa, @Param("semestre")String semestreIngreso);
    
    /**
     * Asigna el semestre a un monitor
     * @param idmonitor ID del monitor
     * @param idsemestre ID del semestre
     */
    void asignarSemestreAMonitor(@Param("moni")int idmonitor, @Param("semestre")int idsemestre);
    
    /**
     * Retorna todos los monitores
     * @return todos los monitores
     */
    List<Monitor> loadMonitores();
    
    /**
     * Modifica la informacion de un monitor
     * @param idViejo id viejo, puede ser nulo
     * @param idNuevo id para cambiar, puede ser nulo
     * @param nombre nombre al que se desea cambiar, puede ser nulo
     * @param apellido apellido que se desea cambiar, puede ser nulo
     * @param correo  correo que se desea cambiar, puede ser nulo
     * @param contasena  contraseña que se desea cambiar, puede ser nulo
     * @param telefono telefono que se desea cambiar, puede ser nulo
     * @param programaAcademico programa que se desea cambiar, puede ser nulo
     * @param semestreDeIngreso semestre que se desea cambiar, puede ser nulo
     */
    void modificarMonitor(@Param("idViejo")int idViejo,@Param("idNuevo") Integer idNuevo,@Param("nombre") String nombre, @Param("apellido")String apellido,@Param("correo") String correo,@Param("contra") String contasena,@Param("telefono") Integer telefono, @Param("programa")String programaAcademico,@Param("semestre") Integer semestreDeIngreso);
    
    List<Monitor> monitoresPorSemestre(@Param("id")int idSemestre);
    
    List<Monitor> monitoresOcupadosSemestre(@Param("id")int idSemestre);
}
