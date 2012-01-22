<%@ include file="/header.jsp" %>

<h1>Produtos</h1>
<table>
	<c:forEach var="produto" items="${produtoList}">
		<tr>
			<td>${produto.nome}</td>
			<td>${produto.descricao}</td>
			<td>${produto.preco}</td>
			<td>
				<a href="<c:url value="/produtos/${produto.id}"/>">Editar</a>
			</td>
			<td>
				<form action="<c:url value="/produtos/${produto.id}"/>" method="POST">
					<button class="link" name="_method" value="DELETE">Remover</button>
				</form>
			</td>
		</tr>
	</c:forEach>
</table>

<%@ include file="/footer.jsp" %>