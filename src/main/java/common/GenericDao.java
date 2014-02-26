package common;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;

public class GenericDao<T, ID extends Serializable> {
	
	private final Session session;
	private final Class<T> oClass;
	
	@SuppressWarnings("unchecked")
	public GenericDao(Session session) {
		this.session = session;
		this.oClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	protected Session getSession() {
		return session;
	}
	
	public void save(T model) {
		session.save(model);
	}

	@SuppressWarnings("unchecked")
	public T load(ID id) {
		return (T) this.session.load(oClass, id);
	}

	public void update(T model) {
		this.session.update(model);
	}

	public void delete(T model) {
		this.session.delete(model);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> listAll() {
		return this.session.createCriteria(oClass).list();
	}
	
}
