class Pair {
    int freq;
    String word;

    Pair(int freq, String word) {
        this.freq = freq;
        this.word = word;
    }
}

class Solution {

    public List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a.freq != b.freq)
                    return a.freq - b.freq; // min heap by frequency

                return b.word.compareTo(a.word); // reverse lexicographical
            }
        );

        for (String key : map.keySet()) {

            pq.offer(new Pair(map.get(key), key));

            if (pq.size() > k)
                pq.poll();
        }

        List<String> res = new ArrayList<>();

        while (!pq.isEmpty()) {
            res.add(pq.poll().word);
        }

        Collections.reverse(res);

        return res;
    }
}