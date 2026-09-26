class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++)
        {
            freq[s.charAt(i)-'a'] = i;
        }

        List<Integer> result = new ArrayList<>();
        int end = 0;
        int start = 0;
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);

            end = Math.max(freq[c-'a'], end);

            if(end == i)
            {
                if(result.isEmpty())
                    result.add(end+1);
                else
                    result.add(end - start + 1);
                start += result.get(result.size()-1);
            }
        }

        return result;
    }
}