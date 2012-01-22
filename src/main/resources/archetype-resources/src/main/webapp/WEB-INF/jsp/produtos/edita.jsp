<%@ include file="/header.jsp" %>

	<h1>Produto</h1>
	
	<form action="<c:url value="/produtos/${produto.id }"/>" method="POST">
		<fieldset>
			<legend>Editar produto</legend>
			
			<label for="nome">Nome:</label>
			<input id="nome" type="text" name="produto.nome" value="${produto.nome }" />
			
			<label for="descricao"">Descricao:</label>
			<input id="descricao"" type="text" name="produto.descricao" value="${produto.descricao }" />

			<label for="preco">Preco:</label>
			<input id="preco" type="text" name="produto.preco" value="${produto.preco }" />
			
			<button type="submit" name="_method" value="PUT">Enviar</button>
		
		</fieldset>
	</form>

<%@ include file="/footer.jsp" %>