/**
 * 
 */
function chkText() {
	var str = document.getElementById('inp1').value;
	var date = document.getElementById('inp2').value;
	var alt;
	if(date == "") {
		alt="日付が入力されていません。";
	}
	if(str.length < 1) {
		alt="タスク名が入力されていません。";
	}
	if(date == "" && str.length < 1) {
		alt="タスク名と日付が入力されていません。";
	}
	alert(alt);
}