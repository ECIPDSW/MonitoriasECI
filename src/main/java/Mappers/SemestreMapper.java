package Mappers;

import Modelo.Semestre;
import java.sql.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * Mapper del semestre
 * @author 666 Industries
 */
public interface SemestreMapper {
    
    /**
     * Retorne el semestre
     * @param id Id del semestre
     * @return Semestre
     */
    Semestre loadSemestre(@Param("id")int id);
    
    /**
     * retorna el semestre actual
     * @return Semestre actual
     */
    Semestre loadSemestreActual();
    
    /**
     * retorna todos los semestres que han sido creados
     * @return Todos los semestres
     */
    List<Semestre> loadSemestres();
    
    /**
     * Carga el semestre anterior
     * @return Semestre anterior
     */
    Semestre loadSemestreAnterior();
    
    /**
     * Crea un semestre
     * @param ano Año
     * @param periodoAcademico Periodo academico, solo puede ser 1, 2 o I
     * @param fechaInicio Fecha de inicio
     * @param fechaFin Fecha de finalizacion
     */
    void crearSemestre(@Param("ano")int ano, @Param("periodo")char periodoAcademico, @Param("fechaInicio")Date fechaInicio,@Param("fechaFin")Date fechaFin);
    
    void modificarSemestre(@Param("id")int IDnumero, @Param("ano")Integer ano, @Param("periodo")Character periodo, @Param("fechaIni")Date fechaInicio, @Param("fechaFin")Date fechaFin);
    
    void eliminarSemestre(@Param("id")int IDnumero);
}
