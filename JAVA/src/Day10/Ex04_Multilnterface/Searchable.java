package Day10.Ex04_Multilnterface;
// 검색 인터페이스
public interface Searchable {
	// 채널 검색 : 검색어에 해당하는 채널 번호를 반환
	int channelSearch(String ketword);
	
	// 컨텐츠 검색 : 검색어에 해당하는 컨텐츠를 반환
	String[] contentSearch(String keyword);
}