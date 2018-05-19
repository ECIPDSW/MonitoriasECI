/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mappers;
import org.apache.ibatis.annotations.Param;
/**
 *
 * @author martincantorurrego
 */
public interface TemaAsesoriaMapper {
    void agregarTemaAAsesoria(@Param("idAsesoria")int idAsesoria,@Param("idTema") int idTema);
}
