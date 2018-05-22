package Mappers;
import org.apache.ibatis.annotations.Param;

/**
 *Mapper de tema asesoria
 * @author 666 Industries
 */
public interface TemaAsesoriaMapper {
    
    /**
     * Agrega un tema a una asesoria
     * @param idAsesoria ID de la asesoria
     * @param idTema Id del tema
     */
    void agregarTemaAAsesoria(@Param("idAsesoria")int idAsesoria,@Param("idTema") int idTema);
}
