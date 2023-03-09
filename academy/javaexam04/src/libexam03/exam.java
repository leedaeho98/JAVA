package libexam03;

	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;
	import java.util.Set;

	public class exam {
		public static void main(String[] args) {
			
			String datas = "누구나 한번쯤은 사랑에 속고 누구나 한번쯤은 사랑에 울고 그것이 바로 사랑 사랑이야 철부지 어렸을때 사랑을 몰라";
			
			//원하는 단어를 indexOf찾는다. = -1이 나올 때 까지 <= 반복
			//맨처음에는 0부터 그 다음은 찾은 위치 다음부터
		/*	int startPos = 0;
			int resultPos = 0;
			int wordFindCount = 0;
			while( (resultPos = datas.indexOf("사랑",startPos)) != -1) {
				startPos = resultPos + 1;
				wordFindCount = wordFindCount + 1;
			}
			System.out.println("사랑은 총 " + wordFindCount + "개"); */
			
			
			String[] words = datas.split("\\s+");
			Map<String, Integer> wordCountMap = new HashMap<>();
			for(String word : words) {
				int startPos = 0;
				int resultPos = 0;
				int wordFindCount = 0;
				while( (resultPos = datas.indexOf(word,startPos)) != -1) {
					startPos = resultPos + 1;
					wordFindCount = wordFindCount + 1;
				}
				wordCountMap.put(word, wordFindCount);
//				System.out.println(word + " => 개수 : " + wordFindCount);
				
			}
			System.out.println("==========================중복을 제거한 결과==========================");
			System.out.println("먼저 키값 13개를 출력");
			Set<String> keySet = wordCountMap.keySet();
			
			Iterator<String> iter = keySet.iterator();
			while( iter.hasNext()) {
				String wordName = iter.next();
				System.out.println(wordName + " => 개수 : " + wordCountMap.get(wordName));
			}
			
		}
	}
}
