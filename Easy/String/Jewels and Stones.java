class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int ans = 0;
        // HashSet<Character> set = new HashSet<>();

        // for(int i = 0; i < jewels.length(); i++) {
        // set.add(jewels.charAt(i));
        // }

        // for(int i = 0; i < stones.length(); i++) {
        // if(set.contains(stones.charAt(i))) {
        // ans++;
        // }
        // }
        char arr[] = stones.toCharArray();
        for (char e : arr) {
            if (jewels.indexOf(e) != -1) {
                ans++;
            }
        }

        return ans;
    }
}