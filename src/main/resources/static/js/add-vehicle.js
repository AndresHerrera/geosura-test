 $(document).ready(function(){
        // click on button submit
        $("#submit").on('click', function(e){
            $.ajax({
                url: '/api/v1/vehicles', // vehicles api
                type : "POST", 
				contentType:"application/json",
                data : JSON.stringify(
				{
					licencePlate:$('#licencePlate').val(),
					latitude:$('#latitude').val(),
					longitude:$('#longitude').val()
				}), 
                success : function(result)
				{
					alert('Vehiculo creado con Exito !!');
					$( '#form' ).each(function(){
						this.reset();
						$('#messages').html('');
					});
                },
                error: function(xhr, resp, text) {
                    console.log(xhr, resp, text);
                }
            })
        });
    });
