	function infoUpdate(){
		const custname = document.querySelector('[name=custname]');
		const phone = document.querySelector('[name=phone]');
		const address = document.querySelector('[name=address]');
		const joindate = document.querySelector('[name=joindate]');
		const grade = document.querySelector('[name=grade]');
		const city = document.querySelector('[name=city]');
		
		if(custname.value===""){
			alert("회원이름이 입력되지 않았습니다.")
			custname.focus();
			return false;
		}
		if(phone.value===""){
			alert("회원 전화가 입력되지 않았습니다.")
			phone.focus();
			return false;
		}
		if(address.value===""){
			alert("회원주소가 입력되지 않았습니다.")
			address.focus();
			return false;
		}
		if(joindate.value===""){
			alert("가입일자가 입력되지 않았습니다.")
			joindate.focus();
			return false;
		}
		if(grade .value===""){
			alert("고객등급이 입력되지 않았습니다.")
			grade .focus();
			return false;
		}
		if(city.value===""){
			alert("도시코드가 입력되지 않았습니다.")
			city.focus();
			return false;
		}
		alert("회원정보수정이 완료되었습니다.");
		return true;	
		
	}
	function serach(){
		//window.location.href="listSelectUpdate.jsp";
		location.href="listSelectUpdate.jsp";
	}	
	