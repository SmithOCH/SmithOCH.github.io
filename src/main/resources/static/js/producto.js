$('body').on('click', '.editarProducto', function(){
	$('#id').val($(this).attr('id'));
	document.getElementById("categoria.id").value = $(this).attr('param1');
	$('#nombre').val($(this).attr('param2'));
	$('#descripcion').val($(this).attr('param3'));
	$('#marca').val($(this).attr('param4'));
	$('#precio').val($(this).attr('param5'));
	$('#cantidad').val($(this).attr('param6'));
	$('#talla').val($(this).attr('param7'));
	$('#color').val($(this).attr('param8'));
	$('#imagen').val($(this).attr('param9'));
	var myModal = new bootstrap.Modal(document.getElementById('formularioProducto'), {
		keyboard: false
	});
	var modalToggle = document.getElementById('formularioModal')
	myModal.show(modalToggle);
});

$("#btnNuevo").click(function(){
	$('#id').val('');
	document.getElementById("categoria.id").value='';
	$('#nombre').val('');
	$('#descripcion').val('');
	$('#marca').val('');
	$('#precio').val('');
	$('#cantidad').val('');
	$('#talla').val('');
	$('#color').val('');
	$('#imagen').val('');
	
})