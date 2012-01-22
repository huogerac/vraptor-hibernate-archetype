package ${packageName}.dao;

import java.util.List;

public interface Dao<T> {
	
	public abstract void adiciona(T model);

	public abstract void atualiza(T model);

	public abstract List<T> lista();

	public abstract T carrega(Long id);

	public abstract void deleta(Long id);

}
