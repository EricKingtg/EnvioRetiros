package t3b.pv.retiros.dao;

import java.sql.Connection;
import java.util.List;

import t3b.pv.retiros.dto.RetirosDto;
import t3b.pv.retiros.dto.TiendaDto;

public interface ConsultasMySql {

	public abstract void setConexion(Connection mysql);
	public abstract List<TiendaDto> getNumTienda();
	public abstract List<RetirosDto> obtieneRetiros(int id);
	public abstract boolean actualizaRetiro(int idRegistro);
	
}
