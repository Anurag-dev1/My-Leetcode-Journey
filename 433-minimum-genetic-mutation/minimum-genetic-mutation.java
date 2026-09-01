class Solution {
    public int minMutation(String start, String end, String[] bank) {
        Set <String> bankset = new HashSet<>(Arrays.asList(bank));
        Set <String> visited = new HashSet<>();
        Queue <String> que = new LinkedList<>();

        que.offer(start);
        visited.add(start);

        int level = 0;
        while(!que.isEmpty()){
            int n = que.size();

            while(n-- > 0){
                String curr = que.poll();

                if(curr.equals(end)){
                    return level;
                }
                
                char[] charSet = new char[]{'A' , 'C', 'G', 'T'};
                for(char ch : charSet){
                    for(int i = 0 ; i < curr.length(); i++){
                        char[] currArray = curr.toCharArray();
                        currArray[i] = ch;
                        String neighbour = new String(currArray);

                        if(!visited.contains(neighbour) && bankset.contains(neighbour)){
                            visited.add(neighbour);
                            que.add(neighbour);
                        }
                    }
                }
            }
            level++;
        }
        return -1;
    }
}