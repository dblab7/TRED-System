package collect;

public class LocationFilter {
	/*
	static String[] state = {"서울","대전","대구","부산","인천","광주","울산","전라북도","전라남도","충청북도","충청남도","경기도","강원도","경상북도","경상남도","제주"}; // 전국 state
	static String[] check_state = {"서울","대전","대구","부산","인천","광주","울산","전라도","전북","전남","충청도","충북","충남","경기도","강원도","경상도","경북","경남","제주도"}; //전국 state에 대한 표현

	static String[][] county = {{"종로","용산","성동","광진","동대문","중랑","성북","강북","도봉","노원","은평","서대문","마포","양천","강서","구로","금천","영등포","동작","관악","서초","강남","송파","강동"}, //서울
		{"유성","대덕"}, //대전
		{"수성", "달서", "달성"}, //대구
		{"영도","부산진","동래","해운대","사하","금정","강서","연제","수영","사상","기장"}, //부산
		{"연수", "남동", "부평", "계양", "강화", "옹진"}, //인천
		{"광산"}, //광주
		{"울주"}, //울산
		{"전주", "완산", "덕진", "군산", "익산", "정읍", "남원", "김제", "완주", "진안", "무주", "장수", "임실", "순창", "고창", "부안"}, //전라북도
		{"목포","여수","순천","나주","광양","담양","곡성","구례","고흥","보성","화순","장흥","강진","해남","영암","무안","함평","영광","장성","완도","진도","신안"}, //전라남도
		{"청주","상당","흥덕","충주","제천","청원","보은","옥천","영동","진천","괴산","음성","단양","증평"}, //충청북도
		{"천안","공주","보령","아산","서산","논산","계룡","금산","연기","부여","서천","청양","홍성","예산","태안","당진"}, //충청남도
		{"수원","장안","권선","팔달","영통","성남","수정","중원","분당","의정부","안양","만안","동안","부천","원미","소사","오정","광명","평택","동두천","안산","상록","단원","고양","덕양","일산동구","일산서구","과천","구리","남양주","오산","시흥","군포","의왕","하남","용인","처인","기흥","수지","파주","이천","안성","김포","화성","광주","양주","포천","여주","연천","가평","양평"},//경기도
		{"춘천","원주","강릉","동해","태백","속초","삼척","홍천","횡성","영월","평창","정선","철원","화천","양구","인제","고성","양양"},//강원도
		{"포항","경주","김천","안동","구미","영주","영천","상주","문경","경산","군위","의성","청송","영양","영덕","청도","고령","성주","칠곡","예군","봉화","울진","울릉"}, //경상북도
		{"창원","마산","진주","진해","통영","사천","김해","밀양","거제","양산","의령","함안","창녕","고성","남해","하동","산청","함양","거창","합천"}, //경상남도
		{"제주시","서귀포시","북제주군","남제주군"} //제주
	};

	static String[][] subwayStation = {
		{"가능", "가락시장", "가산디지털단지", "가양", "가좌", "가천대", "가평", "간석", "간석오거리", "갈매", "갈산", "강남", "강남구청", "강동", "강동구청", "강변", "강촌", "개롱", 
			"개봉", "개포동", "개화", "개화산", "거여", "건대입구", "검암", "경마공원", "경복궁", "경인교대입구", "경찰병원", "계산", "계양", "고덕", "고려대", "고속터미널", "고잔", 
			"곡산", "공덕", "공릉", "공항시장", "공항화물청사", "과천", "관악", "광나루", "광명", "광명사거리", "광운대", "광화문", "광흥창", "교대", "구로", "구로디지털단지", "구룡", 
			"구리", "구반포", "구산", "구성", "구의", "구일", "구파발", "국수", "국제업무지구", "국회의사당", "군자", "군포", "굴봉산", "굴포천", "굽은다리", "귤현", "금곡", "금릉", "금정", 
			"금천구청", "금촌", "금호", "기흥", "길동", "길음", "김유정", "김포공항", "까치산", "까치울", "낙성대", "남구로", "남동인더스파크", "남부터미널", "남성", "남영", "남춘천", "남태령", 
			"남한산성입구", "내방", "노들", "노량진", "노량진(9호선)", "노원", "녹번", "녹사평", "녹양", "녹천", "논현", "능곡", "단대오거리", "답십리", "당고개", "당산", "당정", "대곡", 
			"대공원", "대림", "대모산입구", "대방", "대성리", "대야미", "대청", "대치", "대화", "대흥", "덕계", "덕소", "덕정", "도곡", "도농", "도림천", "도봉", "도봉산", "도심", "도원", 
			"도화", "독립문", "독바위", "독산", "돌곶이", "동대문", "동대문역사문화공원", "동대입구", "동두천", "동두천중앙", "동막", "동묘앞", "동수", "동암", "동인천", "동작", "동춘", 
			"두정", "둔촌동", "등촌", "디지털미디어시티", "뚝섬", "뚝섬유원지", "마곡", "마곡나루", "마두", "마들", "마석", "마장", "마전(무정차)", "마천", "마포", "마포구청", "망우", "망원", 
			"망월사", "망포", "매교", "매봉", "매탄권선", "먹골", "면목", "명동", "명일", "명학", "모란", "목동", "몽촌토성", "무악재", "문래", "문산", "문정", "문학경기장", "미금", "미아", 
			"미아삼거리", "박촌", "반월", "반포", "발산", "방배", "방이", "방학", "방화", "배방", "백마", "백석", "백양리", "백운", "버티고개", "범계", "별내", "병점", "보라매", "보문", "보산", 
			"보정", "복정", "봉명", "봉천", "봉화산", "부개", "부천", "부천시청", "부천종합운동장", "부평", "부평구청", "부평삼거리", "부평시장", "불광", "사가정", "사당", "사릉", "사평", "산본", 
			"산성", "삼각지", "삼산체육관", "삼성", "삼송", "상갈", "상계", "상도", "상동", "상록수", "상봉", "상수", "상왕십리", "상월곡", "상일동", "상천", "새절", "샛강", "서강", "서대문", 
			"서동탄", "서빙고", "서울", "서울(경의선)", "서울(공항철도)", "서울대입구", "서울숲", "서정리", "서초", "서현", "석계", "석수", "석촌", "선릉", "선바위", "선유도", "선정릉", "선학", 
			"성균관대", "성수", "성신여대입구", "성환", "세류", "세마", "센트럴파크", "소래포구", "소사", "소요산", "송내", "송도", "송정", "송탄", "송파", "수내", "수락산", "수리산", "수색", 
			"수서", "수원", "수원시청", "수유", "수진", "숙대입구", "숭실대입구", "시청", "신갈", "신금호", "신길", "신길온천", "신논현", "신답", "신당", "신대방", "신대방삼거리", "신도림", 
			"신림", "신목동", "신반포", "신방화", "신사", "신설동", "신연수", "신용산", "신원", "신이문", "신정", "신정네거리", "신중동", "신창", "신천", "신촌", "신촌(경의선)", "신풍", "신흥", 
			"쌍문", "쌍용(나사렛대)", "아산", "아신", "아차산", "아현", "안국", "안산", "안암", "안양", "암사", "압구정", "압구정로데오", "애오개", "야탑", "약수", "양수", "양원", "양재", 
			"양재시민의숲", "양정", "양주", "양천구청", "양천향교", "양평", "양평(중앙선)", "어린이대공원", "여의나루", "여의도", "역곡", "역삼", "역촌", "연수", "연신내", "염창", "영등포", 
			"영등포구청", "영등포시장", "영통", "예술회관", "오금", "오류동", "오리", "오목교", "오빈", "오산", "오산대", "오이도", "옥수", "온수", "온양온천", "올림픽공원", "왕십리", "외대앞", 
			"용답", "용두", "용마산", "용문", "용산", "우장산", "운길산", "운서", "운정", "원당", "원덕", "원인재", "월계", "월곡", "월곶", "월드컵경기장", "월롱", "을지로3가", "을지로4가", 
			"을지로입구", "응봉", "응암", "의왕", "의정부", "이대", "이매", "이촌", "이태원", "인덕원", "인천", "인천국제공항", "인천논현", "인천대입구", "인천시청", "인천터미널", "일산", "일원", 
			"임학", "작전", "잠실", "잠실나루", "잠원", "장승배기", "장암", "장지", "장한평", "정발산", "정부과천청사", "정왕", "정자", "제기동", "제물포", "종각", "종로3가", "종로5가", "종합운동장", 
			"주안", "주엽", "죽전", "중계", "중곡", "중동", "중랑", "중앙", "중화", "증미", "증산", "지식정보단지", "지제", "지축", "지행", "직산", "진위", "창동", "창신", "천마산", "천안", "천왕", "천호", 
			"철산", "청계산입구", "청구", "청담", "청량리", "청명", "청평", "초지", "총신대입구(이수)", "춘의", "춘천", "충무로", "충정로", "캠퍼스타운", "탄현", "탕정", "태릉입구", "태평", "테크노파크",
			"퇴계원", "파주", "판교", "팔당", "평내호평", "평촌", "평택", "풍기", "풍산", "하계", "학동", "학여울", "한강진", "한남", "한대앞", "한성대입구", "한양대", "한티", "합정", "행당", "행신", "혜화",
			"호구포", "홍대입구", "홍제", "화곡", "화랑대", "화서", "화전", "화정", "회기", "회룡", "회현", "효창공원앞", "흑석"}, //수도권 지하철 역
		{"반석", "지족", "노은", "월드컵경기장", "현충원", "구암", "유성온천", "갑천", "월평", "갈마", "정부청사", "시청", "탄방", "용문", "오룡", "서대전네거리", "중구청", "중앙로", "대전역", "대동", "신흥", "판암"},	//대전 지하철 역
		{"대곡(정부대구청사)", "진천", "월배", "상인", "월촌", "송현", "성당못", "대명", "안지랑", "현충로", "영대병원", "교대", "명덕(2.28민주운동기념회관)", "반월당", "중앙로", "대구역", "칠성시장", "신천(경북대입구)", "동대구", "큰고개", "아양교", "동촌", "해안", "방촌", "용계", "율하", "신기", "반야월", "각산", "안심",
			"문양", "다사", "대실", "강창", "계명대", "성서산업단지", "이곡", "용산(서부법원,검찰청입구)", "죽전", "감삼", "두류", "내당", "반고개", "서문시장", "경대병원", "대구은행", "범어", "수성구청", "만촌", "담티(수성대,대륜)", "연호", "대공원", "고산", "신매", "사월", "정평", "임당", "영남대"},	//대구 지하철 역
		{"신평", "하단", "당리", "사하", "괴정", "대티", "서대신", "동대신", "토성", "자갈치", "남포", "중앙", "부산역", "초량", "좌천", "범일", "범내골", "서면", "부전", "양정", "시청", "연산", "교대", "동래", "명륜", "온천장", "부산대", "장전", "구서", "두실", "남산", "범어사", "노포", 
			"장산", "중동", "해운대", "동백", "시립미술관", "센텀시티", "민락", "수영", "광안", "금련산", "남천", "경성대,부경대", "대연", "못골", "지게골", "문현", "문전", "전포", "서면", "부암", "가야", "동의대", "개금", "냉정", "주례", "감전", "사상", "덕포", "모덕", "모라", "구남", "구명", "덕천", "수정", "화명", "율리", "동원", "금곡", "호포", "부산대양산캠퍼스", "남양산", "양산",
			"수영", "망미", "배산", "물만골", "연산", "거제", "종합운동장", "사직", "미남", "숙등", "덕천", "구포", "강서구청", "체육공원", "대저",
			"미남", "동래", "낙민", "충렬사", "명장", "서동", "금사", "반여농산물시장", "석대", "영산대", "동부산대학", "고촌", "안평"},	//부산 지하철 역
		{"평동", "도산", "광주송정", "송정공원", "공항", "김대중컨벤션센터", "상무", "운천", "쌍촌", "화정", "농성", "돌고개", "양동시장", "금남로5가", "금남로4가", "문화전당", "남광주", "학동,증심사입구", "소태", "녹동"}	//광주 지하철 역
		};
	 */

	static String[] state = {"서울","대전","대구","부산","인천","광주","울산","전라북도","전라남도","충청북도","충청남도","경기도","강원도","경상북도","경상남도","제주"}; // 전국 state
	static String[] check_state = {"서울","대전","대구","부산","인천","광주","울산","전라도","전북","전남","충청도","충북","충남","경기도","강원도","경상도","경북","경남","제주도"}; //전국 state에 대한 표현

	static String[][] county = {{"종로","용산","성동","광진","동대문","중랑","성북","강북","도봉","노원","은평","서대문","마포","양천","강서","구로","금천","영등포","동작","관악","서초","강남","송파","강동"}, //서울
		{"유성","대덕"}, //대전
		{"수성", "달서", "달성"}, //대구
		{"영도","부산진","동래","해운대","사하","금정","강서","연제","수영","사상","기장"}, //부산
		{"연수", "남동", "부평", "계양", "강화", "옹진"}, //인천
		{"광산"}, //광주
		{"울주"}, //울산
		{"전주", "완산", "덕진", "군산", "익산", "정읍", "남원", "김제", "완주", "진안", "무주", "장수", "임실", "순창", "고창", "부안"}, //전라북도
		{"목포","여수","순천","나주","광양","담양","곡성","구례","고흥","보성","화순","장흥","강진","해남","영암","무안","함평","영광","장성","완도","진도","신안"}, //전라남도
		{"청주","상당","흥덕","충주","제천","청원","보은","옥천","영동","진천","괴산","음성","단양","증평"}, //충청북도
		{"천안","공주","보령","아산","서산","논산","계룡","금산","연기","부여","서천","청양","홍성","예산","태안","당진"}, //충청남도
		{"수원","장안","권선","팔달","영통","성남","수정","중원","분당","의정부","안양","만안","동안","부천","원미","소사","오정","광명","평택","동두천","안산","상록","단원","고양","덕양","일산동구","일산서구","과천","구리","남양주","오산","시흥","군포","의왕","하남","용인","처인","기흥","수지","파주","이천","안성","김포","화성","광주","양주","포천","여주","연천","가평","양평"},//경기도
		{"춘천","원주","강릉","동해","태백","속초","삼척","홍천","횡성","영월","평창","정선","철원","화천","양구","인제","고성","양양"},//강원도
		{"포항","경주","김천","안동","구미","영주","영천","상주","문경","경산","군위","의성","청송","영양","영덕","청도","고령","성주","칠곡","예군","봉화","울진","울릉"}, //경상북도
		{"창원","마산","진주","진해","통영","사천","김해","밀양","거제","양산","의령","함안","창녕","고성","남해","하동","산청","함양","거창","합천"}, //경상남도
		{"제주시","서귀포시","북제주군","남제주군"} //제주
	};

	static String[][] subwayStation = {
		{"가능역","개봉역","곡산역","구리역","금천구청역","남한산성입구역","대공원역","도화역","두정역","망월사역","미아삼거리역","보정역","산성역","서동탄역","성균관대역","수서역","신림역","쌍문역","양재시민의숲역","영등포구청역","용답역","을지로입구역","임학역","주안역","철산역","퇴계원역","호구포역","가락시장역","개포동역","공덕역","구반포역","금촌역","내방역","대림역","독립문역","둔촌동역",
			"망포역","박촌역","복정역","삼각지역","서빙고역","성수역","수원역","신목동역","나사렛대역","양정역","영등포시장역","용두역","응봉역","작전역","주엽역","청계산입구역","파주역","홍대입구역","가산디지털단지역","개화역","공릉역","구산역","금호역","노들역","대모산입구역","독바위역","등촌역","매교역","반월역","봉명역","삼산체육관역","서울역","성신여대입구역","수원시청역","신반포역","아산역",
			"양주역","영통역","용마산역","응암역","잠실역","죽전역","청구역","판교역","홍제역","가양역","개화산역","공항시장역","구성역","기흥역","노량진역","대방역","독산역","디지털미디어시티역","매봉역","반포역","봉천역","삼성역","경의선역","성환역","수유역","신방화역","아신역","양천구청역","예술회관역","용문역","의왕역","잠실나루역","중계역","청담역","팔당역","화곡역","가좌역","거여역","공항화물청사역",
			"구의역","길동역","노량진역","대성리역","돌곶이역","뚝섬역","매탄권선역","발산역","봉화산역","삼송역","공항철도역","세류역","수진역","신사역","아차산역","양천향교역","오금역","용산역","의정부역","잠원역","중곡역","청량리역","평내호평역","화랑대역","가천대역","건대입구역","과천역","구일역","길음역","노원역","대야미역","동대문역","뚝섬유원지역","먹골역","방배역","부개역","상갈역","서울대입구역","세마역",
			"숙대입구역","신설동역","아현역","양평역","오류동역","우장산역","이대역","장승배기역","중동역","청명역","평촌역","화서역","쌍용역","가평역","검암역","관악역","구파발역","김유정역","녹번역","대청역","동대문역사문화공원역","마곡역","면목역","방이역","부천역","상계역","서울숲역","센트럴파크역","숭실대입구역","신연수역","안국역","오리역","운길산역","이매역","장암역","중랑역","청평역","평택역","화전역",
			"간석역","경마공원역","광나루역","국수역","김포공항역","녹사평역","대치역","동대입구역","마곡나루역","명동역", "방학역","부천시청역","상도역","서정리역","소래포구역","시청역","신용산역","안산역","어린이대공원역","오목교역","운서역","이촌역","장지역","중앙역","초지역","풍기역","화정역","간석오거리역","경복궁역","광명역","국제업무지구역","까치산역","녹양역","대화역","동두천역","마두역","명일역","방화역",
			"부천종합운동장역","상동역","서초역","소사역","신갈역","신원역","안암역","여의나루역","오빈역","운정역","이태원역","장한평역","중화역","이수역","총신대입구역","풍산역","회기역","갈매역","경인교대입구역","광명사거리역","국회의사당역","까치울역","녹천역","대흥역","동두천중앙역","마들역","명학역","배방역","부평역","상록수역","서현역","소요산역","신금호역","신이문역","안양역","여의도역","오산역","원당역","인덕원역",
			"정발산역","증미역","춘의역","하계역","회룡역","갈산역","경찰병원역","광운대역","군자역","낙성대역","논현역","덕계역","동막역","마석역","모란역","백마역","부평구청역","상봉역","석계역","송내역","신길역","신정역","암사역","역곡역","오산대역","원덕역","인천역","정부과천청사역","증산역","춘천역","학동역","회현역","강남역","계산역","광화문역","군포역","남구로역","능곡역","덕소역","동묘앞역","마장역","목동역","백석역",
			"부평삼거리역","상수역","석수역","송도역","신길온천역","신정네거리역","압구정역","역삼역","오이도역","원인재역","인천국제공항역","정왕역","지식정보단지역","충무로역","학여울역","효창공원앞역","강남구청역","계양역","광흥창역","굴봉산역","남동인더스파크역","단대오거리역","덕정역","동수역","마전역","몽촌토성역","백양리역","부평시장역","상왕십리역","석촌역","송정역","신논현역","신중동역","압구정로데오역","역촌역","옥수역","월계역",
			"인천논현역","정자역","지제역","충정로역","한강진역","흑석역","강동역","고덕역","교대역","굴포천역","남부터미널역","답십리역","도곡역","동암역","마천역","무악재역","백운역","불광역","상월곡역","선릉역","송탄역","신답역","신창역","애오개역","연수역","온수역","월곡역","인천대입구역","제기동역","지축역","캠퍼스타운역","한남역","강동구청역","고려대역","구로역","굽은다리역","남성역","당고개역","도농역","동인천역","마포역","문래역","버티고개역",
			"사가정역","상일동역","선바위역","송파역","신당역","신천역","야탑역","연신내역","온양온천역","월곶역", "인천시청역","제물포역","지행역","탄현역","한대앞역","강변역","고속터미널역","구로디지털단지역","귤현역","남영역","당산역","도림천역","동작역","마포구청역","문산역","범계역","사당역","상천역","선유도역","수내역","신대방역","신촌역","약수역","염창역","올림픽공원역","월드컵경기장역","인천터미널역","종각역","직산역","탕정역",
			"한성대입구역","강촌역","고잔역","구룡역","금곡역","남춘천역","당정역","도봉역","동춘역","망우역","문정역","별내역","사릉역","새절역","선정릉역","수락산역","신대방삼거리역","경의선","양수역","영등포역","왕십리역","월롱역","일산역","종로3가역","진위역","태릉입구역","한양대역","개롱역","금릉역","남태령역","대곡역","도봉산역","망원역","문학경기장역","병점역","사평역","샛강역","선학역","수리산역","신도림역","신풍역","양원역",
			"외대앞역","을지로3가역","일원역","종로5가역","창동역","태평역","한티역","금정역","도심역","미금역","보라매역","산본역","서강역","수색역","신흥역","양재역","을지로4가역","종합운동장역","창신역","테크노파크역","합정역","도원역","미아역","보문역","서대문역","천마산역","행당역","보산역","천안역","행신역","천왕역","혜화역","천호역"
		}, //수도권 지하철 역
		{"반석역", "지족역", "노은역", "월드컵경기장역", "현충원역", "구암역", "유성온천역", "갑천역", "월평역", "갈마역", "정부청사역", "시청역", "탄방역", "용문역", "오룡역", "서대전네거리역", "중구청역", "중앙로역", "대전역", "대동역", "신흥역", "판암역"},	//대전 지하철 역
		{"대곡역","정부대구청사역", "진천역", "월배역", "상인역", "월촌역", "송현역", "성당못역", "대명역", "안지랑역", "현충로역", "영대병원역", "교대역", "명덕역)", "반월당역", "중앙로역", "대구역", "칠성시장역", "신천역","경북대입구역", "동대구역", "큰고개역", "아양교역", "동촌역", "해안역", "방촌역", "용계역", "율하역", "신기역", "반야월역", "각산역", "안심역",
			"문양역", "다사역", "대실역", "강창역", "계명대역", "성서산업단지역", "이곡역", "용산(서부법원,검찰청입구)", "죽전역", "감삼역", "두류역", "내당역", "반고개역", "서문시장역", "경대병원역", "대구은행역", "범어역", "수성구청역", "만촌역", "담티역", "연호역", "대공원역", "고산역", "신매역", "사월역", "정평역", "임당역", "영남대역"},	//대구 지하철 역
			{"신평역", "하단역", "당리역", "사하", "괴정역", "대티역", "서대신역", "동대신역", "토성역", "자갈치역", "남포역", "중앙역", "부산역", "초량역", "좌천역", "범일역", "범내골역", "서면역", "부전역", "양정역", "시청역", "연산역", "교대역", "동래역", "명륜역", "온천장역", "부산대역", "장전역", "구서역", "두실역", "남산역", "범어사역", "노포역", 
				"장산역", "중동역", "해운대역", "동백역", "시립미술관역", "센텀시티역", "민락역", "수영역", "광안역", "금련산역", "남천역", "경성대역","부경대역", "대연역", "못골역", "지게골역", "문현역", "문전역", "전포역", "서면역", "부암역", "가야역", "동의대역", "개금역", "냉정역", "주례역", "감전역", "사상역", "덕포역", "모덕역", "모라역", "구남역", "구명역", "덕천역", "수정역", "화명역", "율리역", "동원역", "금곡역", "호포역", "부산대양산캠퍼스역", "남양산역", "양산역",
				"수영역", "망미역", "배산역", "물만골역", "연산역", "거제역", "종합운동장역", "사직역", "미남역", "숙등역", "덕천역", "구포역", "강서구청역", "체육공원역", "대저역",
				"미남역", "동래역", "낙민역", "충렬사역", "명장역", "서동역", "금사역", "반여농산물시장역", "석대역", "영산대역", "동부산대학역", "고촌역", "안평역"},	//부산 지하철 역
				{"평동역", "도산역", "광주송정역", "송정공원역", "공항역", "김대중컨벤션센터역", "상무역", "운천역", "쌍촌역", "화정역", "농성역", "돌고개역", "양동시장역", "금남로5가역", "금남로4가역", "문화전당역", "남광주역", "학동역","증심사입구역", "소태역", "녹동역"}	//광주 지하철 역
	};


	public static String main(String analyzedTweet) {		//지역명 포함한것만 필터링

		String city = "/";

		boolean flag = false;
		for(int s=0; s<state.length; s++) {
			if(locationNameFilter(analyzedTweet, state[s])) {			
				city = state[s];
				flag = true;
				break;
			}
		}

		if(flag==false) {
			for(int cs=0; cs<check_state.length; cs++) {
				if(locationNameFilter(analyzedTweet, check_state[cs])) {
					city = check_state[cs];
					break;
				}
			}
		}

		for(int c=0; c<county.length; c++) {
			for(int c2=0; c2<county[c].length; c2++) {
				if(locationNameFilter(analyzedTweet, county[c][c2])) {
					city = county[c][c2];
					//city = city + "\n" + county[c][c2];
					break;
				}
			}			
		}	

		for(int ss=0; ss<subwayStation.length; ss++) {
			for(int ss2=0; ss2<subwayStation[ss].length; ss2++) {
				if(locationNameFilter(analyzedTweet, subwayStation[ss][ss2])) {
					city = subwayStation[ss][ss2];
					//city = city + "\n" + county[c][c2];
					break;
				}
			}
		}

		analyzedTweet = city + "/"+ analyzedTweet;

		return analyzedTweet;					

	}

	public static boolean locationNameFilter(String analyzedTweet, String city) {

		for(int aT = 0; aT<analyzedTweet.length()-1; aT++) {
			if(analyzedTweet.charAt(aT) == '/') {

				if(analyzedTweet.substring(aT+1, analyzedTweet.indexOf("/", aT+1)).equalsIgnoreCase(city))
					return true;
			}
		}
		return false;	

	}
}