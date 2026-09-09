class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int i = 0;
        int j = 0;

        int m = players.length;
        int n = trainers.length;

        Arrays.sort(players);
        Arrays.sort(trainers);

        while(i < m && j < n){
            if(players[i] <= trainers[j])
            i++;

            j++;
        }

        return i;
    }
}