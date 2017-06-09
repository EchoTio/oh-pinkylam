var monthNames = ["01", "02", "03", "04", "05", "06",
    "07", "08", "09", "10", "11", "12"
];
var dayNames = ["星期天", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六 "]

var newDate = new Date();
newDate.setDate(newDate.getDate());
$('#Date').html(newDate.getFullYear()+"-"+monthNames[newDate.getMonth()]+"-"+(newDate.getDate()>10?newDate.getDate():"0"+newDate.getDate())+" "+dayNames[newDate.getDay()]);
