$('body').on('click', '.editarCategoria', function(){
	$('#id').val($(this).attr('id'));
	$('#nombre').val($(this).attr('param1'));
	$('#descripcion').val($(this).attr('param2'));
	var myModal = new bootstrap.Modal(document.getElementById('formularioCategoria'), {
		keyboard: false
	});
	var modalToggle = document.getElementById('formularioModal')
	myModal.show(modalToggle);
});
$("#btnNueva").click(function(){
	$('#id').val('');
	$('#nombre').val('');
	$('#descripcion').val('');
	
})

