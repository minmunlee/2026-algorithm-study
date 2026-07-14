import java.util.*;

class Mun {
    public int[] solution(String[] gems) {
        HashSet<String> set = new HashSet<String>(Arrays.asList(gems));
        int max = set.size();
        
        int[] answer = new int[2];
        int start = 0;
        
        Map<String, Integer> map = new HashMap<>();
        boolean[] startGem = new boolean[gems.length];
        
        int minLen = gems.length + 1;
        int total = 0;
        for(int i=0;i<gems.length;i++) {
            startGem[i] = true;
            if(map.containsKey(gems[i])) {
                startGem[map.get(gems[i])] = false;
            } else {
                total++;
            }
            map.put(gems[i], i);
            
            while(!startGem[start]) {
                start++;
            }
            
            int len = i - start + 1;
            if(total == max && len < minLen) {
                minLen = len;
                answer[0] = start + 1;
                answer[1] = i + 1;
            }
            
        }
        return answer;
    }
}