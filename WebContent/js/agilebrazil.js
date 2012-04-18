
function checkSimilarity(field) {
	var confirmation = $("#" + field + "Confirmation");
	if (confirmation.val() != $("#" + field).val()) {
		confirmation.css({background: "#FFBBBB"});
	} else {
		confirmation.css({background: "#FFFFFF"});
	}
}

function trim(field) {
	field.val.replace(/^\s+|\s+$/g, "");
}