$('body').on('click', '.editarCliente', function(){
	$('#id').val($(this).attr('id'));
	$('#nombres').val($(this).attr('param1'));
	$('#priapellido').val($(this).attr('param2'));
	$('#seapellido').val($(this).attr('param3'));
	$('#genero').val($(this).attr('param4'));
	$('#celular').val($(this).attr('param5'));
	var myModal = new bootstrap.Modal(document.getElementById('formularioCliente'), {
		keyboard: false
	});
	var modalToggle = document.getElementById('formularioModal')
	myModal.show(modalToggle);
});
$("#btnNuev").click(function(){
	$('#id').val('');
	$('#nombres').val('');
	$('#priapellido').val('');
	$('#seapellido').val('');
	$('#genero').val('');
	$('#celular').val('');
	
})
