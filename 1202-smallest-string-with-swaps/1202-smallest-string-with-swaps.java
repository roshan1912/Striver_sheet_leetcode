class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
	int[] root = new int[s.length()];
	int[] rank = new int[s.length()];
	for (int i = 0; i < s.length(); i++) {
		root[i] = i;
		rank[i] = 1;
	}
	for (List<Integer> pair : pairs) {
		union(pair.get(0), pair.get(1), root, rank);
	}

	Map<Integer, PriorityQueue<Character>> adj = new HashMap<>();
	for (int i = 0; i < s.length(); i++) {
		int parent = find(i, root);
		adj.putIfAbsent(parent, new PriorityQueue<>());
		adj.get(parent).offer(s.charAt(i));
	}

	int n = s.length();
	StringBuilder sb = new StringBuilder(n);
	for (int i = 0; i < n; i++) {
		PriorityQueue<Character> chars = adj.get(find(i, root));
		sb.append(chars.poll());
	}

	return sb.toString();
}

private int find(int v, int[] root) {
	if (root[v] == v) return v;
	return root[v] = find(root[v], root);
}

private void union(int v1, int v2, int[] root, int[] rank) {
	int r1 = find(v1, root);
	int r2 = find(v2, root);
	if (r1 == r2) return;
	if (rank[r1] > rank[r2]) {
		root[r2] = r1;
		rank[r1] += rank[r2];
	} else {
		root[r1] = r2;
		rank[r2] += rank[r1];
	}
}
}