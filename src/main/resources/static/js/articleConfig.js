/**
 * article page js
 */

function articleConfig(){
	
	var self=this;
	var myTable;

	this.init=function(){
		
		myTable=$('#processList').DataTable({
			 "processing": true,
			 "ordering": false,
			 "searching":false,
		     "serverSide": true,
		     "ajax": {
		        "url":"listProcess"
			 },
		     "dataType":"json",
		     "aLengthMenu": [10, 20, 30],
		     "columns": [
		                {"data": "name"},
		                {"data": "version"},
		                {"data": "resourceName"},
		                {"data": "diagramResourceName"},
		                {"data": "c","render":function( data, type, row ) {
		                	return '<input class="btn radius btn-warning" type="button" value="删除">';
		                }}
		              ]
		});
		
	}
	
	self.init();
	
}
