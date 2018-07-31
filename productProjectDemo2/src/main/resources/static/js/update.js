$(document).ready(function() {
	
	// Do GET all Customers from Back-End with JQUERY AJAX
	$(function () {
		$.ajax({
			type : "GET",
			url :  "products",
			success: function(result){
				$.each(result, function(index, product){
					
					var customerRow = '<tr>' +
										'<td>' + index + '</td>' +
										'<td>' + product.id + '</td>' +
										'<td>' + product.name + '</td>' +
										'<td>' + product.description + '</td>' +
										'<td>' + product.relatedProducts + '</td>'+
										'<td>' + product.linkImage + '</td>' +
								        '<td class="text-center">' +
								        '<form action="/update" method="post">'+
								        	'<input type="hidden" name="id" value=' + product.id + '>' +
								        	'<a>' +
						          				' <input type="submit" value="update">' +
						        			'</a>' +
						        			'</forme>'
								        '</td>' +
									  '</tr>';
					
					$('#customerTable tbody').append(customerRow);
					
		        });
				
				$( "#customerTable tbody tr:odd" ).addClass("info");
				$( "#customerTable tbody tr:even" ).addClass("success");
			},
			error : function(e) {
				alert("ERROR: ", e);
				console.log("ERROR: ", e);
			}
		});	
	});
	
	// Do DELETE a Customer via JQUERY AJAX
	$(document).on("click","a",function() {
		
		var productId = $(this).parent().find('input').val();
		var workingObject = $(this);
		


	});
})