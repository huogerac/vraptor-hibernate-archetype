<%@ include file="/header.jsp" %>

	<h1>Produto</h1>
	
	<form action="<c:url value="/produtos"/>" method="POST">
		<fieldset>
			<legend>Adicionar produto</legend>
			
			<label for="nome">Nome:</label>
			<input id="nome" type="text" name="produto.nome" />
			
			<label for="descricao"">Descricao:</label>
			<input id="descricao"" type="text" name="produto.descricao" />

			<label for="preco">Preco:</label>
			<input id="preco" type="text" name="produto.preco" />
			
			<button type="submit">Enviar</button>
		
		</fieldset>
	</form>

<%@ include file="/footer.jsp" %>