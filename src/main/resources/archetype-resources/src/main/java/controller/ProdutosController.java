package ${packageName}.controller;

import java.util.List;

import ${packageName}.dao.Dao;
import ${packageName}.dao.ProdutoDao;
import ${packageName}.model.Produto;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class ProdutosController {
	
	private Result result;
	private Dao<Produto> dao;
	
	public ProdutosController(Result result, ProdutoDao dao) {
		this.result = result;
		this.dao = dao;
	}
	
	@Get @Path("/produtos/novo")
	public void formulario() {
	}
	
	@Get @Path("/produtos/{id}")
	public Produto edita(Long id) {
		return dao.carrega(id);		
	}
	
	@Put @Path("/produtos/{produto.id}")
	public void altera(Produto produto) {
		dao.atualiza(produto);
		result.redirectTo(ProdutosController.class).lista();
	}

	@Post @Path("/produtos")
	public void adiciona(final Produto produto) {
		dao.adiciona(produto);
		result.redirectTo(ProdutosController.class).lista();
	}
	
	@Delete @Path("/produtos/{id}")
	public void remove(Long id) {
		dao.deleta(id);
		result.redirectTo(ProdutosController.class).lista();
	}	
	
	@Get @Path("/produtos")
	public List<Produto> lista() {
		return dao.lista();
	}
	

}
