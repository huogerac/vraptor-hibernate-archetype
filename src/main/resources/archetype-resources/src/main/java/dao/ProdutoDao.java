package ${packageName}.dao;

import java.util.List;

import org.hibernate.Session;

import ${packageName}.model.Produto;
import br.com.caelum.vraptor.ioc.Component;

@Component
public class ProdutoDao implements Dao<Produto> {
	
	private final Session session;
	
	/**
	 * Creates a new UserDao. You can receive dependencies through constructor,
	 * because this class is annotated with @Component. This class can be used
	 * as dependency of another class, as well.
	 * @param session Hibernate's Session.
	 */	
	public ProdutoDao(Session session) {
		this.session = session;
	}
	
	public void adiciona(Produto produto) {
		session.save(produto);
	}

	public void atualiza(Produto produto) {
		session.update(produto);
	}

	@SuppressWarnings("unchecked")
	public List<Produto> lista() {
		List<Produto> result = this.session.createCriteria(Produto.class).list(); 
		return result;
	}

	public Produto carrega(Long id) {
		Produto result = (Produto) this.session.load(Produto.class, id);
		return result;
	}

	public void deleta(Long id) {
		Produto produto = this.carrega(id);
		session.delete(produto);
	}

}
