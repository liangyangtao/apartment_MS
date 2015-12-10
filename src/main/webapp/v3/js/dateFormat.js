function dateFormat(paramDateType) {
		if (paramDateType.time == null) {
			return '';
		} else {
			var date = new Date(paramDateType.time);
			var year = date.getFullYear();
			var month = date.getUTCMonth() + 1;
			if (month < 10) {
				month = "0" + month;
			}
			var day = date.getDate();
			if (day < 10) {
				day = "0" + day;
			}
			var hours = date.getHours();
			if (hours < 10) {
				hours = "0" + hours;
			}
			var minutes = date.getMinutes();
			if (minutes < 10) {
				minutes = "0" + minutes;
			}
			var seconds = date.getSeconds();
			if (seconds < 10) {
				seconds = "0" + seconds;
			}
			var result = year + "-" + month + "-" + day + " " + hours + ":"
					+ minutes + ":" + seconds;
			return result;
		}
	}


