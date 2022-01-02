$('body').on('click', '.editarFactura', function(){
	$('#id').val($(this).attr('id'));
	document.getElementById("cliente.id").value = $(this).attr('param1');
	$('#descripcion').val($(this).attr('param2'));
	$('#observaciones').val($(this).attr('param3'));
	var myModal = new bootstrap.Modal(document.getElementById('formularioFactura'), {
		keyboard: false
	});
	var modalToggle = document.getElementById('formularioModal')
	myModal.show(modalToggle);
});

$("#btnNuevo").click(function(){
	$('#id').val('');
	document.getElementById("cliente.id").value='';
	$('#descripcion').val('');
	$('#observaciones').val('');
	
})