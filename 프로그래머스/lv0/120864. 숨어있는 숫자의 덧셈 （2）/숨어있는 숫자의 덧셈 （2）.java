class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
		String[] lines = my_string.split("[a-zA-Z]");
        
		for (int i = 0; i < lines.length; i++) {
			answer += !lines[i].isEmpty() ? Integer.parseInt(lines[i]) : 0;
		}
        
        return answer;
    }
}