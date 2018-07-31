$(document).ready(function() {

	$('form[id="add"]').validate({
		  rules: {
		    id: 'required',
		    name: 'required',
		    description : 'required',
		   
		    linkImage : 'required'
		  },
		  messages: {
			  id: 'the ID is required',
			  name: 'The name is required',
			  description: 'the description is required',
		
			  linkImage :'the link to image is required'
		  },
		  submitHandler: function(form) {
		    form.submit();
		  }
		});
 
});