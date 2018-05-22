package DAOS;

/**
 *DAO de Tema Asesoria
 * @author 666 Industries
 */
public interface TemaAsesoriaDAO {
    
    /**
     * Agrega un tema a una asesoria
     * @param idAsesoria ID de la asesoria
     * @param idTema Id del tema
     */
    void agregarTemaAAsesoria(int idAsesoria, int idTema);
}
